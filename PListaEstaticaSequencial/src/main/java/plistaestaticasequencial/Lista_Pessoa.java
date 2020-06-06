package plistaestaticasequencial;
import java.util.Arrays;


import javax.swing.JOptionPane;

public class Lista_Pessoa {
    private int n;
    private Pessoa elementos[] = new Pessoa[5];

    public Lista_Pessoa() {
        n = -1; // Posição de Controle "Inválida"
        for (int i=0; i<elementos.length; i++)
            elementos[i] = null; // Não controla nenhum objeto (Pessoa)
        JOptionPane.showMessageDialog(null, "Lista criada com sucesso!");
    }
    
    private boolean vazia(){
        return n == -1;
    }
    
    private boolean cheia(){
        return n == 4;
    }
    
    public void push(Pessoa aux){
        if (vazia()){
            n = 0;
            elementos[n] = aux;
            JOptionPane.showMessageDialog(null, "Pessoa inserida com sucesso!");
        }
        else{
            if (cheia()){
                JOptionPane.showMessageDialog(null, "A lista está cheia!");
            }
            else{
                n ++;
                elementos[n] = aux;
		Arrays.sort(elementos);

                JOptionPane.showMessageDialog(null, "Pessoa inserida com sucesso!");
            }
        }
    }
    
    public void print(){
        if (vazia()){
            JOptionPane.showMessageDialog(null, "A lista está vazia!");
        }
        else{
            JOptionPane.showMessageDialog(null, "As pessoas na lista são:");
            for (int i = 0; i <= n; i ++)
                JOptionPane.showMessageDialog(null, elementos[i].toString());
            JOptionPane.showMessageDialog(null, "**** Fim da lista ****");
        }
    }
    
    public void pop(){
        if (vazia()){
            JOptionPane.showMessageDialog(null, "A lista está vazia!");
        }
        else{
            print();
            String nome = JOptionPane.showInputDialog(null, "Informe o nome da pessoa a ser excluída:");
            for(int i = 0;i <= n;i ++){
                if(elementos[i].getNome().equals(nome)){
                    for(int j = i;j <= n;j ++){
                        elementos[j] = elementos[j+1];
                    }
                }
            }
            elementos[4] = null;
            n --;
            JOptionPane.showMessageDialog(null, "Pessoa removida da lista!");
        }
    }
    /*public void quantidadePessoas(){
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
    }*/
}