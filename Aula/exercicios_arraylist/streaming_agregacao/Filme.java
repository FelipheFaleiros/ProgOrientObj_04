package exercicios_arraylist.streaming_agregacao;

public class Filme {
    private int cod;
    private String name;
    private String classificacao;

    //contadores    
    public Filme() {
    }

    public Filme(int cod, String name, String classificacao) {
        this.cod = cod;
        this.name = name;
        this.classificacao = classificacao;
    }

    //getters
    public String getClassificacao() {
        return classificacao;
    }
    public int getCod() {
        return cod;
    }
    public String getName() {
        return name;
    }
    
    //setters
    public void setCod(int cod) {
        this.cod = cod;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }


    public String toString(){
        return "\n Codigo: " + this.cod + " Nome: " + this.name + " Classificação: " + this.classificacao;
    }

    
}