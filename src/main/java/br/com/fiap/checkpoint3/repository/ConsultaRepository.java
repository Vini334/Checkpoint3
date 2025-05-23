package br.com.fiap.checkpoint3.repository;

import br.com.fiap.checkpoint3.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
    
}