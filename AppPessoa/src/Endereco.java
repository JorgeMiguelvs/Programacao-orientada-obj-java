public class Endereco {
    private String logradouro;
    private String complemento;
    private int numero;
    private String cep;

    public Endereco() {
    }

    public Endereco(String logradouro, String complemento, int numero, String cep) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String imprimir(){
        return "Logradouro: " + logradouro +
                "\nComplemento: " + complemento +
                "\nNúmero: " + numero +
                "CEP: " + cep;
    }

}


