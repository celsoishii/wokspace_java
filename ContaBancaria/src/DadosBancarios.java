
public class DadosBancarios {
	public static void main(String[] args) {
		Correntista c1, c2;
		
		c1 = new Correntista();
		c2 = new Correntista();
		
		c1.nome = "Joao da Silva";
		c1.numeroConta = 100001;
		c1.digitoVerif = 1;
		c1.cpfTitular = "123.456.789-01";
		c1.saldo =  10000.00;
		
		c2.nome = "Maria da Silva";
		c2.numeroConta = 200002;
		c2.digitoVerif = 2;
		c2.cpfTitular = "987.654.321-09";
		c2.saldo =  20000.00;
		
		c1.imprimirInfo1();
		c2.imprimirInfo1();
		
		System.out.println(c1.creditoConta(1000.0));
		System.out.println(c2.creditoConta(1500.0));
		
		c1.imprimirInfo2();
		c2.imprimirInfo2();
		
		System.out.println (c1.debitoConta(15000.0));
		System.out.println (c2.debitoConta(1500.0));
		
		c1.imprimirInfo2();
		c2.imprimirInfo2();
		
		
		
		
		
	}
}
