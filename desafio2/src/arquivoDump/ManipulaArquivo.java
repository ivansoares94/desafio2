package arquivoDump;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import arquivoDump.classes.Url;
import arquivoDump.repository.UrlRepository;



public class ManipulaArquivo {
	
	Url url = new Url();
	UrlRepository urlRepository;



	public void leitura() throws IOException, InterruptedException {
		
		int posicaoHttp, tamanho, posicaoPid;
		String req, pid;

		
		File arquivo = new File("input-dump");
		FileReader fr = new FileReader(arquivo);
		BufferedReader bf = new BufferedReader(fr);
		String linha = bf.readLine();
		Map<String,Url> lista = new HashMap<>();

		while ((linha = bf.readLine()) != null) {
			
			posicaoHttp = linha.indexOf("http:");
			tamanho = linha.length() - 2;
			req = linha.substring(posicaoHttp, tamanho);


		      URL teste = new URL(req);
		      HttpURLConnection connection = (HttpURLConnection)teste.openConnection();
		      connection.setRequestMethod("GET");
		      connection.connect();

		      int code = connection.getResponseCode();

		      if(code == 200)	{
		    	  
		    	  
		    	posicaoPid = linha.indexOf("pid");
		    	pid = linha.substring(posicaoPid, posicaoHttp - 11);

		    	System.out.println(pid);
		    	System.out.println(req);
		      }

		}
		fr.close();
		bf.close();     
	}


	public void escrita() throws IOException {
		
		FileWriter fw = new FileWriter("dump_final");
		PrintWriter gravarArq = new PrintWriter(fw);
		
		
		gravarArq.printf("teste");

		
		fw.close();

	}

}
