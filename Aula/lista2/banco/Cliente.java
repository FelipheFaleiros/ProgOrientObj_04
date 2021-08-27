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
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    //métodos setters
    public final void setCont(String numeroConta){
        if((numeroConta.length() == 8) && (numeroConta.charAt(numeroConta.length()-2) == '-')){ //(numeroConta.charAt(6) == '-')
            //charAt verificar em determinada posição, nesse caso se é == a um traço 
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Número de conta invalido");
            this.numeroConta = "Não definido";
        }
    }

    public final void setAgen(String numeroAgencia){
        if ((numeroAgencia.length() == 6) && ( numeroAgencia.charAt(4) == '-')){
            this.numeroAgencia = numeroAgencia;
        }
        else {
            System.out.println("Número de agencia invalido");
            this.numeroAgencia = "Não definido";
        }
    }

    public final void setSaldo(float x){
        if (x >=0){
            this.saldo = x;
        }
        else {
            System.out.println("Saldo não pode ser negativo");
        }
    }
    public final void setNome(String nome){
        if (nome.length() <= 30){ //length -> tamanho || não pode ser igual ou maior que 30 caracteres 
            this.nome = nome;
        }
        else {
            System.out.println("Tamanho do nome é muito grande");
        }
    }
        
        public String getAgen(){
            return this.numeroAgencia;
        }
        
        public String getCont(){
            return this.numeroAgencia;
        }

        public String getNome(){
            return this.nome;
        }

        public float getSaldo(){
            return this.saldo;
        }

        public String toString(){ //converter obj em String
            return "Número da conta " + this.numeroConta + ", Numero da Agência " + this.numeroAgencia + ", Nome " + this.nome + " Saldo " + this.saldo;
        }

        public void realizarDeposito (float x){
            // this.setSaldo(this.saldo + x); //uma forma de ser feito
            if (x >=0)
                this.saldo += x;//outra forma
        }

        public void realizarSaque (float x){
            if (x >= 0)
                this.setSaldo(this.saldo - x); 
        }

    
}