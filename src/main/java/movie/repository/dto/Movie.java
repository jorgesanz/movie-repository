package movie.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {

    @JsonProperty("Title")
    private String title;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
