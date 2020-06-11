package plistadinamicaencadeadacontatos;

public class Contato {
    private String nome;
    private int numero;
    private Contato proximo;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.proximo = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Contato getProximo() {
        return proximo;
    }

    public void setProximo(Contato proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", numero=" + numero + '}';
    }
}
