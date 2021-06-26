package entidades;

public class Produto_importado extends Produto_comum {

	private double impostoImportacao;

	public Produto_importado(String nome, double preco, double impostoImportacao) {
		super(nome, preco);
		this.impostoImportacao = impostoImportacao;

	}

	public double precoTotal() {
		return getPreco() + impostoImportacao;
	}

	public void etiquetaDePreco(String etiquetaDePreco) {

	}

	public void precoTotal(double precoTotal) {

	}

	public double getImpostoImportacao() {
		return impostoImportacao;
	}

	public void setImpostoImportacao(double impostoImportacao) {
		this.impostoImportacao = impostoImportacao;
	}
	
	
	@Override
	public String etiquetaDePreco() {
		return getNome()
				+" $ "
				+String.format("%.2f", precoTotal())
				+ " (Imposto de importação: $ " 
				+ String.format("%.2f", impostoImportacao)
				+ ")";
	}
}
