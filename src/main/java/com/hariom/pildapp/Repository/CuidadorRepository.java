package com.hariom.pildapp.Repository;

import com.hariom.pildapp.Entities.Cuidador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuidadorRepository extends JpaRepository<Cuidador, Long> {
}
