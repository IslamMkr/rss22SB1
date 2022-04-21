package fr.univrouen.rss22.models;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.file.Files;

public class TestRSS {

    public String loadFileXML() {
        Resource resource = new DefaultResourceLoader().getResource("classpath:xml/item.xml");
        String xmlFileContent = "";

        try {
            byte[] bytes = Files.readAllBytes(resource.getFile().toPath());
            xmlFileContent = new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return xmlFileContent;
    }

}
