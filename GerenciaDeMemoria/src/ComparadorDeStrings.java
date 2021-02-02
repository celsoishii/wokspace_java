
public class ComparadorDeStrings {
	public static void main(String[] args) {
		String s1, s2;
		
		s1 = new String ("Oi, tudo bem? Vem Sempre aqui?");
		s2 = new String ("Oi, tudo bem? Vem Sempre aqui?");
		
		if (s1 == s2) {
			System.out.println("Apontam para a mesma area de memoria");
		}
		else {;
			System.out.println("Apontam para areas de memorias distintas ");
		}
		
		if (s1.equals(s2)) {
			System.out.println("iguais");
		}
		else {
			System.out.println("diferentes");
		}
		
		s2 = "Agora vai ";
		
		System.out.println ("s1 = "+s1);
		System.out.println("s2 = "+s2);
	}
	

	
}
