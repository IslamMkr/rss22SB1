package fr.univrouen.rss22.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class TestRSS {

	public String loadFileXML() throws IOException {
		
		StringBuilder msg = new StringBuilder("");
        Resource resource = new DefaultResourceLoader().getResource("classpath:xml/item.xml");
        InputStream is = resource.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        try{
            String line;
            while ((line = br.readLine()) != null) {
                // System.out.println(line);
                msg.append(line);
            }
            br.close();
            System.out.println(msg.toString());
            return msg.toString();


        }catch(IOException e){
            e.printStackTrace();
        }
        return null;

    }
	
}

