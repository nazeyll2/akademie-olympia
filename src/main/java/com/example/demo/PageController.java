package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    private void addLanguage(Model model, String lang) {

        if (!lang.equals("tr")
                && !lang.equals("en")
                && !lang.equals("de")) {
            lang = "tr";
        }

        model.addAttribute("lang", lang);
    }


    /* =========================================================
       HOME
       ========================================================= */

    @GetMapping("/")
    public String home(
            @RequestParam(value = "lang", defaultValue = "tr") String lang,
            Model model) {

        addLanguage(model, lang);
        return "index";
    }


    /* =========================================================
       RESEARCH
       ========================================================= */

    @GetMapping("/research")
    public String research(
            @RequestParam(value = "lang", defaultValue = "tr") String lang,
            Model model) {

        addLanguage(model, lang);
        return "research";
    }


    /* =========================================================
       PUBLICATIONS
       ========================================================= */

    @GetMapping("/publications")
    public String publications(
            @RequestParam(value = "lang", defaultValue = "tr") String lang,
            Model model) {

        addLanguage(model, lang);
        return "publications";
    }


    /* =========================================================
       TEAM
       ========================================================= */

    @GetMapping("/team")
    public String team(
            @RequestParam(value = "lang", defaultValue = "tr") String lang,
            Model model) {

        addLanguage(model, lang);
        return "team";
    }


    /* =========================================================
       CONTACT
       ========================================================= */

    @GetMapping("/contact")
    public String contact(
            @RequestParam(value = "lang", defaultValue = "tr") String lang,
            Model model) {

        addLanguage(model, lang);
        return "contact";
    }

}