package plistaestaticasequencial;



import javax.swing.JOptionPane;

public class PListaEstaticaSequencial {

    public static void main(String[] args) {
        Lista_Contato minha_lista = new Lista_Contato();

        int opcao;
        boolean condicao = true;
        
        while(condicao) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada:\n"
                    + "1 - Inserir Contato\n"
                    + "2 - Remover Contato\n"
                    + "3 - Imprimir Contatos\n"
                    + "4 - Quantidade de Contatos na Fila\n"
                    + "5 - Busca por Contato\n"
                    + "0 - Sair do Programa\n"));
            switch(opcao)
            {
                case 1:
                    Contato c = new Contato(
                            JOptionPane.showInputDialog("Informe o nome do contato:"), 
                            JOptionPane.showInputDialog("Informe o telefone do contato:")
                    );
                    minha_lista.push(c);
                    break;
                case 2:
                    minha_lista.pop();
                    break;
                case 3:
                    minha_lista.print();
                    break;
                case 4:
                    minha_lista.quantidadeContatos();
                    break;
                case 5:
                    minha_lista.procuraContato();
                    break;
                case 0:
                    condicao = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Informe uma opção válida!");
            }
        }
    }
}