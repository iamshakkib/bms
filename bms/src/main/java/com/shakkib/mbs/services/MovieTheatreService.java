package com.shakkib.mbs.services;


import com.shakkib.mbs.exceptions.MovieDetailsNotFoundException;
import com.shakkib.mbs.exceptions.MovieTheatreDetailsNotFoundException;
import com.shakkib.mbs.exceptions.TheatreDetailsNotFoundException;
import com.shakkib.mbs.entities.MovieTheatre;

import java.util.List;

public interface MovieTheatreService {
    public MovieTheatre acceptMovieTheatreDetails(MovieTheatre movieTheatre) throws MovieDetailsNotFoundException,
            TheatreDetailsNotFoundException;
    public MovieTheatre getMovieTheatreDetails(int id) throws MovieTheatreDetailsNotFoundException;
    public boolean deleteMovieTheatre(int id) throws MovieTheatreDetailsNotFoundException;
    public List<MovieTheatre> getAllMovieTheatreDetails();
}