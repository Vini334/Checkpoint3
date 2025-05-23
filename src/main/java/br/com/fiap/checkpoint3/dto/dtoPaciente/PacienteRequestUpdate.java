package br.com.fiap.checkpoint3.dto.dtoPaciente;

import br.com.fiap.checkpoint3.model.Paciente;

public class PacienteRequestUpdate {
    private Long id;
    private String nome;
    private String endereco;
    private String bairro;
    private String email;
    private String telefone_completo;

    public Paciente toModel(Paciente paciente){
        paciente.setNome(this.nome);
        paciente.setEmail(this.email);
        paciente.setEndereco(this.endereco);
        paciente.setBairro(this.bairro);
        paciente.setTelefone(this.telefone_completo);
        return paciente;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone_completo;
    }
    public void setTelefone(String telefone_completo) {
        this.telefone_completo = telefone_completo;
    }

}