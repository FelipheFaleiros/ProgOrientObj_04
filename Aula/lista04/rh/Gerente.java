package lista04.rh;

public class Gerente extends Funcionario {
    
    private float bonus;
    private String meta;

    public Gerente() {
        super();
    }
    public Gerente(String nome, String rg, float salario, float bonus, String meta ) {
        super(nome, rg, salario);
        this.setBonus(bonus);
        this.setMeta(meta);
    }


    public float getBonus() {
        return bonus;
    }
    public String getMeta() {
        return meta;
    }


 
    public void setMeta(String meta) {
        this.meta = meta;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    // apesar de herdarmos o toString(), teremos que reescreve-lo
    @Override // inca que iremos anular algo que foi herdado sobrescrever ou anular 
    public String toString(){
        return "Bonus:" + this.bonus + " Meta:" + this.meta + super.toString() ;
    }

    @Override
    public void receberSalarioTotal() {
        float aux = this.salario + (this.bonus*this.salario)/100; //regra de negocio
        System.out.println("Salário total:" + aux);

        
    }
 

}
