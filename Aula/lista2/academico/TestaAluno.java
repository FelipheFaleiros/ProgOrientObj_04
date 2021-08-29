package lista2.academico;
import javax.swing.JOptionPane; //pacote
public class TestaAluno {

    public static void main(String args[]) {
        Aluno obj1 = new Aluno();

        obj1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"))); //mostrar para o usuário e pedir para ele fazer a entrada do valor
        //JOptionPane.showInputDialog  -> retorna uma String
 //Integer.parseInt -> converter String em int 
        obj1.setNumeroAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do aluno"))); 
        obj1.setNome (JOptionPane.showInputDialog("Informe o nome do Aluno")); 
        //parse.Float converte String e float
        obj1.setP1(Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota"))); 
        obj1.setP2(Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota"))); 

        //null indica que a caixa de diálogo não tem pai
        JOptionPane.showMessageDialog(null, obj1.toString());

    }
    
}
