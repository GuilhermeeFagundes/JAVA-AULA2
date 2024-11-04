/*
public class VariaveisLocais {
	
	public static void main (String[] args) {
		
		for  ( int contador = 1 ; contador <= 5 ; contador++ ) {
			
			System.out.println ( contador );
			}
			System.out.println ( contador ); // -> não encontra variavel criada dentro do for 
	 }
}
*/


public class VariaveisLocais {
	
	public static void main (String[] args) {
		
		int contador;
		
		for  ( contador = 1 ; contador <= 5 ; contador++ ) {
			
			System.out.println ( contador );
			}
			System.out.println ( contador ); 
	}
}
