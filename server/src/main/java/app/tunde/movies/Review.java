package app.tunde.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// This Class represents each document in the Movies collection
@Document(collection = "reviews")
@Data // takes care of applying Getters & Setters for below constructor
@AllArgsConstructor // annotation for creating a constructor that takes all private fields below as arguments
@NoArgsConstructor // annotation to tell the compiler that the below constructor takes no parameters
public class Review {

    @Id // Auto generate ID
    private ObjectId id; // Unique ID for each Review
    private String body;

    public Review(String body) {
        this.body = body;
    }
}
