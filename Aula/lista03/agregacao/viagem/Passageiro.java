package lista03.agregacao.viagem;

public class Passageiro {
    
    private String rg;    
    private String cpf; 
    private String nome;

    //construtores
    //sem parâmetro 
    public Passageiro() {
    }

    //com parâmetro
    public Passageiro(String rg, String cpf, String nome) {
        this.setRg(rg);
        this.setCpf(cpf);
        this.setNome(nome);
    }

    //getters 
    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getNome() {
        return nome;
    }  

    //setters 
    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // toString() -> converter o passageiro em string
    public String toString() {
        return "Nome: " + this.nome + ", RG: " + this.rg + ", CPF: " + this.cpf; //mostrar informações do passageiro
    }


}
