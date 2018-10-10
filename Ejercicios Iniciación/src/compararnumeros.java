import java.util.Random;

public class compararnumeros {
	
	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int numero1 = r.nextInt(1000);
		int numero2 = r.nextInt(1000);
		System.out.println("Numero 1: "+ numero1);
		System.out.println("Numero 2: "+ numero2);
		
		if(numero1 > numero2) {
		System.out.println("El número mayor es: " + numero1);
		
		}
		else {
			System.out.println("El número mayor es: " + numero2);
			
		}
	}
}
