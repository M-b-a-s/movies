package dev.mbas.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.mbas.movies.model.Reviews;

@Repository
public interface ReviewRepository extends MongoRepository<Reviews, ObjectId> {
}
