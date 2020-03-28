import javax.swing.JOptionPane;
import Pessoa;

public class ManipulaPessoa{

	public static void main(String []args){

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome(JOptionPane.showInputDialog(null, "Informe o nome da pessoa: "));
        System.out.println(pessoa1.getNome());
    }
}