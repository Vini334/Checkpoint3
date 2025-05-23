package br.com.fiap.checkpoint3.model;

public enum ProfissionalStatus {
    AGENDADA("Consulta agendada"),
    REALIZADA("Consulta realizada"),
    CANCELADA("Consulta cancelada");

    ProfissionalStatus(String mensagem){
        this.mensagem = mensagem;
    }

    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    

}
