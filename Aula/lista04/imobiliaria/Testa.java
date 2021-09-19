package lista04.imobiliaria;

public class Testa {

    public static void exPolimorfismo(Moradia camaleao){
        System.out.println(camaleao.toString());
        camaleao.calcularPreco();
    }
    public static void main(String[] args) {
        Casa cas = new Casa ("Rua José Marcos", "Franca", 200, 30, true);
        exPolimorfismo(cas);

        Apto ap = new Apto("Av. Nicacio", "São-Paulo", 80, 36, 3);
        exPolimorfismo(ap);


    }
    
}
