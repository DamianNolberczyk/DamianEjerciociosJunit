
package sumDigits;

public class SumDigits {
	
	/*
	 * Metodo para realizar la suma de los digitos del valor pasado por parametro
	 * @param num
	 */
	public int sum(int num) {
		int sum=0;
		while(num>0) {
			sum= sum + (num%10);
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		

	}

}


