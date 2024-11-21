package app.tunde.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// This class is the front face of the API it controls all GET, POST, PUT requests
@CrossOrigin(origins = "http://localhost:3000")
@RestController // annotation to tell the compiler this class is the front face, entry point, of the API, hence the name controller
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired // No need to create a constructor for movieService, this annotation will instantiate the class for us
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) { // the annotation tells the compiler to take the {id} from params and convert it into ObjectId "id"
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
