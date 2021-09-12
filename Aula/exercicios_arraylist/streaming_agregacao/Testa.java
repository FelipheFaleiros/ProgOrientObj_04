package exercicios_arraylist.streaming_agregacao;

public class Testa {
    public static void main(String args[]) {
        Filme film1 = new Filme(1, "Homem de Ferro", "Ação");
        Filme film2 = new Filme(2, "Loira do Banheito", "Terror");
        Filme film3 = new Filme(3, "Minha mãe é uma peça", "Comédia");

        Streaming flm = new Streaming(1, "Netflix", "www.netflix.com");
        flm.addFilme(film1);
        flm.addFilme(film2);
        flm.addFilme(film3);

        System.out.println(flm.toString());
    }
}
