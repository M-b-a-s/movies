package dev.mbas.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movie {
    private ObjectId id;
    private String imdbId;
    private String title;
}
