
public class ExemploImpressao {
	
	public static void main (String[] args) {
		System.out.print("Um texto para gente ver\n");
		
		System.out.println("Outro texto para gente ver");
		
		System.out.printf("Mais um texto pra gente ver\n");
		
		String nome = "Joserverson";
		
		int idade = 63;
		
		double peso = 82.5;
		
		System.out.println ( "Nome do " + nome );
		// ou
		System.out.print("Nome do ");
		System.out.println(nome);
		
		System.out.println ("Peso: " + peso);
		System.out.print ("Peso: " + peso + "\n");
		System.out.printf ("Peso: " + peso + "\n");
		
		System.out.printf ("Peso: %.1f\n", peso ); //1.f -> apenas 1 caracter depois da virgula.
		
		System.out.printf ("O nome do cauboi eh %s e ele tem %d anos de idade e pesa %.1fkg\n", nome, idade, peso );
	}
}

