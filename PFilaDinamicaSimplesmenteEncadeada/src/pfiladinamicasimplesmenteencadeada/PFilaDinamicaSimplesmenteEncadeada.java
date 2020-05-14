package pfiladinamicasimplesmenteencadeada;

import javax.swing.JOptionPane;

public class PFilaDinamicaSimplesmenteEncadeada {

    public static void main(String []args) {
        FilaPessoa minha_fila = new FilaPessoa();

        int opcao;
        boolean condicao = true;
        
        while(condicao) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada:\n"
                    + "1 - Inserir Pessoa\n"
                    + "2 - Remover Pessoa\n"
                    + "3 - Imprimir Pessoas\n"
                    + "4 - Quantidade de Pessoas na Pilha\n"
                    + "5 - Busca por Pessoa\n"
                    + "0 - Sair do Programa\n"));
            switch(opcao)
            {
                case 1:
                    Pessoa p = new Pessoa(
                            JOptionPane.showInputDialog("Informe o nome do pessoa:"), 
                            JOptionPane.showInputDialog("Informe o telefone da pessoa:")
                    );
                    minha_fila.push(p);
                    break;
                case 2:
                    minha_fila.pop();
                    break;
                case 3:
                    minha_fila.print();
                    break;
                case 4:
                    //minha_fila.quantidadePessoas();
                    break;
                case 5:
                    //minha_fila.procuraPessoa();
                    break;
                case 0:
                    condicao = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Informe uma opção válida!");
            }
        }

        /*Pessoa p1 = new Pessoa("Papini", "190");
        
        minha_fila.push(p1);
        p1 = new Pessoa("John Doe", "911");
        minha_fila.push(p1);
        minha_fila.push(new Pessoa("Covid-19", "666"));
        minha_fila.print();
        
        minha_fila.pop();
        minha_fila.print();
        minha_fila.pop();
        minha_fila.pop();
        minha_fila.print();
        //p1.toString();
        //System.out.println(p1.toString());
        */
        
    }
    
}
