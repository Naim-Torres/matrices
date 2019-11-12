
/**
 * 4.Hacer un programa que dada una matriz identifique si la suma los valores es igual,
 *  mayor o menor que los valores almacenados en otra matriz
 */
import java.util.Scanner;
public class Matriz4
{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        int matriz[][];
        System.out.println("Digite número de filas de la matriz:");
        int n= sc.nextInt();
        System.out.println("Digite número de columnas de la matriz");
        int m= sc.nextInt();
        matriz= new int [n][m];
        int suma1=0,suma2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz[i][j]= sc.nextInt();
                suma1+=matriz[i][j];
            }
        } 
        int matriz2[][];
        System.out.println("Digite número de filas de la matriz:");
        int n2= sc.nextInt();
        System.out.println("Digite número de columnas de la matriz");
        int m2= sc.nextInt();
        matriz2= new int [n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz2[i][j]= sc.nextInt();
                suma2+=matriz2[i][j];
            }
        }
        
        if(suma1==suma2)System.out.println("La suma es de las matrices es igual");
        if(suma1<suma2)System.out.println("La suma de la primer matriz es menor a la segunda matriz");
        if(suma1>suma2)System.out.println("La suma de la primer matriz es mayor a la segunda matriz");
    }
}
