package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto_usado extends Produto_comum {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFabricacao;
	
	

	public Produto_usado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}
	
//	contrutor para receber os dados no Main!!

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	

	@Override
	public String etiquetaDePreco() {
		return getNome()
				+" $ "
				+String.format("%.2f", getPreco())
				+ " (Data de fabricação:  " 
				+ sdf.format(dataFabricacao)          // sdf = simple date format
				+ ")";
	}
	
	
	
	
}
