/**
 * 1.Realizar un programa que lea una matriz de n X m, y que imprima la matriz transpuesta
 * 
 */
import java.util.Scanner;
public class Matriz1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matriz[][];
        System.out.println("Digite número de filas de la matriz:");
        int n= sc.nextInt();
        System.out.println("Digite número de columnas de la matriz");
        int m= sc.nextInt();
        matriz= new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz[i][j]= sc.nextInt();
            }
        }
        for (int x=0; x < n; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
             System.out.print(matriz[y][x]);
              if (y!=matriz[x].length-1){ 
                  System.out.print("\t");
                }
            }
             System.out.println("|");
        }
    }
    public static void man(String args[]){
        Scanner sc = new Scanner(System.in);
        int matriz[][],i=0,x=0;
        System.out.println("Digite número de filas de la matriz:");
        int n= sc.nextInt();
        System.out.println("Digite número de columnas de la matriz");
        int m= sc.nextInt();
        matriz= new int [n][m];
        while(i<n){
            int j=0;
            while(j<m){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz[i][j]= sc.nextInt();
                j++;
            }
            i++;
        }
        while( x < n) {
            int y=0;
            System.out.print("|");
            while( y < matriz[x].length) {
             System.out.print(matriz[y][x]);
              if (y!=matriz[x].length-1){ 
                  System.out.print("\t");
                }
                y++;
            }
             System.out.println("|");
             x++;
        }
    }
    public static void mand(String args[]){
        Scanner sc = new Scanner(System.in);
        int matriz[][],i=0,x=0;
        System.out.println("Digite número de filas de la matriz:");
        int n= sc.nextInt();
        System.out.println("Digite número de columnas de la matriz");
        int m= sc.nextInt();
        matriz= new int [n][m];
        do{
            int j=0;
            while(j<m){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz[i][j]= sc.nextInt();
                j++;
            }
            i++;
        }while(i<n);
        do{
            int y=0;
            System.out.print("|");
            while( y < matriz[x].length) {
             System.out.print(matriz[y][x]);
              if (y!=matriz[x].length-1){ 
                  System.out.print("\t");
                }
                y++;
            }
             System.out.println("|");
             x++;
        }while( x < n) ;
    }
}
