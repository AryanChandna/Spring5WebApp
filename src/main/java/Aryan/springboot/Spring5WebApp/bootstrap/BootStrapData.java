package Aryan.springboot.Spring5WebApp.bootstrap;

import Aryan.springboot.Spring5WebApp.domain.Author;
import Aryan.springboot.Spring5WebApp.domain.Book;
import Aryan.springboot.Spring5WebApp.domain.Publisher;
import Aryan.springboot.Spring5WebApp.repositories.AuthorRepository;
import Aryan.springboot.Spring5WebApp.repositories.BookRepository;
import Aryan.springboot.Spring5WebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("DelhiPublishers");
        publisher.setCity("New Delhi");
        publisher.setState("Delhi");

        publisherRepository.save(publisher);
        System.out.println("Publisher Count" + publisherRepository.count());

        Author eric = new Author("Gojo","Sat");
        Book ddd = new Book("Infinity Domain", "99999");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);


        Author isayama = new Author("Isaya", "Titan");
        Book AOT = new Book("AOT", "01");

        isayama.getBooks().add(AOT);
        AOT.getAuthors().add(isayama);
        publisher.getBooks().add(AOT);

        authorRepository.save(isayama);
        bookRepository.save(AOT);
        publisherRepository.save(publisher);

        System.out.println("Started in bootstrap");
        System.out.println("Number of books" + bookRepository.count());
    }
}
