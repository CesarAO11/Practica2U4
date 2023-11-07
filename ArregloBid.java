
package arreglobid;

/**
 *
 * @author Cesar Arcos Ortega
 */
public class ArregloBid {

  
    public static void main(String[] args) {
        int filas = 3;
int columnas = 5;
char[][] arregloBidimensional = new char[filas][columnas];

arregloBidimensional[0][0] = 'A';
arregloBidimensional[0][1] = 'B';
arregloBidimensional[0][2] = 'C';
arregloBidimensional[0][3] = 'D';
arregloBidimensional[0][4] = 'E';

arregloBidimensional[1][0] = 'F';
arregloBidimensional[1][1] = 'G';
arregloBidimensional[1][2] = 'H';
arregloBidimensional[1][3] = 'I';
arregloBidimensional[1][4] = 'J';

arregloBidimensional[2][0] = 'K';
arregloBidimensional[2][1] = 'L';
arregloBidimensional[2][2] = 'M';
arregloBidimensional[2][3] = 'N';
arregloBidimensional[2][4] = 'O';

for (int i = 0; i < filas; i++) {
    for (int j = 0; j < columnas; j++) {
        System.out.print(arregloBidimensional[i][j] + " ");
    }
    System.out.println();
}
    }
    
}
