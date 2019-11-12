
/**
 * Write a description of class Ejercicio15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ejercicio15
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[];
        System.out.println("¿Cúantos numeros almacenara?");
        int n=sc.nextInt();
        array= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite numero de la posicion "+(i));
            array[i]=sc.nextInt();
        }
        System.out.println("Valor que se buscara: ");
        int b= sc.nextInt(),posiciones=0;
        for(int i=0;i<n;i++){
            if(array[i]==b){
                System.out.println("El digito esta en la posicion: "+i);
                posiciones++;
            }
        }
        if(posiciones==0){
                System.out.println("Ese valor no esta en el arreglo");
         }
    }
    public static void man(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[];
        System.out.println("¿Cúantos numeros almacenara?");
        int n=sc.nextInt();
        array= new int[n];
        int i=0;
        while(i<n){
            System.out.println("Digite numero de la posicion "+(i));
            array[i]=sc.nextInt();
            i++;
        }
        System.out.println("Valor que se buscara: ");
        int b= sc.nextInt(),posiciones=0;
        while(i<n){
            if(array[i]==b){
                System.out.println("El digito esta en la posicion: "+i);
                posiciones++;
            }
            i++;
        }
        if(posiciones==0){
                System.out.println("Ese valor no esta en el arreglo");
         }
    }
    public static void matn(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[];
        System.out.println("¿Cúantos numeros almacenara?");
        int n=sc.nextInt();
        array= new int[n];
        int i=0;
        do{
            System.out.println("Digite numero de la posicion "+(i));
            array[i]=sc.nextInt();
            i++;
        }while(i<n);
        System.out.println("Valor que se buscara: ");
        int b= sc.nextInt(),posiciones=0;
        do{
            if(array[i]==b){
                System.out.println("El digito esta en la posicion: "+i);
                posiciones++;
            }
            i++;
        }while(i<n);
        if(posiciones==0){
                System.out.println("Ese valor no esta en el arreglo");
         }
    }
}
