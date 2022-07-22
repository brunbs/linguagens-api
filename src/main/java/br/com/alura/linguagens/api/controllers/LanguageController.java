package br.com.alura.linguagens.api.controllers;

import br.com.alura.linguagens.api.models.Language;
import br.com.alura.linguagens.api.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping("/preferred-language")
    public String showPreferredLanguage() {
        return "Olá, mundo";
    }

    @GetMapping("/languages")
    public List<Language> getLanguages() {
        List<Language> languages = repository.findAll();
        return languages;
    }

    @PostMapping("/languages")
    public Language postLanguage(@RequestBody Language language) {
        return repository.save(language);
    }

}
