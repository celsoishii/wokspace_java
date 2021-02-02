public class Correntista {
	 String nome;
	 int numeroConta;
	 int digitoVerif;
	 String cpfTitular;
	 double saldo;
	 
	 void imprimirInfo1(){
			System.out.println(" Nome: "+nome);
			System.out.println("Conta : "+numeroConta+"-"+digitoVerif);
			System.out.println("CPF : "+cpfTitular);
			System.out.println("Saldo : "+saldo);
		}
	 
	double creditoConta(double valor){
			
		saldo = saldo + valor;
				
		return saldo;
	}
	 
	 void imprimirInfo2(){
						System.out.println("Saldo : "+saldo);
}

	 boolean debitoConta(double valor){
			boolean Debitar;
			if (saldo >valor) {
				saldo = saldo - valor;
				Debitar = true;
			}
			else {
			    Debitar = false;
			}
			return Debitar;
		}

}
