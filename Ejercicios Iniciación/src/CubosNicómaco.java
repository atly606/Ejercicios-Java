import java.util.Scanner;

public class CubosNicómaco {
   public static void main(String[] args) {
	   Scanner teclado = new Scanner(System.in);
	   int impar = -1;
	   int n;
	   System.out.println("Numero de cubos a calcular");
	   n = teclado.nextInt();
	   
	   for(int i=1; i<=n; i++) {
	   
	   
	   impar = impar + 2;
	   int suma = impar;
	   for(int j=2; j<=i; j++) {
	   
	   impar = impar + 2;
	   suma = suma + impar;
	   }
		System.out.println(suma);
		
	   
   }
 }
}