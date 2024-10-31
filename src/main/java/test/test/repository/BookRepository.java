package test.test.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import test.test.entity.Book;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
    List<Book> findByTitle(String title);
}