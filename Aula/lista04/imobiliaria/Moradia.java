package lista04.imobiliaria;

public abstract class Moradia {
    protected String endereco;
    protected String cidade;
    protected float tamanho;

    public Moradia() {
    }

    public Moradia(String endereco, String cidade, float tamanho) {
        this.endereco = endereco;
        this.cidade = cidade;
        this.tamanho = tamanho;
    }

    public String getEndereco() {
        return endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public float getTamanho() {
        return tamanho;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }  
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String toString(){
        return " Cidade:" + this.cidade + " Endereço:" + this.endereco + " Tamanho da residencia:" + this.tamanho;
    }

    public abstract void calcularPreco();

}
