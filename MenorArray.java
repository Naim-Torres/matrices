
/**
 * Write a description of class MayorArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MenorArray
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int menor=0;
        int array[];
        
        System.out.println("Digite la longitud del arreglo ");
        int n= sc.nextInt();
        array = new int[n];
        for(int x=0; x<n; x++){
            System.out.println("Digite el numero de la posición "+(x+1));
            array[x]= sc.nextInt();
        }
        menor=array[0];
        for(int i=1;i<=n-1;i++){
            if(menor>array[i]){
            menor= array[i];
        }
    }
        System.out.println(menor);
    }
    
    public static void While(String args[]){
        Scanner sc = new Scanner(System.in);
        int menor=0;
        int array[];
        System.out.println("Digite la longitud del arreglo");
        int n= sc.nextInt();
        array = new int [n];
        int i = 1;
        for(int x=0; x<n; x++){
            System.out.println("Digito de la posicion "+(x+1));
            array[x]= sc.nextInt();
        }
        menor = array[0];
        while(i<=n-1){
            if(menor>array[i]){
                menor= array[i];
            }
            i++;
        }
        System.out.println(menor);
    }
    
    public static void dowhile(String args[]){
        Scanner sc = new Scanner(System.in);
        int menor=0;
        int array[];
        System.out.println("Longitud");
        int n= sc.nextInt();
        array = new int [n];
        int i=0;
        for(int x=0; x<n; x++){
            System.out.println("digito en posicion "+(x+1));
            array[x]= sc.nextInt();
        }
        menor= array[0];
        do{
            if(menor>array[i]){
                menor=array[i];
            }
            i++;
        }
        while(i<n-1);
        System.out.println(menor);
    }
}
