package pfilaestaticasequencial;

import javax.swing.JOptionPane;

public class Fila_Pessoa {
    private int head, tail;
    private Pessoa elementos[] = new Pessoa[5];

    public Fila_Pessoa() {
        head = tail = -1; // Posição de Controle "Inválida"
        for (int i=0; i<elementos.length; i++)
            elementos[i] = null; // Não controla nenhum objeto (Pessoa)
        JOptionPane.showMessageDialog(null, "Fila criada com sucesso!");
    }
    
    private boolean vazia(){
        if ((head==tail) && (head == -1))
            return true;
        else
            return false;
    }
    
    private boolean cheia(){
        if (tail == 4)
            return true;
        else
            return false;
    }
    
    public void push(Pessoa aux){
        if (vazia()){
            head = tail = 0;
            elementos[tail] = aux;
            JOptionPane.showMessageDialog(null, "Pessoa inserida com sucesso!");
        }
        else{   // As posicoes vao de 0 até 4 ( 0, 1, 2, 3 e 4)
            if (cheia()){
                JOptionPane.showMessageDialog(null, "Impossível Inserir, FILA CHEIA!");
            }
            else{
                tail++;
                elementos[tail] = aux;
                JOptionPane.showMessageDialog(null, "Pessoa inserida com sucesso!");
            }
        }
    }
    
    public void print(){
        if (vazia()){
            JOptionPane.showMessageDialog(null, "Impossível imprimir, FILA VAZIA!");
        }
        else{
            JOptionPane.showMessageDialog(null, "As Pessoas na FILA são:");
            for (int i = head; i<=tail; i++)
                JOptionPane.showMessageDialog(null, elementos[i].toString());
            JOptionPane.showMessageDialog(null, "**** FIM DA FILA ****");
        }
    }
    
    public void pop(){
        if (vazia()){
            JOptionPane.showMessageDialog(null, "Impossível REMOVER, FILA VAZIA!");
        }
        else{
            //Vai deslocar cada Pessoa na FILA, uma posição para a esquerda (Até a CAUDA - FINAL DA FILA)
            for (int i=head; i<tail ;i++)
                elementos[i] = elementos[i+1];
            elementos[tail]=null;//Para remover a referência da última Pessoa na CAUDA
            tail--;//Ajusto o valor da CAUDA
            if (tail == -1)
                head = tail; // Ajusto o Valor da Cabeça para -1 (Igual a fila criada vazia!)
            JOptionPane.showMessageDialog(null, "Pessoa Removida da Fila");
        }
    }
    public void quantidadePessoas(){
        if(vazia()){
            JOptionPane.showMessageDialog(null, "Não há pessoas na fila!");
        }
        else{
            int quantia = this.tail + 1;
            JOptionPane.showMessageDialog(null, "Há " + quantia + " pessoa(s) na fila!");
            
        }
    }
    
    public void procuraPessoa(){
        if(vazia()){
            JOptionPane.showMessageDialog(null, "Não há pessoas na fila!");
        }
        else{
            int j = 0;
            String nome = JOptionPane.showInputDialog(null, "Informe o nome da pessoa procurada:");
            for (int i=head; i<=tail  ;i++){
                if(elementos[i].getNome().equals(nome)){
                    j++;
                }
            }
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