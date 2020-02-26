package movie.repository.web;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Maybe;
import movie.repository.dto.Movie;
import movie.repository.service.MovieService;

import java.util.List;

@Controller("/movie")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @Get(produces = MediaType.APPLICATION_JSON)
    public Maybe<List<Movie>> getMovies() {
        return movieService.get();
    }
}
