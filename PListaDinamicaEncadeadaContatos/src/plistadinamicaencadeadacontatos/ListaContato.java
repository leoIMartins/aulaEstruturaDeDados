package plistadinamicaencadeadacontatos;

public class ListaContato {
    static Contato head, tail;

    public ListaContato() {
        head = tail = null;
        System.out.println("Lista Criada com Sucesso!");
    }
    
    public static void push(Contato aux)
    {
        //Lista Vazia
        if (vazia()) 
        {
            head = tail = aux;
        }
        else{
            //Inserir antes do 1o. elemento da Lista
            if (aux.getNome().compareToIgnoreCase(head.getNome()) < 0){
                aux.setProximo(head);
                head = aux;
            }
            else{
                //Inserir depois do último elemento
                if (aux.getNome().compareToIgnoreCase(tail.getNome()) > 0){
                    tail.setProximo(aux);
                    tail=aux;
                }
                else{
                    // Inserir no "MEIO DA LISTA" (Entre a HEAD e TAIL)
                    Contato aux1=head, aux2=null; // aux1 = proximo  aux2=anterior
                    
                    do{ 
                        if (aux.getNome().compareToIgnoreCase(aux1.getNome())>0){
                            aux2 = aux1;
                            aux1 = aux1.getProximo();
                        }
                        else
                            break;
                    }while(true);
                    aux2.setProximo(aux);
                    aux.setProximo(aux1);
                }
            }
        }
    }
    
    private static boolean vazia(){
        if ((head==tail) && (head==null))
            return (true);
        else
            return (false);
    }
    
    public static void print(){
        if (vazia()){
            System.out.println("Lista Vazia! Impossivel Imprimir!!");
        }
        else{
            Contato aux = head;
            System.out.println("Os elementos da Lista são:");
            do{
                System.out.println(aux.toString());
                aux = aux.getProximo();
            }while(aux!=null);
            System.out.println(">>>>FINAL DOS CONTATOS<<<<");
        }
    }
    
    public static void busca(String nome){
        if (vazia()){
            System.out.println("Impossivel Localizar Nome, LISTA VAZIA!!!");
        }
        else{
            Contato aux = head;
            Boolean achou = false;
            System.out.println(">>>Localizando Contato.....");
            do{
                if(aux.getNome().equals(nome)){
                    System.out.println("Contato Localizado!");
                    System.out.println(aux.toString());
                    achou=true;
                }
                aux = aux.getProximo();//Vai indo para o proximo contato
            }while(aux!=null);
            if (achou==false)
                System.out.println("Contato nao localizado na lista!!!");
        }
           
    }
}
