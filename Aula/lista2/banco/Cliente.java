package lista2.banco;

public class Cliente {
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
    
    //construtores
    public Cliente(){ //criado para não dar erro quando o construtor estiver sem parâmetros 

    }
    
    public Cliente (String numeroConta, String numeroAgencia, String nome, float saldo ){
        this.setCont(numeroConta);
        this.setAgen(numeroAgencia);
        this.setnome(nome);
        this.setsaldo(saldo);
    }

    //métodos setters
    public void setCont(String numeroConta){
        if((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')){
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Número de conta invalido");
        }
    }
}