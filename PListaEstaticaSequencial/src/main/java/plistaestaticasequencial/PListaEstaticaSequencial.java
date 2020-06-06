package plistaestaticasequencial;



import javax.swing.JOptionPane;

public class PListaEstaticaSequencial {

    public static void main(String[] args) {
        Lista_Pessoa minha_lista = new Lista_Pessoa();

        int opcao;
        boolean condicao = true;
        
        while(condicao) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada:\n"
                    + "1 - Inserir Pessoa\n"
                    + "2 - Remover Pessoa\n"
                    + "3 - Imprimir Pessoas\n"
                    + "4 - Quantidade de Pessoas na Fila\n"
                    + "5 - Busca por Pessoa\n"
                    + "0 - Sair do Programa\n"));
            switch(opcao)
            {
                case 1:
                    Pessoa p = new Pessoa(
                            JOptionPane.showInputDialog("Informe o nome do pessoa:"), 
                            JOptionPane.showInputDialog("Informe o telefone da pessoa:")
                    );
                    minha_lista.push(p);
                    break;
                case 2:
                    minha_lista.pop();
                    break;
                case 3:
                    minha_lista.print();
                    break;
                case 4:
                    //minha_lista.quantidadePessoas();
                    break;
                case 5:
                    //minha_lista.procuraPessoa();
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
