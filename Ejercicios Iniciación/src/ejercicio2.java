import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float comision1;
		float comision2;
		float comision3;
		final float sueldo = 1200;
		final float porcentaje = 0.1f;
		System.out.println("Valor de la venta 1: ");
		comision1= teclado.nextFloat();
		
		System.out.println("Valor de la venta 2: ");
		comision2= teclado.nextFloat();
		
		System.out.println("Valor de la venta 3: ");
		comision3= teclado.nextFloat();
		
		System.out.println("Valor comision1: "+comision1);
		System.out.println("Valor comision2: "+comision2);
		System.out.println("Valor comision3: "+comision3);
		
		System.out.println("Sueldo Final:" + (comision1*porcentaje + comision2*porcentaje + comision3*porcentaje) * sueldo);
		teclado.close();
		
	}
}
