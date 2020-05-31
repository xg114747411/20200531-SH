package com.example.cloudprovidermovie.servcie;

import com.example.cloudprovidermovie.bean.Movie;
import com.example.cloudprovidermovie.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieDao movieDao;
    public Movie getNewMovie(){
        return movieDao.getNewMovie();
    }
}

