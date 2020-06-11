package plistadinamicaencadeadacontatos;

public class PListaDinamicaEncadeadaContatos {

    public static void main(String[] args) {
        ListaContato meus_contatos = new ListaContato();
        
        Contato c1 = new Contato("Papini", 911);
        Contato c4 = new Contato("Papini", 445566);
        Contato c3 = new Contato("Reinaldo", 988774455);
        Contato c2 = new Contato("Bia", 997884532);
        meus_contatos.push(c2);
        meus_contatos.push(c3);
        meus_contatos.push(c1);
        meus_contatos.push(c4);
        meus_contatos.push(new Contato("Zuleica", 55887799));
        meus_contatos.push(new Contato("Maria", 00000000));
        meus_contatos.push(new Contato("Nilsa", 33225823));
        meus_contatos.push(new Contato("Antonio", 190));
        meus_contatos.push(new Contato("Zivanildo", 666));
        meus_contatos.print();
        
        meus_contatos.busca("Papini");
    }
    
}
