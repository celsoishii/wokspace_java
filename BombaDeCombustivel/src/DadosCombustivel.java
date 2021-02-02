
public class DadosCombustivel {
	private String nomeCombustivel;
	private double precoCombustivel;
	private double qtdeCombustivel;
	private double valorPagar;


	public DadosCombustivel(String nome, double preco, double litros, double pagar) {
		this.nomeCombustivel = nome;
		this.precoCombustivel = preco;
		this.qtdeCombustivel = litros;
		this.valorPagar  = pagar;
		
	}

	public String getnomeCombustivel() {
		return nomeCombustivel;
	}
	public void setnomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}
	
	public double getprecoCombustivel() {
		return precoCombustivel;
	}
	public void setprecoCombustivel(double precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}

	public double getqtdeCombustivel() {
		return qtdeCombustivel;
	}
	public void setqtdeCombustivel(double qtdeCombustivel) {
		this.qtdeCombustivel = qtdeCombustivel;
	}

	public double getvalorPagar() {
		return valorPagar;
	}
	public void setvalorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public String exibirInfo() {
		return nomeCombustivel+"- Valor por Litro - "+precoCombustivel+" Total Litros :" +qtdeCombustivel+"Valor a pagar : R$"+valorPagar; 
	}
	
	public void valorLitros(double valor) {
		this.qtdeCombustivel = valor;
		this.valorPagar = valor * this.precoCombustivel;
	}
	
	public void valorDinheiro(double valor) {
		this.valorPagar = valor;
		this.qtdeCombustivel= valor / this.precoCombustivel;
	
}
}