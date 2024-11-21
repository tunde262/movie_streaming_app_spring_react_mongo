package app.tunde.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// This Class represents each document in the Movies collection
@Document(collection = "movies")
@Data // takes care of applying Getters & Setters for below constructor
@AllArgsConstructor // annotation for creating a constructor that takes all private fields below as arguments
@NoArgsConstructor // annotation to tell the compiler that the below constructor takes no parameters
public class Movie {

    @Id
    private ObjectId id; // Unique ID for each movie
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
}
