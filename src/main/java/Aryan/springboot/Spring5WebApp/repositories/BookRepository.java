package Aryan.springboot.Spring5WebApp.repositories;

import Aryan.springboot.Spring5WebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
