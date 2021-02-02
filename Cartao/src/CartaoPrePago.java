
public class CartaoPrePago {

	private String numeroCartao;
	private String nomeTitular;
	private int anoValidade;
	private int mesValidade;
	private double saldo;
	
	public  void setCartaoPrePago(String numero, String nome, int ano, int mes, double saldo) {
		this.numeroCartao=numero;
		this.nomeTitular=nome;
		this.anoValidade=ano;
		this.mesValidade=mes;
		this.saldo=saldo;
			}
	
	public double creditoConta(double valor){
		
		saldo = saldo + valor;
				
		return saldo;
	}
	
	public boolean compraCartao(double valor){
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
	
	public String exibirCartao() {
		String extrato =   "=========================================\n"
	                     + "             Cartão Pre Pago             \n"
				         + "-----------------------------------------\n"
				         + "  Numero Cartão : "+numeroCartao+ "\n"
				         + "  Nome Titular  : "+nomeTitular + "\n"
				         + "  Ano Validade  : " +anoValidade+ "\n"
				         + "  Mes Validade  : "+mesValidade+ "\n"
				         + "  Saldo      R$ : "+saldo+"\n"
				         + "-----------------------------------------";
        return extrato;
	}
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
