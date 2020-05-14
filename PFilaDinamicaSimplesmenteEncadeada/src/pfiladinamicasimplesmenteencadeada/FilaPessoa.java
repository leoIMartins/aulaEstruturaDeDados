package pfiladinamicasimplesmenteencadeada;

import javax.swing.JOptionPane;

public class FilaPessoa {
    static private Pessoa head, tail;

    public FilaPessoa() {
        head = tail = null;
        JOptionPane.showMessageDialog(null, "Fila Criada com Sucesso!");
    }
    
    private boolean vazia (){
        if ((head == tail) && (head == null)){
            return true;
        }
        else
            return false;
    }
    
    public void push(Pessoa aux){
        if (vazia())
           head = tail = aux;
        else{
            tail.setProximo(aux);
            tail = aux;
        }
        JOptionPane.showMessageDialog(null, "Pessoa inserida com sucesso!");
    }
    
    public void pop(){
        if (vazia())
            JOptionPane.showMessageDialog(null, "Impossível Remover! Fila Vazia!");
        else{
            head = head.getProximo();
            JOptionPane.showMessageDialog(null, "Pessoa Removida com Sucesso!!!");
        }
        if (head==null) // Fila Ficou Vazia
            tail = null;// Ajusto o valor da Tail
    }
    
    public void print(){
        if (vazia())
            JOptionPane.showMessageDialog(null, "Impossível Imprimir, Fila Vazia!!!");
        else{
            Pessoa aux = head;
            do{
                JOptionPane.showMessageDialog(null, "Pessoa(s) na Fila:\n" + aux.toString());
                aux = aux.getProximo();
            }while(aux!=null);
        }
    }
            
}
