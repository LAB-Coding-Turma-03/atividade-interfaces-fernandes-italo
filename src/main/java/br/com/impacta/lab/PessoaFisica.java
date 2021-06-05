package br.com.impacta.lab;

public class PessoaFisica implements Pessoa {

    private String documento;
    private String tipo;

    public PessoaFisica() {
    }

    public PessoaFisica(String documento, String tipo) {
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