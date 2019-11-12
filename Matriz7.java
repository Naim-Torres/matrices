
/**
 * 7.Hacer un programa que lea una matriz de n X m.Y un arreglo tridimensional (llenarlos
 * con valores aleatorios comprendidos entre 1 y 100)y determinar cuántos elementos
 * de la matriz se encuentran en el arreglo tridimensional.
 */
import java.util.Scanner;
public class Matriz7
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matriz[][],array[][][],con=0;
        System.out.println("Digite número de filas de la matriz:");
        int n= sc.nextInt();
        System.out.println("Digite número de columnas de la matriz");
        int m= sc.nextInt();
        matriz= new int [n][m];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matriz[i][j]= (int)(Math.random()*100+1);
            }
        }
        System.out.println("Largo del arreglo: ");
        int x=sc.nextInt();
        System.out.println("Alto del arreglo: ");
        int y =sc.nextInt();
        System.out.println("Ancho del arreglo: ");
        int z = sc.nextInt();
        array= new int[x][y][z];
        for(int i =0; i<x; i++)
        for(int j =0; j<x; j++)
        for(int h =0; h<x; h++){
            array[i][j][h]=(int)(Math.random()*100+1);
         }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                for(int h=0;h<z;h++){
                    for(int a=0;a<n;a++){
                        for(int e=0;e<m;e++){
                            if(array[i][j][h]==matriz[a][e]){c++;}
                        }
                    }
                }
            }
        }
         System.out.println("Hay "+c+" valores de la matriz en el arreglo de tres dimensiones");
    }
}
