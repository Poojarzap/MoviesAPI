package com.example.movies.Service;


import com.example.movies.Module.Movie;
import com.example.movies.Repository.MovieRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired //Letting the framework to instantiate MongoRepository
    private MovieRespository movieRespository;
    //Database access methods
    public List<Movie> allMovies(){
     return movieRespository.findAll();
    }

    public Optional<Movie> getMovie(String imdbId){ //Optional because, id may return null
        return movieRespository.findMovieByImdbId(imdbId);
    }

}
