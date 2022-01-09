package com.adamcardoso.cursomc.repositories;

import com.adamcardoso.cursomc.domain.Cidade;
import com.adamcardoso.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
