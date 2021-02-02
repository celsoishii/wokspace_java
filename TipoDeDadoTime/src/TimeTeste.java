
public class TimeTeste {
	public static void main(String[] args) {
		Time t =new Time();
		
		t.setTime (11,20,20);
		
		System.out.println("Hora Universal "+t.exibirHoraUniversal());
		System.out.println("Horas Padrao " +t.exibirHoraPadrao());
			
		t.setTime (12,30,20);
		System.out.println("Hora Universal "+t.exibirHoraUniversal());
		System.out.println("Horas Padrao " +t.exibirHoraPadrao());
			
	}
}
