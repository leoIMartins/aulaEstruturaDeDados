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
            JOptionPane.showMessageDialog(null, "Pessoa(s) na Fila:");
            do{
                JOptionPane.showMessageDialog(null, aux.toString());
                aux = aux.getProximo();
            }while(aux!=null);
        }
    }
    
    public void quantidadePessoas(){
        if (vazia())
            JOptionPane.showMessageDialog(null, "A fila está vazia!");
        else {
            Pessoa aux = head;
            Integer quantidade = 0;
            do{
                aux = aux.getProximo();
                quantidade += 1;
            }while(aux!=null);
            JOptionPane.showMessageDialog(null, "Existe " + quantidade + " pessoa(s) na fila!");
        }
    }
    public void procuraPessoa(){
        if(vazia()){
            JOptionPane.showMessageDialog(null, "Não há pessoas na fila!");
        }
        else{
            int j = 0;
            String nome = JOptionPane.showInputDialog(null, "Informe o nome da pessoa procurada:");
            Pessoa aux = head;
            do {
                if(aux.getNome().equals(nome))
                    j++;
                aux = aux.getProximo();
            }while(aux!=null);
            
            if(j == 0){
                JOptionPane.showMessageDialog(null, "O nome " + nome + " não foi encontrado na fila!");
            }
            else if(j ==1){
                JOptionPane.showMessageDialog(null, "O nome " + nome + " foi encontrado na fila!");
            }
            else{
                JOptionPane.showMessageDialog(null, "O nome " + nome + " foi encontrado " + j + " vezes na fila!");
            }
        }
        
    }
            
}
