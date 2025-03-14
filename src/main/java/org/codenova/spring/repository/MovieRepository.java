package org.codenova.spring.repository;

import lombok.AllArgsConstructor;
import org.codenova.spring.model.Movie;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@Repository
@AllArgsConstructor
public class MovieRepository {

    private DataSource dataSource;

    public boolean create(Movie movie) {
        boolean result = false;
        try {
            Connection conn = dataSource.getConnection();

            PreparedStatement ps = conn.prepareStatement("insert into movies values(null,?,?,?,?)");


        }catch(Exception e) {
            System.out.println("MovieRepository.create error : " +e.toString() );
        }

        return result;
    }
}
