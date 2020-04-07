package ppilhaestaticasequenciallivros;

import javax.swing.JOptionPane;

public class PPilhaEstaticaSequencialLivros {

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
                    JOptionPane.showMessageDialog(null, "Livro inserido com sucesso!");
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
         //Menu
         //1 - Inserir Livro
         //2 - Remover Livro 
         //3 - Imprimir Livros
         //4 - Quantidade de Livros na Pilha
         //5 - Busca por Titulo
         //0 - Sair do Programa
         
         
         /*minha_pilha_livros.print();
         
         Livro meu_livro = new Livro("Poeria em Alto Mar", "Ze Ninguem", "000123");
         minha_pilha_livros.push(meu_livro);
         
         meu_livro = new Livro("JAVA Minha Vida", "Amanda", "666");
         minha_pilha_livros.push(meu_livro);
         
         minha_pilha_livros.print();
         minha_pilha_livros.pop();
         
         minha_pilha_livros.push(new Livro("SEU PAPINI", "IAGO", "333"));
         minha_pilha_livros.print();
         
         minha_pilha_livros.pop();
         minha_pilha_livros.pop();
         
         minha_pilha_livros.pop();*/

//opcao
         //switch(opcao)
         //{
         //   case 2: minha_pilha_livros.pop();
        
    }
}
