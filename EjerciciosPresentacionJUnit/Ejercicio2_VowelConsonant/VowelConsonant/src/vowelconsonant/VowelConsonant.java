package vowelconsonant;

public class VowelConsonant {
	
	/*
	 * Metodo para comprovar si el caracter pasado por parametro es una vocal o constante
	 * @param character
	 */
	public String check(String character) {
		String v="vowel";
		String c="consonant";
		
		//Comprobamos si es vocal o consonante 
		if(character=="a" || character=="e" || character=="i" || character=="o" || character=="u") {
			return v;
		}
		else {
			return c;
		}
	}

	public static void main(String[] args) {
		

	}

}
