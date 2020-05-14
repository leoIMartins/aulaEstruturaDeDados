package ppilhadinamicasimplesmenteencadeadalivros;

public class Pilha_Livro {
    private Livro topo;

    public Pilha_Livro() {
        this.topo = null; //Criando a pilha Vazia
        System.out.println("PILHA CRIADA COM SUCESSO!");
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
        System.out.println("Elemento Inserido!");
    }
    
    public void pop(){
        if (vazia()){
            System.out.println("Impossível Remover! Pilha Vazia!");
        }
        else{
            topo = topo.getAnterior();
            System.out.println("Elemento Removido!");    
        }
    }
    
    public void print(){
        if (vazia()){
            System.out.println("Pilha Vazia, Impossível Imprimir!");
        }
        else{
            Livro aux = topo;
            do{
                System.out.println(aux.toString());
                aux = aux.getAnterior(); //Vai para o livro anterior (se tiver)
            }while (aux != null);
            System.out.println("Final da Impressao");
        }
    }
}
