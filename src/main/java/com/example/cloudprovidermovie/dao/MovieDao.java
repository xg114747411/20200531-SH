package com.example.cloudprovidermovie.dao;

import com.example.cloudprovidermovie.bean.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {
    public Movie getNewMovie(){
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("战狼");
        return movie;
    }
}

