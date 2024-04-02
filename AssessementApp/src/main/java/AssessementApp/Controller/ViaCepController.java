package AssessementApp.Controller;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import spark.Route;

public class ViaCepController {
	
	public static Route getAdress = ( req,  res) -> {
		
		String cep  = req.params("cep");
		
		String url = "https://viacep.com.br/ws/" + cep + "/json/";
		
		HttpURLConnection connection = (HttpURLConnection)  new URL(url).openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		if(responseCode == HttpURLConnection.HTTP_OK) {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder responseBuilder = new StringBuilder();
			String line;
			
			while((line = reader.readLine()) != null) {
				responseBuilder.append(line);
			}
			reader.close();
			
			return responseBuilder.toString();
			
		}else {
			return "Erro ao obter os dados do CEP: " + cep; 
		}
				
	};
}
