package com.example.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired //Letting the framework to instantiate MongoRepository
    private MovieRespository movieRespository;
    //Database access methods
    public List<Movie> allMovies(){
     return movieRespository.findAll();
    }
}
