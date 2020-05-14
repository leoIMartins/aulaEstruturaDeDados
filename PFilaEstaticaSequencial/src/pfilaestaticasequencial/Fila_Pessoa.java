package pfilaestaticasequencial;

public class Fila_Pessoa {
    private int head, tail;
    private Pessoa elementos[] = new Pessoa[5];

    public Fila_Pessoa() {
        head = tail = -1; // Posição de Controle "Inválida"
        for (int i=0; i<elementos.length; i++)
            elementos[i] = null; // Não controla nenhum objeto (Pessoa)
        System.out.println("Fila criada com sucesso!");
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
        }
        else{   // As posicoes vao de 0 até 4 ( 0, 1, 2, 3 e 4)
            if (cheia()){
                System.out.println("Impossível Inserir, FILA CHEIA!");
            }
            else{
                tail++;
                elementos[tail] = aux;
            }
        }
    }
    
    public void print(){
        if (vazia()){
            System.out.println("Impossível imprimir, FILA VAZIA!");
        }
        else{
            System.out.println("As Pessoas na FILA são:");
            for (int i = head; i<=tail; i++)
                System.out.println(elementos[i].toString());
            System.out.println("**** FIM DA FILA ****");
        }
    }
    
    public void pop(){
        if (vazia()){
            System.out.println("Impossível REMOVER, FILA VAZIA!");
        }
        else{
            //Vai deslocar cada Pessoa na FILA, uma posição para a esquerda (Até a CAUDA - FINAL DA FILA)
            for (int i=head; i<tail ;i++)
                elementos[i] = elementos[i+1];
            elementos[tail]=null;//Para remover a referência da última Pessoa na CAUDA
            tail--;//Ajusto o valor da CAUDA
            if (tail == -1)
                head = tail; // Ajusto o Valor da Cabeça para -1 (Igual a fila criada vazia!)
            System.out.println("Pessoa Removida da Fila");
        }
    }
}