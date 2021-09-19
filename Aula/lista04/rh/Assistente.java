package lista04.rh;

public class Assistente extends Funcionario{ //extends dizer quem é a classe pai
    
    private float horaExtra;

    public Assistente() {
        super(); //chama construtor da superclasse 
    }

    
    // Assistente as1 = new Assistente ("Fulano", "12.312.312-5", 200, 2)
    public Assistente(String nome, String rg, float salario, float horaExtra) {
        super(nome, rg, salario);//chama construtor da superclasse - reutilização de código
        this.setHoraExtra(horaExtra);
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    // apesar de herdarmos o toString(), teremos que reescreve-lo
    @Override // inca que iremos anular algo que foi herdado //sobrescrever ou anular 
    public String toString(){
        return "Hora extra:" + this.horaExtra + super.toString() ;
    }


    @Override
    public void receberSalarioTotal() {
        // TODO Auto-generated method stub
        float aux = this.salario + 40*this.horaExtra; //regra de negocio
        System.out.println("Salário total:" + aux);

        
    }
}

   
