import java.util.Scanner;

public class Bomba {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DadosCombustivel c1  = new DadosCombustivel();
		//DadosCombustivel c1  = new DadosCombustivel("Alcool",3.10,0.0,0.0);

	
		int opcao;
		double valor;
		
		c1.nomeCombustivel = "Alcool";
		c1.precoCombustivel = 3.10;
		c1.qtdeCombustivel = 0.0;
		c1.valorPagar  = 0.0;
		

		
		do {
						System.out.println("Digite 1 - Qtde Litros / 2 - Valor / 0 - Encerrar");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.print("Digitea quantidade de litros");
				valor = teclado.nextDouble();
				c1.valorLitros(valor);
				break;				
			case 2:
				System.out.print("Digite o valor do abastecimento:");
				valor = teclado.nextDouble();				
				c1.valorDinheiro(valor); 
				break;
		
			case 0:
				System.out.println("Obrigado pela preferencia");
				break;
			default:	
				System.out.println("Opcao invalida! Tente novamente");
			}
			
			
		} while (opcao  != 0);
		teclado.close();
	
		System.out.println(c1.exibirInfo());
	}
		
		
}
	

