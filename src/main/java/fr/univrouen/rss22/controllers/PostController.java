package fr.univrouen.rss22.controllers;

import fr.univrouen.rss22.models.Item;
import fr.univrouen.rss22.models.TestRSS;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @RequestMapping(
            value = "/testpost",
            method = RequestMethod.POST,
            consumes = "application/xml"
    )
    public String postTest(@RequestBody String flux) {
        return ("<result><response>Message recu : </response>" + flux + "</result>");
    }

    @PostMapping(value = "/postrss", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public String postRSS() {
        TestRSS rss = new TestRSS();

        return rss.loadFileXML();
    }

}
