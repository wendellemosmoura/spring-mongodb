package com.wendel.springmongodb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collation = "book")
public class Book {

    @Id
    private int id;
    private String bookName;
    private String authorName;
}
