package movie.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Movie {

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Year")
    private String year;

    @JsonProperty("Runtime")
    private String runtime;

    private String rating;

    @JsonProperty("Country")
    private String country;

}
