package ppilhaestaticasequenciallivros;

import javax.swing.JOptionPane;

public class Pilha_Livro {
    static int topo;
    static Livro elementos[] = new Livro[5];

    public Pilha_Livro() {
        topo = -1; /* Posicao de Controle - Invalida */
        for(int i=0; i<elementos.length ;i++)
            elementos[i]=null;
    }
    
    private static boolean vazia(){
        if (topo == -1)
            return true;
        else
            return false;
    }
    
    private static boolean cheia(){
        if (topo == elementos.length -1)
            return true;
        else
            return false;
    }
    
    public static void pop(){ //remover
        if (vazia()){
            JOptionPane.showMessageDialog(null, "Impossivel Remover, Pilha VAZIA!");
        }
        else
        {
            elementos[topo]=null;  //Removendo o Livro da Posição do Topo
            topo--;
            JOptionPane.showMessageDialog(null, "Elemento Removido!");
        }
    }
    
    public static void push(Livro livro){// Empilhar
        if(cheia())
        {
            JOptionPane.showMessageDialog(null, "Impossivel Inserir, pois Pilha está cheia!");
        }
        else
        {
            topo++; //Alterar topo para a posicao aonde será inserido o novo livro
            elementos[topo]=livro;
        }
    }
    
    public static void print(){
        if (vazia()){
            JOptionPane.showMessageDialog(null, "Pilha Vazia!");
        }
        else
        {
            for (int i=topo; i>=0  ;i--){
                JOptionPane.showMessageDialog(null, elementos[i].toString());
            }
        }
    }
    
    public void quantidadeLivros(){
        if(this.topo > -1){
            int quantia = this.topo + 1;
            JOptionPane.showMessageDialog(null, "Há " + quantia + " livro(s) na pilha!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há livros na pilha!");
        }
    }
    
    public void procuraLivro(){
        if(vazia()){
            JOptionPane.showMessageDialog(null, "Não há livros na pilha!");
        }
        else{
            int j = 0;
            String titulo = JOptionPane.showInputDialog(null, "Informe o título do livro procurado:");
            for (int i=topo; i>=0  ;i--){
                if(elementos[i].getTitulo().equals(titulo)){
                    j++;
                }
            }
            if(j == 0){
                JOptionPane.showMessageDialog(null, "O título " + titulo + " não foi encontrado na pilha!");
            }
            else if(j ==1){
                JOptionPane.showMessageDialog(null, "O título " + titulo + " foi encontrado na pilha!");
            }
            else{
                JOptionPane.showMessageDialog(null, "O título " + titulo + " foi encontrado " + j + " vezes na pilha!");
            }
        }
        
    }
}
