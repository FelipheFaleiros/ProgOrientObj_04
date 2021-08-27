package lista2.banco;

public class TestaCliente {
    public static void main(String args[]){
        
        Cliente obj1 = new Cliente();

        obj1.setCont("123456-7");
        obj1.setAgen("1234-5");
        obj1.setNome("Pedro");
        obj1.setSaldo(1000);
        obj1.realizarDeposito(500);
        obj1.realizarSaque(800);
        System.out.println(obj1.toString());

        Cliente obj2 = new Cliente("111111-1", "2222-2", "Feliphe", 2000);
        obj2.realizarSaque(3000);
        System.out.println(obj2.toString());

    }
}
