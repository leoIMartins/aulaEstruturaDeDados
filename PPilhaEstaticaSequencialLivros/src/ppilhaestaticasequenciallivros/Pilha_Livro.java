package ppilhaestaticasequenciallivros;

public class Pilha_Livro {
    static int topo;
    static Livro elementos[] = new Livro[5];

    public Pilha_Livro() {
        topo = -1; /* Posicao de Controle - Invalida */
        for(int i=0; i<elementos.length ;i++)
            elementos[i]=null;
        System.out.println("Pilha Criada com Sucesso!!!");
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
            System.out.println("Impossivel Remover, Pilha VAZIA!");
        }
        else
        {
            elementos[topo]=null;  //Removendo o Livro da Posição do Topo
            topo--;
            System.out.println("Elemento Removido!");
        }
    }
    
    public static void push(Livro livro){// Empilhar
        if(cheia())
        {
            System.out.println("Impossivel Inserir, pois Pilha está cheia!");
        }
        else
        {
            topo++; //Alterar topo para a posicao aonde será inserido o novo livro
            elementos[topo]=livro;
        }
    }
    
    public static void print(){
        if (vazia()){
            System.out.println("Pilha Vazia!");
        }
        else
        {
            System.out.println("Os elementos da Pilha são:");
            for (int i=topo; i>=0  ;i--){
                System.out.println(elementos[i].toString());
            }
        }
    }
}
