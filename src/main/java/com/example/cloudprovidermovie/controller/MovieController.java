package com.example.cloudprovidermovie.controller;

import com.example.cloudprovidermovie.bean.Movie;
import com.example.cloudprovidermovie.servcie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;
    /**
     * 获取最新电影
     */
    @GetMapping("/movie")
    public Movie getNewMovie(){
        return movieService.getNewMovie();
    }
}

