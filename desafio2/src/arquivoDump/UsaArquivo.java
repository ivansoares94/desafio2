package arquivoDump;

import java.io.IOException;

public class UsaArquivo {

	public static void main(String[] args) throws IOException, InterruptedException {
		ManipulaArquivo ma = new ManipulaArquivo();
		ma.leitura();
		ma.escrita();
		
	}
}
