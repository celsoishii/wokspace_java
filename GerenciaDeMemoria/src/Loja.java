
public class Loja {
	public static void main(String[] args) {
		Produto p1;
		
		p1 = new Produto (1,"Computador",2000.00);
		
		System.out.println(p1.exibirInfo());
		
		Produto p2;
		
		p2 = p1; // foi duplicado a area de memoria ???(n�o)
		
		//simula�ao altearr o preco p2
		// de 2000.00 para 2500.00
		
		// se efetivamente, ao atribuir p2=p1 se n�s duplicassemos a area de memoria, somente p2 seria alterado, mas, a area de memoria � a mesma
		
		p2.setPreco(2500.00);
		
		System.out.println("-----apos a altera��o do pre�o de p2");
		System.out.println("p1 = "+p1.exibirInfo());
		System.out.println("p2 = "+p2.exibirInfo());
		
	}
}
