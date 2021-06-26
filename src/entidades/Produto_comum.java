package entidades;

public class Produto_comum {

	
	private String nome;
	private double preco;
	
	
	
	
//	@Override
//	public String toString() {
//		return "Produto_comum [nome=" + nome + ", preco=" + preco + "]";
//	}

	public Produto_comum(String nome, double preco) {
//		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String etiquetaDePreco() {
		return nome
				+" $ "
				+String.format("%.2f", preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
