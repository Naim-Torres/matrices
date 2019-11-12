
/**
 * Write a description of class SumaImpares here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SumaImpares
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
            if(array[i]%2!=0){
                suma= suma+array[i];
            }
        }
        System.out.println(suma);
    } 
   public static void man(String args[]){
       Scanner sc = new Scanner(System.in);
       int array[];
       System.out.println("Longitud:");
       int n = sc.nextInt();
       array= new int [n];
       int suma=0;
       int i=0;
       for(int x=0;x<n;x++){
           System.out.println("Digito en posicion "+(x+1));
           array[x]=sc.nextInt();
        }
       while(i<n){
           if(array[i]%2!=0){
           suma= suma+array[i];
           
        }
        i++;
        }
        System.out.println(suma);
    }
    
    public static void mani(String args[]){
        Scanner sc= new Scanner(System.in);
        int array[];
        System.out.println("Longitud:");
        int n = sc.nextInt();
        array= new int [n];
        int suma=0;
        int i=0;
        for(int x =0; x<n;x++){
            System.out.println("Digito posicion "+(x+1));
            array[x]=sc.nextInt();
        }
        do{
            if(array[i]%2!=0){
                suma= suma+array[i];
            }
            i++;
        }
        while(i<n);
        System.out.println(suma);
    }
}
