
package ejercicion10a;

import java.util.Arrays;
import java.util.Scanner;

/**10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
* A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
* programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
* pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
* 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
* elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
* elementos y el combinado de 20.
**/

public class EjercicioN10a {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
         Double [] vectorA = new Double [50];
         Double [] vectorB = new Double [20];
         
        for (int i = 0; i <vectorA.length; i++) {
          vectorA[i]=(Math.random()*10);  
      }
        
        System.out.println( Arrays.toString(vectorA)+", ");
        System.out.println(" \nahora lo vamos a ordenar de menor a mayor");
        
        Arrays.sort(vectorA);
        
        System.out.println( "\n"+Arrays.toString(vectorA)+",");
        System.out.println("\nahora vamos arellenar el arreglo B con las condiciones dada");
        System.out.println("los 10 primero numero del arreglo A y lo demas con 0.5");
                
        System.arraycopy(vectorA, 0, vectorB, 0, 10);

        Arrays.fill(vectorB,10,vectorB.length, 0.5 );
  
        System.out.println( "\n"+Arrays.toString(vectorB)+",");
         
    } 
}
