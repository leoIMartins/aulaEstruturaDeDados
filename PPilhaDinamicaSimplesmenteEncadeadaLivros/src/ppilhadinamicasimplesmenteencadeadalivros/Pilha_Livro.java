package ppilhadinamicasimplesmenteencadeadalivros;

import javax.swing.JOptionPane;

public class Pilha_Livro {
    private Livro topo;

    public Pilha_Livro() {
        this.topo = null; //Criando a pilha Vazia
        JOptionPane.showMessageDialog(null, "PILHA CRIADA COM SUCESSO!");
    }
    
    private boolean vazia(){
        if (topo==null)
            return true;
        else
            return false;
    }
    
    public void push(Livro aux){
        aux.setAnterior(topo);
        topo = aux;
        JOptionPane.showMessageDialog(null, "Livro inserido com sucesso!");
    }
    
    public void pop(){
        if (vazia()){
            JOptionPane.showMessageDialog(null, "Impossível Remover! Pilha Vazia!");
        }
        else{
            topo = topo.getAnterior();
            JOptionPane.showMessageDialog(null, "Elemento Removido!");    
        }
    }
    
    public void print(){
        if (vazia()){
            JOptionPane.showMessageDialog(null, "Pilha Vazia, Impossível Imprimir!");
        }
        else{
            Livro aux = topo;
            do{
                JOptionPane.showMessageDialog(null, aux.toString());
                aux = aux.getAnterior(); //Vai para o livro anterior (se tiver)
            }while (aux != null);
            JOptionPane.showMessageDialog(null, "Final da Impressao");
        }
    }
    
    public void quantidadeLivros(){
        if(vazia()){
            JOptionPane.showMessageDialog(null, "Não há livros na pilha!");
        }
        else{
            Livro aux = topo;
            Integer quantidade = 0;
            do{
                aux = aux.getAnterior();
                quantidade += 1;
            }while(aux!=null);
            JOptionPane.showMessageDialog(null, "Há " + quantidade + " livro(s) na pilha!");
        }
    }
    
    public void procuraLivro(){
        if(vazia()){
            JOptionPane.showMessageDialog(null, "Não há livros na pilha!");
        }
        else{
            int j = 0;
            String titulo = JOptionPane.showInputDialog(null, "Informe o título do livro procurado:");
            Livro aux = topo;
            do {
                if(aux.getTitulo().equals(titulo))
                    j++;
                aux = aux.getAnterior();
            }while(aux!=null);
            
            if(j == 0){
                JOptionPane.showMessageDialog(null, "O título " + titulo + " não foi encontrado na pilha!");
            }
            else if(j == 1){
                JOptionPane.showMessageDialog(null, "O título " + titulo + " foi encontrado na pilha!");
            }
            else{
                JOptionPane.showMessageDialog(null, "O título " + titulo + " foi encontrado " + j + " vezes na pilha!");
            }
        }
        
    }
}
