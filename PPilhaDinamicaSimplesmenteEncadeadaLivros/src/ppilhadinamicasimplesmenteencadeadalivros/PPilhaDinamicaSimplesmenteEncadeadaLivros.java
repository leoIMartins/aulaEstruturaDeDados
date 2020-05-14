package ppilhadinamicasimplesmenteencadeadalivros;

public class PPilhaDinamicaSimplesmenteEncadeadaLivros {

    public static void main(String[] args) {
        Pilha_Livro minha_pilha = new Pilha_Livro();
        
        //minha_pilha.print();
        
        //minha_pilha.pop();
        
        Livro livro1 = new Livro("Objeto 1", "Ze Bunitinho", "1234556");
        minha_pilha.push(livro1);
        livro1 = new Livro("Objeto 2", "Zé feinho", "987654321");
        minha_pilha.push(livro1);
        minha_pilha.push(new Livro("Objeto 3", "papini", "123123"));
        minha_pilha.print();
        
        minha_pilha.pop();
        minha_pilha.pop();
        minha_pilha.pop();
        minha_pilha.print();
        
    }
    
}
