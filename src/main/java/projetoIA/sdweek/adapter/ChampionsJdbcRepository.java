package projetoIA.sdweek.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import projetoIA.sdweek.Domain.model.Champions;
import projetoIA.sdweek.Domain.ports.ChampionsRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ChampionsJdbcRepository implements ChampionsRepository {


    @Autowired
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Champions> rowMapper;

    public ChampionsJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = (rs, rowNum) -> new Champions(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("role"),
                rs.getString("lore"),
                rs.getString("imageUrl")
        );
    }


    @Override
    public List<Champions> findAll() {
        return  null;
    }

    @Override
    public Optional<Champions> findOne(Long id) {
        return Optional.empty();
    }
}
