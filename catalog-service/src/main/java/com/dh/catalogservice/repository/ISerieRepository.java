package com.dh.catalogservice.repository;

import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ISerieRepository extends MongoRepository<Serie, Long> {
    List<Serie> findAllByGenre(String genre);
}


