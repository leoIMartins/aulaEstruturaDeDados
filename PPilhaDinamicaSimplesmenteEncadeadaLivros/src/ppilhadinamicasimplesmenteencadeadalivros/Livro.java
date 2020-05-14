package ppilhadinamicasimplesmenteencadeadalivros;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private Livro anterior;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anterior = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Livro getAnterior() {
        return anterior;
    }

    public void setAnterior(Livro anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + '}';
    }
    
}
