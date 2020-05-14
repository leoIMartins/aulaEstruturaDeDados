package pfilaestaticasequencial;

public class PFilaEstaticaSequencial {

    public static void main(String[] args) {
        Fila_Pessoa minha_fila = new Fila_Pessoa();

        minha_fila.print();
        
        Pessoa p1 = new Pessoa("Fabio", "123.456.789-00");
        minha_fila.push(p1);
        minha_fila.push(new Pessoa("Antonio", "000.111.222-33"));
        minha_fila.push(new Pessoa("Paulo", "321.654.987-00"));
        minha_fila.push(new Pessoa("Willy", "911.911.911-00"));
        minha_fila.push(new Pessoa("Wonka", "190.190.190-00"));
        minha_fila.print();
        minha_fila.pop();
        minha_fila.pop();
        minha_fila.pop();
        minha_fila.pop();
        minha_fila.pop();
        
        minha_fila.print();
        minha_fila.push(new Pessoa("Zé", "CPF BLOQUEADO"));
        minha_fila.print();
    }
    
}
