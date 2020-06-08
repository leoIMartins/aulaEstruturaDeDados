package plistaestaticasequencial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import javax.swing.JOptionPane;

public class Lista_Contato {
    private int n;
    private Contato contatos[] = new Contato[5];

    public Lista_Contato() {
        n = -1;
        for (int i=0; i<contatos.length; i++)
            contatos[i] = null;
        JOptionPane.showMessageDialog(null, "Lista criada com sucesso!");
    }
    
    private boolean vazia(){
        return n == -1;
    }
    
    private boolean cheia(){
        return n == 4;
    }
    
    public void push(Contato aux){
        if (cheia()){
            JOptionPane.showMessageDialog(null, "A lista está cheia!");
        }
        else{
            if (vazia()){
                n = 0;
                contatos[n] = aux;
                JOptionPane.showMessageDialog(null, "Contato inserido com sucesso!");
            }  
            else{
                try {
                    Contato contatoAuxiliar;
                    n ++;
                    contatos[n] = aux;
                    String nomesContatos[] = new String[n+1];
                    for (int i = 0; i <= n; i ++){
                        nomesContatos[i] = contatos[i].getNome();
                    }
                    Arrays.sort(nomesContatos);
                    for (int i = 0; i <= n; i++){
                        if(nomesContatos[i] != contatos[i].getNome()){
                            for (int j = 0; j <= n; j++){
                                if(nomesContatos[i] == contatos[j].getNome()){
                                    contatoAuxiliar = contatos[i];
                                    contatos[i] = contatos[j];
                                    contatos[j] = contatoAuxiliar;
                                }
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Contato inserido com sucesso!");
                } catch (Exception e) {
                    System.out.println(e.getCause());
                }
            }
        }
    }
    
    public void print(){
        if (vazia()){
            JOptionPane.showMessageDialog(null, "A lista está vazia!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Os contatos na lista são:");
            for (int i = 0; i <= n; i++)
                JOptionPane.showMessageDialog(null, contatos[i].toString());
            JOptionPane.showMessageDialog(null, "**** Fim da lista ****");
        }
    }
    
    public void pop(){
        if (vazia()){
            JOptionPane.showMessageDialog(null, "A lista está vazia!");
        }
        else{
            for (int i = 0;i <= n;i++){
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, contatos[i].toString()
                        + "\n1 - Excluir contato"
                        + "\n2 - Próximo contato"
                        + "\nInforme qualquer outro número para voltar ao menu:"));
                if(op == 1){
                    for (int j = i;j < n;j++){
                        contatos[j] = contatos[j+1];
                    }
                    contatos[n] = null;
                    n --;
                    JOptionPane.showMessageDialog(null, "Contato removido da lista!");
                    break;
                }
                else if(op == 2){
                    continue;
                }
                else{
                    break;
                }
            }
        }
    }
    public void quantidadeContatos(){
        if(vazia()){
            JOptionPane.showMessageDialog(null, "Não há contatos na lista!");
        }
        else{
            int quantia = this.n + 1;
            JOptionPane.showMessageDialog(null, "Há " + quantia + " contato(s) na lista!");
        }
    }
    
    public void procuraContato(){
        if(vazia()){
            JOptionPane.showMessageDialog(null, "Não há contatos na lista!");
        }
        else{
            int j = 0;
            String nome = JOptionPane.showInputDialog(null, "Informe o nome do contato procurado:");
            for (int i = 0; i <= n;i++){
                if(contatos[i].getNome().equals(nome)){
                    j++;
                }
            }
            if(j == 0){
                JOptionPane.showMessageDialog(null, "O contato " + nome + " não foi encontrado na lista!");
            }
            else if(j ==1){
                JOptionPane.showMessageDialog(null, "O contato " + nome + " foi encontrado na lista!");
            }
            else{
                JOptionPane.showMessageDialog(null, "O contato " + nome + " foi encontrado " + j + " vezes na lista!");
            }
        }
    }
}