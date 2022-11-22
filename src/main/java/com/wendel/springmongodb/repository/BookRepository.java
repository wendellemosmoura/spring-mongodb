package com.wendel.springmongodb.repository;

import com.wendel.springmongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
