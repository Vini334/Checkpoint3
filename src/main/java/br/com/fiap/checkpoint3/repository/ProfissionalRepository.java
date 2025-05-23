package br.com.fiap.checkpoint3.repository;

import java.util.List;

import br.com.fiap.checkpoint3.model.ProfissionalStatus;
import br.com.fiap.checkpoint3.model.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long>{
    public List<Profissional> findByStatus(ProfissionalStatus status);
}