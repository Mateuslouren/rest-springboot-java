package br.com.movies.service;

import br.com.movies.dto.MovieRequestDTO;
import br.com.movies.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

    List<Movie> findAllMovies(String title);

    Movie createMovie(MovieRequestDTO movie);

    boolean deleteMovie(long id);
}
