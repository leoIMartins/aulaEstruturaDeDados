public class Pessoa{

    private String nome;
    private String cpf;
    private String sexo;

    public Pessoa(String nome, String cpf, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public Pessoa() {

    }
    
    public void setNome (String nome) {
		this.nome = nome;
    }
    
    public void setCpf (String cpf)	{
		this.cpf = cpf;
    }
    
    public void setSexo (String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
    }
    
    public String getCpf() {
		return cpf;
    }
    
    public String getSexo() {
		return sexo;
	}
}