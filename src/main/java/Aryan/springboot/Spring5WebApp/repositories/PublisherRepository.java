package Aryan.springboot.Spring5WebApp.repositories;

import Aryan.springboot.Spring5WebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
