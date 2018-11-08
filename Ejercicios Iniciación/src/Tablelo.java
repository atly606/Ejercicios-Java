
public class Tablelo {
	    int dimension;
	    char caracterSinDestapar;
	    char caracterDestapado;
	    char tablero[][];
	    //Mina minas;

	    Tablelo(int dimension, char caracterSinDestapar, char caracterDestapado) {
	        this.dimension = dimension;
	        this.caracterSinDestapar = caracterSinDestapar;
	        this.caracterDestapado = caracterDestapado;

	        tablero = new char[dimension][dimension];

	        for(int i = 1; i < dimension; i++)
	            for(int j=1; j < dimension; j++)
	                tablero[i][j] = caracterSinDestapar;
	        for(int i = 1; i < dimension; i++)
	            tablero[i][0] = '+';
	        for(int j = 1; j < dimension; j++)
	            tablero[0][j] = 'b';

	    }

	    void imprimeTablero()
	    {
	        for(int i=0; i < dimension; i++)
	        {
	            for(int j=0; j < dimension; j++)
	            {
	                System.out.print(tablero[i][j] + "\t");
	            }
	            System.out.println("\n");
	        }
	    }

	    void actualizaTablero(int x, int y)
	    {
	        tablero[x][y] = caracterDestapado;
	    }

	    public static void main(String[] args) {
	        Tablero tablero = new Tablero(4, '#', 'O');
	        Tablero tablero2 = new Tablero(3, '-', 'x');

	        tablero.imprimeTablero();
	        tablero2.imprimeTablero();

	        tablero.actualizaTablero(2, 2);
	        tablero2.actualizaTablero(0, 0);

	        tablero.imprimeTablero();
	        tablero2.imprimeTablero();
	}

}
