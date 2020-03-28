import javax.swing.JOptionPane;

public class ManipulaPessoa{

	public static void main(String []args){

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome(JOptionPane.showInputDialog(null, "Informe o nome da pessoa: "));
        pessoa1.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF: "));
        pessoa1.setSexo(JOptionPane.showInputDialog(null, "Informe o sexo: "));
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome(JOptionPane.showInputDialog(null, "Informe o nome da pessoa: "));
        pessoa2.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF: "));
        pessoa2.setSexo(JOptionPane.showInputDialog(null, "Informe o sexo: "));
        
        System.out.println("-------- PESSOA 1 --------");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("CPF: " + pessoa1.getCpf());
        System.out.println("Sexo: " + pessoa1.getSexo());
        
        System.out.println("-------- PESSOA 2 --------");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("CPF: " + pessoa2.getCpf());
        System.out.println("Sexo: " + pessoa2.getSexo());
        
    }
}