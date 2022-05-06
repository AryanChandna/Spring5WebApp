package Aryan.springboot.Spring5WebApp.repositories;

import Aryan.springboot.Spring5WebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
