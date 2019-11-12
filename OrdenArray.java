/**
 * Write a description of class OrdenArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class OrdenArray
{
    
    public static void For(String args[]){
     Scanner sc = new Scanner(System.in);
     int array[];
     System.out.println("Digite cantidad de digitos del arreglo");
     int n = sc.nextInt();
     int aux;
     array = new int[n];
     for(int i=0; i<n;i++){
     System.out.println("Digite el número de la posición "+(i+1));
     array[i]= sc.nextInt();
    }
       for(int x=0;x<n-1;x++)
           for(int y=0;y<n-1;y++)
           if(array[y]>array[y+1]){
              aux= array[y];
              array[y]=array[y+1];
              array[y+1]=aux;
            }
            for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        }
    //Aqui inicia con While
    public static void While (String args[]){
        Scanner sc = new Scanner(System.in);
        int aux;
        int array[];
        System.out.println("Digite longitud del arreglo");
        int n = sc.nextInt();
        array = new int[n];
        int j=0;
        int x=0;
        while(j<n){
            System.out.println("Digite numero en la posicion "+(j+1));
            array[j]= sc.nextInt();
            j++;
        }
        while(x<n-1){
            int y=0;
            while(y<n-1){
                if(array[y]>array[y+1]){
                    aux= array[y];
                    array[y]=array[y+1];
                    array[y+1]=aux;
                }
                y++;
            }
            x++;
        }
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        
    }
    //inicia Buerbuja con do While 
    public static void dowhile (String args []){
        Scanner sc = new Scanner(System.in);
        int aux;
        int array[];
        System.out.println("Digite la longitud del arreglo");
        int n = sc.nextInt();
        array = new int[n];
        int i = 0;
        int x = 0;
        do{
            System.out.println("Digite numero de la posicion "+(i+1));
            array[i]= sc.nextInt();
            i++;
        }
        while(i<n);
        
        do{
            int y=0;
            do{
            if(array[y]>array[y+1]){
                aux= array[y];
                array[y]=array[y+1];
                array[y+1]=aux;
            }
            y++;
        }
        while(y<n-1);
        x++;
        }
        while(x<n-1);
       for(int h=0; h<n ; h++)
       System.out.println(array[h]);
    }    
  }

