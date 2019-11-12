
/**
 * Write a description of class SumaArreglo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SumaArreglo
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[];
        System.out.println("Longitud ");
        int n= sc.nextInt();
        array= new int [n];
        int suma=0;
        
        for(int x=0;x<n;x++){
            System.out.println("Digito en la posicion "+(x+1));
            array[x]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            suma= suma+array[i];
        }
        System.out.println(suma);
    }
    
    public static void mani(String args[]){
        Scanner sc= new Scanner(System.in);
        int array[];
        System.out.println("Longitud ");
        int n= sc.nextInt();
        array= new int[n];
        int i=0,suma=0;
        for(int y=0;y<n;y++){
            System.out.println("Digito "+(y+1));
            array[y]=sc.nextInt();
        }
        while(i<n){
            suma= suma+array[i];
            i++;
        }
        System.out.println(suma);
    }
    
    public static void man(String args[]){
        Scanner sc= new Scanner(System.in);
        int array[];
        System.out.println("Longitud ");
        int n = sc.nextInt();
        array= new int[n];
        int i=0;
        int suma=0;
        for(int x=0;x<n;x++){
            System.out.println("Digito posicion "+(x+1));
            array[x]=sc.nextInt();
        }
        do{
            suma= suma+array[i];
            i++;
        }
        while(i<n);
        System.out.println("La suma es: "+suma);
    }   
}
