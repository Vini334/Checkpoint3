package br.com.fiap.checkpoint3.service;

import java.util.List;
import java.util.Optional;

import br.com.fiap.checkpoint3.dto.dtoPaciente.PacienteRequestUpdate;
import br.com.fiap.checkpoint3.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint3.dto.dtoPaciente.PacienteRequestCreate;
import br.com.fiap.checkpoint3.repository.PacienteRepository;


@Service
public class PacienteService {


    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente createPaciente(PacienteRequestCreate dto){
        return pacienteRepository.save(dto.toModel());
    }

    public Optional<Paciente> getPacienteById(Long id) {
        return pacienteRepository.findById(id);
        
    }

    public List<Paciente> getAll(){
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> UpdatePaciente(Long id, PacienteRequestUpdate dto){
        return pacienteRepository.findById(id)
        .map(p -> pacienteRepository.save(dto.toModel(p)));
        
               } 

    public boolean deletePaciente(Long id){
        if (pacienteRepository.existsById(id)) {
            pacienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
        
    
    

}