package org.codenova.spring.repository.oracle;

import org.codenova.spring.repository.MovieRepository;
import org.springframework.stereotype.Repository;


public class MovieRepositoryForOracle implements MovieRepository {
    @Override
    public boolean create() {
        return false;
    }
}
