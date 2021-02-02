
public class OperacaoCartao {
	public static void main(String[] args) {
		CartaoPrePago c =new CartaoPrePago();
		
		c.setCartaoPrePago ("123.456.789.123","Jose da Silva",25,07,500.00);
		
		System.out.println(c.exibirCartao());
		
		c.creditoConta(1000.0);
		
		System.out.println(c.exibirCartao());
		
		c.compraCartao(800.0);
	
		System.out.println(c.exibirCartao());
	}
}