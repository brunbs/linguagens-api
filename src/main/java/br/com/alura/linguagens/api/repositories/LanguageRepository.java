package br.com.alura.linguagens.api.repositories;

import br.com.alura.linguagens.api.models.Language;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepository extends MongoRepository<Language, String> {
}
