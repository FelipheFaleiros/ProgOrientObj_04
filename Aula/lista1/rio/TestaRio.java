package lista1.rio;

public class TestaRio {
    //main é um metodo especial 
    public static void main(String args[]) {
        
        Rio obj1 = new Rio("Amazonas", 1.3f, false);
        obj1.subir(0.4f);
        obj1.sujar();

        Rio obj2 = new Rio("Tamoios", 0.9f, true);
        obj2.descer(0.3f);
        obj2.limpar();

        System.out.println(obj1.mostra());
        System.out.println(obj2.mostra());
    }
    
}
