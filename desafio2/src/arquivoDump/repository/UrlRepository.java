package arquivoDump.repository;

import arquivoDump.classes.Url;

public interface UrlRepository {
	
	Url findById(String productId);
}
