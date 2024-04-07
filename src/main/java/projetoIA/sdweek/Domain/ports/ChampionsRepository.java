package projetoIA.sdweek.Domain.ports;

import projetoIA.sdweek.Domain.model.Champions;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {
    List<Champions> findAll();


    Optional<Champions> findOne(Long id);
}
