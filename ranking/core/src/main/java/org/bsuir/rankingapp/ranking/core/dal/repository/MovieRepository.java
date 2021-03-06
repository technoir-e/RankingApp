package org.bsuir.rankingapp.ranking.core.dal.repository;

import org.bsuir.rankingapp.ranking.core.dal.domain.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository("movieRepository")
public interface MovieRepository extends Neo4jRepository<Movie, String> {

  Movie findByTitle(String title);
}
