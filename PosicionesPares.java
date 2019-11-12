

/**
 * Write a description of class PosicionesPares here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PosicionesPares
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int array[];
        System.out.println("Digite longitud del arreglo");
        int n = sc.nextInt();
        array = new int[n];
        for(int x=0; x<n; x++){
            System.out.println("Digite número en la posicion "+(x));
            array[x]=sc.nextInt();
        }
        for(int i =0; i<n; i=i+2)
        System.out.println("Digito en la posicion "+(i)+" ----->" +array[i]);
        
    }
    
    public static void mian(String args[]){
        Scanner sc= new Scanner(System.in);
        int array[];
        System.out.println("Longitud");
        int n = sc.nextInt();
        array = new int[n];
        int i=0;
        for(int x=0;x<n;x++){
            System.out.println("Digito en la posicion "+(x));
            array[x]= sc.nextInt();
        }
        while(i<n){
            System.out.println(array[i]);
            i=i+2;
        }
    }
    
    public static void min(String args[]){
        Scanner sc= new Scanner(System.in);
        int array[];
        System.out.println("Longitud");
        int n = sc.nextInt();
        array = new int[n];
        int i =0;
        for(int x=0; x<n; x++){
            System.out.println("Digito en posicion "+x);
            array[x]= sc.nextInt();
        }
        do{
            System.out.println(array[i]);
            i+=2;
        }
        while(i<n);
    }
}
