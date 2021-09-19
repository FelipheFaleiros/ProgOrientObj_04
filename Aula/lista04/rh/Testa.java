package lista04.rh;


public class Testa {

    // Polimorfismo
    public static void exemploPolimorfismo(Funcionario camaleao){
        // camaleao pode representar um assistente, um gerente ou um diretor 
        System.out.println(camaleao.toString());
        camaleao.receberSalarioTotal();
    }

    public static void main(String[] args) {
    Assistente as1 = new Assistente ("Fulano", "12.312.312-5", 2000, 2);
    exemploPolimorfismo(as1);

    Gerente ger1 = new Gerente("Bertrano", "65.478.542.6", 4000, 10,"batida 100%");
    exemploPolimorfismo(ger1);


    Diretor dir1 = new Diretor("Ciclano", "789", 6000, "Civic");
    // System.out.println(dir1.toString());
    // dir1.receberSalarioTotal();
    exemploPolimorfismo(dir1);
}
    
}
