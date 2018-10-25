
public class Tirangulodenumeros {
   public static void main(String[] args) {
	   int num = 5;
	   int cont = 0;
	   for (int i = 1; i <= num; i++) {
	       cont +=2;
	       for (int j = 0; j < num-i; j++) {
	           System.out.print(" ");
	       } 
	       for (int k = i; k < cont; k++) {
	           System.out.print(k);
	       }
	       for (int l = cont-2; l >= i; l--) { 
	          System.out.print(l);
	       }

	       System.out.println("");
	   }
   }
}
