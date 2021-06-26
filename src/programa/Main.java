package programa;

import java.util.Scanner;

import entidades.Produto_comum;
import entidades.Produto_usado;
import entidades.Produto_importado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

		List<Produto_comum> list = new ArrayList<>();

		System.out.println("Digite a quantidade de produtos: ");
		int N = sc.nextInt();
		char op;
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Produto # " + i + " dados:");
			
			do {
			System.out.println("Comum, usado ou importado? (c/u/i)");
			op = sc.next().charAt(0);
			if (op!='c' && op!='u' && op!='i'){
			System.out.println("Opção inválida!");	
			}
			}while (op!='c' && op!='u' && op!='i');
				
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();

			if (op == 'c') {
				list.add(new Produto_comum(nome, preco));
			}else
			if (op == 'u') {
				System.out.print("Data de fabricação (dd/MM/aaaa): ");
				Date data = sdf.parse(sc.next());
				list.add(new Produto_usado(nome, preco, data));
			}else
			if (op == 'i') {
				System.out.print("Digite o valor do imposto de importação: ");
				double imposto = sc.nextDouble();
				list.add(new Produto_importado(nome, preco, imposto));
			} else {
				System.out.println("Opção inválida! Contador de produto aumento em 1");
				i++;
			}
		}

			System.out.println("Etiquetas de preços: ");
			for (Produto_comum prod : list) { // for-each loop, uso exclusivo para percorrer
				                              // itens em um array
				System.out.println(prod.etiquetaDePreco());
			}
		

		// System.out.println("Comum, usado ou importado? (c/u/i)");
		// char op=sc.next().charAt(0);
		// if (op=='c') {
		// sc.nextLine();
		// String nome=sc.nextLine();
		// double preco=sc.nextDouble();
		//
		// entidade.Produto_comum(String nome, double preco);
		// }

		sc.close();
	
	}
}

