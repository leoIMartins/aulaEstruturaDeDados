package ppilhadinamicasimplesmenteencadeadalivros;

import javax.swing.JOptionPane;

public class PPilhaDinamicaSimplesmenteEncadeadaLivros {

    public static void main(String[] args) {

        Pilha_Livro minha_pilha_livros = new Pilha_Livro();
        
        int opcao = 0;
        boolean condicao = true;
        
        while(condicao) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada:\n"
                    + "1 - Inserir Livro\n"
                    + "2 - Remover Livro\n"
                    + "3 - Imprimir Livros\n"
                    + "4 - Quantidade de Livros na Pilha\n"
                    + "5 - Busca por Título\n"
                    + "0 - Sair do Programa\n"));
            switch(opcao)
            {
                case 1:
                    Livro l = new Livro();
                    l.setTitulo(JOptionPane.showInputDialog("Informe o nome do livro:"));
                    l.setAutor(JOptionPane.showInputDialog("Informe o nome do autor do livro:"));
                    l.setIsbn(JOptionPane.showInputDialog("Informe o código ISBN do livro:"));
                    minha_pilha_livros.push(l);
                    break;
                case 2:
                    minha_pilha_livros.pop();
                    break;
                case 3:
                    minha_pilha_livros.print();
                    break;
                case 4:
                    minha_pilha_livros.quantidadeLivros();
                    break;
                case 5:
                    minha_pilha_livros.procuraLivro();
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
