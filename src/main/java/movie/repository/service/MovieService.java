package movie.repository.service;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.uri.UriBuilder;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import movie.repository.dto.Movie;

import javax.inject.Singleton;
import java.net.URI;
import java.util.List;

@Singleton
public class MovieService {

    private final RxHttpClient httpClient;

    public MovieService(@Client("http://www.omdbapi.com") RxHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Maybe<List<Movie>> get() {

        URI uri = UriBuilder.of("/")
                .queryParam("i","tt3896198")
                .queryParam("apikey","6dae1e0f").build();
        HttpRequest<?> req = HttpRequest.GET(uri);
        Flowable flowable = httpClient.retrieve(req, Argument.listOf(Movie.class));
        return flowable.firstElement();
    }
}
