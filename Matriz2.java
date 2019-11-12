//2.Hacer un programa que lea dos matriz de n X m, y que las multiplique

import java.util.Scanner;
public class Matriz2
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int matriz1[][];
        System.out.println("Digite número de filas de la primer matriz:");
        int n1= sc.nextInt();
        System.out.println("Digite número de columnas de la primer matriz");
        int m1= sc.nextInt();
        matriz1= new int [n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz1[i][j]= sc.nextInt();
            }
        }
        int matriz2[][];
        System.out.println("Digite número de filas de la segunda matriz:");
        int n2= sc.nextInt();
        System.out.println("Digite número de columnas de la segunda matriz");
        int m2= sc.nextInt();
        matriz2= new int [n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz2[i][j]= sc.nextInt();
            }
        }
        
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[0].length;j++){
                System.out.print(matriz1[i][j]+" x "+matriz2[i][j]+" = "+matriz1[i][j]*matriz2[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    public static void masin(String args[]){
        Scanner sc= new Scanner(System.in);
        int matriz1[][],i=0,a=0;
        System.out.println("Digite número de filas de la primer matriz:");
        int n1= sc.nextInt();
        System.out.println("Digite número de columnas de la primer matriz");
        int m1= sc.nextInt();
        matriz1= new int [n1][m1];
        while(i<n1){
            int j=0;
            while(j<m1){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz1[i][j]= sc.nextInt();
                j++;
            }
            i++;
        }
        i=0;
        int matriz2[][];
        System.out.println("Digite número de filas de la segunda matriz:");
        int n2= sc.nextInt();
        System.out.println("Digite número de columnas de la segunda matriz");
        int m2= sc.nextInt();
        matriz2= new int [n2][m2];
        while(i<n2){
            int j=0;
            while(j<m2){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz2[i][j]= sc.nextInt();
                j++;
            }
            i++;
        }
        
        while(a<matriz1.length){
            int j=0;
            while(j<matriz1[0].length){
                System.out.print(matriz1[a][j]+" x "+matriz2[a][j]+" = "+matriz1[a][j]*matriz2[a][j]+"\t");
                j++;
            }
            System.out.print("\n");
            a++;
        }
    }
    public static void msin(String args[]){
        Scanner sc= new Scanner(System.in);
        int matriz1[][],i=0,a=0;
        System.out.println("Digite número de filas de la primer matriz:");
        int n1= sc.nextInt();
        System.out.println("Digite número de columnas de la primer matriz");
        int m1= sc.nextInt();
        matriz1= new int [n1][m1];
        do{
            int j=0;
            do{
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz1[i][j]= sc.nextInt();
                j++;
            }while(j<m1);
            i++;
        }while(i<n1);
        i=0;
        int matriz2[][];
        System.out.println("Digite número de filas de la segunda matriz:");
        int n2= sc.nextInt();
        System.out.println("Digite número de columnas de la segunda matriz");
        int m2= sc.nextInt();
        matriz2= new int [n2][m2];
        do{
            int j=0;
            do{
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz2[i][j]= sc.nextInt();
                j++;
            }while(j<m2);
            i++;
        }while(i<n2);
        
        do{
            int j=0;
            do{
                System.out.print(matriz1[a][j]+" x "+matriz2[a][j]+" = "+matriz1[a][j]*matriz2[a][j]+"\t");
                j++;
            }while(j<matriz1[0].length);
            System.out.print("\n");
            a++;
        }while(a<matriz1.length);
    }
}
