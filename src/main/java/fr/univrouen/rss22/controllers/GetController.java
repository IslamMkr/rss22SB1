package fr.univrouen.rss22.controllers;

import fr.univrouen.rss22.models.Item;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {

    @GetMapping("/resume")
    public String getListRSSinXML() {
        return "Envoi de la liste des flux RSS";
    }

    @GetMapping("/guid")
    public String getRSSinXML(
            @RequestParam(value = "guid") String texte
    ) {
        return "Détail du contenu RSS demandé : " + texte;
    }

    @GetMapping("/test")
    public String getTest(
            @RequestParam(value = "nb") int nb,
            @RequestParam(value = "search") String search
    ) {
        return "Test :<br>guid = " + nb + "<br>titre = " + search;
    }

    @RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public Item getXML() {
        Item it = new Item("12345678", "Test item", "2022-05-01T11:22:33");

        return it;
    }

}
