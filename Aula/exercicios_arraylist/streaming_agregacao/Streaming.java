package exercicios_arraylist.streaming_agregacao;

import java.util.ArrayList;

public class Streaming {
    private int cod;
    private String name;
    private String url;
    // associação com ArrayList
    private ArrayList<Filme> filme;

    
    public Streaming() {
        this.filme =  new ArrayList<Filme>();
    }

    public Streaming(int cod, String name, String url) {
        this.cod = cod;
        this.name = name;
        this.url = url;
        this.filme = new ArrayList<Filme>();
    }
    
    //getters
    public int getCod() {
        return cod;
    }
    public String getName() {
        return name;
    }
    public String getUrl() {
        return url;
    }
    public ArrayList<Filme> getFilme() {
        return filme;
    }


    //setters
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   
    public void setUrl(String url) {
        this.url = url;
    }
    public void setFilme(ArrayList<Filme> filme) {
        this.filme = filme;
    }

    public String toString(){
        return "Código: " + this.cod + " Nome: " + this.name + " URL: " + this.url + "\n Filme" + this.filme.toString();
    }

    // Filme é o tipo parâmetro, uma classe 
    // filme é o parâmetro, um objeto 
    public void addFilme (Filme filme){
        this.filme.add(filme);
    }


}
