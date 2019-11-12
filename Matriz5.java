
/**
 * 5.Hacer un programa de un arreglo de tres dimensiones (lar, ancho y alto), donde en 
 * cada celda se guarde un número al azar entre 1 y 20. Después leer desde el teclado un número 
 * y escribir en pantalla la posición o posiciones en que se encuentra ese número.
 */
import java.util.Scanner;
public class Matriz5
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[][][];
        System.out.println("Largo del arreglo: ");
        int x=sc.nextInt();
        System.out.println("Alto del arreglo: ");
        int y =sc.nextInt();
        System.out.println("Ancho del arreglo: ");
        int z = sc.nextInt();
        array= new int[x][y][z];
        System.out.println("Digito a buscar: ");
        int bus= sc.nextInt();
        for(int i =0; i<x; i++)
        for(int j =0; j<x; j++)
        for(int h =0; h<x; h++){
            array[i][j][h]=(int)(Math.random()*20+1);
            if(array[i][j][h]==bus){
                System.out.println("El numero "+bus+" esta en la poscion: "+i+1+" , "+j+1+" , "+ h+1);
            }
        }
        
        
    }
}
