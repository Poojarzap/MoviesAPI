package com.example.movies.Repository;

import com.example.movies.Module.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRespository extends MongoRepository<Movie, ObjectId> {
    //To search using imdbId
    Optional<Movie> findMovieByImdbId(String imdbId);
}
