package com.example.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data //Instead of getter and setter
@AllArgsConstructor //Take all the private fields as a constructor internally
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;


}
