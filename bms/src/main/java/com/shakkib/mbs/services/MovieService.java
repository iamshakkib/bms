package com.shakkib.mbs.services;

import com.shakkib.mbs.exceptions.MovieDetailsNotFoundException;
import com.shakkib.mbs.entities.Movie;

import java.util.List;

public interface MovieService {

    public Movie acceptMovieDetails(Movie movie);

    public Movie getMovieDetails(int movieId) throws MovieDetailsNotFoundException;

    public Movie updateMovieDetails(int movieId , Movie movie) throws MovieDetailsNotFoundException;

    public boolean deleteMovie(int id);

    public List<Movie> getAllMovieDetails();
}
