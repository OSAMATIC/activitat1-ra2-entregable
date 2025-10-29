package acces.dades.activitat2.ra2.activitat_2_ra2_entrega.repository;
import java.time.LocalDateTime;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import acces.dades.activitat2.ra2.activitat_2_ra2_entrega.models.Users;

public class userRepository {

    @Autowired
    JdbcTemplate  jdbcTemplate;


    private static final class UserRowMapper implements RowMapper<Users>{
        @Override
        public Users mapRow(ResultSet rs, int rowNum) throws SQLException{
            Users user = new Users();
            user.setId(rs.getLong("id"));
            user.setNom(rs.getString("nom"));
            user.setDescripcion(rs.getString("descripcion"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("Password"));
            if(rs.getTimestamp("ultimAcces") != null) {
                user.setUltimAcces(rs.getTimestamp("ultimAcces"));
            }
            user.setUltimAcces(rs.getTimestamp("dataCreated"));

            

            return user;
        }
    }
}
