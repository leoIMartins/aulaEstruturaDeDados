package pfiladinamicasimplesmenteencadeada;

public class Pessoa {
    private String nome;
    private String fone;
    private Pessoa proximo;

    public Pessoa(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
        this.proximo = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Pessoa getProximo() {
        return proximo;
    }

    public void setProximo(Pessoa proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", fone=" + fone + '}';
    }
}
