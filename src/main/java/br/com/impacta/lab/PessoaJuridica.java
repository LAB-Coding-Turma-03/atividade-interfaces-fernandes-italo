package br.com.impacta.lab;

public class PessoaJuridica implements Pessoa {

    private String documento;
    private String tipo;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String documento, String tipo) {
        this.setDocumento(documento);
        this.setTipo(tipo);
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String falarDocumento() {
        return "Documento: " + getDocumento();
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

}