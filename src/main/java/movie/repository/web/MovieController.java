package movie.repository.web;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import movie.repository.service.MovieService;

@Controller("/movie")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @Get(produces = MediaType.TEXT_PLAIN)
    public String getMovies() {
        return movieService.get();
    }
}
