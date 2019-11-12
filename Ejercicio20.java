
/**
 * Write a description of class Ejercicio20 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ejercicio20
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[],array1[];
        System.out.println("Cuantos digitos tendra el primer arreglo");
        int n1= sc.nextInt();
        System.out.println("Cuantos digitos tendra el segundo arreglo");
        int n2= sc.nextInt();
        array= new int[n1];
        array1 = new int[n2];
        int suma1= 0,suma2=0;
        for(int i =0; i<n1;i++){
             System.out.println("Digito en la posicion "+(i+1)+" del primer arreglo");
             array[i]= sc.nextInt();
             suma1+=array[i];
        }
        for(int i=0;i<n2;i++){
            System.out.println("Digito en la posicion "+(i+1)+" del segundo arreglo");
            array1[i]= sc.nextInt();
            suma2+= array1[i];
        }
        if(suma1>suma2){
            System.out.println("La suma del primer arreglo es: "+suma1+" la suma del segundo es: "+suma2+" Entonces el arreglo 1 es mayor al 2");
        }
        if(suma2>suma1){
            System.out.println("La suma del primer arreglo es: "+suma1+" la suma del segundo es: "+suma2+" Entonces el arreglo 2 es mayor al 1");
        }
        if(suma2==suma1){
            System.out.println("Ambos son iguales");
        }
    }
    public static void man(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[],array1[];
        System.out.println("Cuantos digitos tendra el primer arreglo");
        int n1= sc.nextInt();
        System.out.println("Cuantos digitos tendra el segundo arreglo");
        int n2= sc.nextInt();
        array= new int[n1];
        array1 = new int[n2];
        int suma1= 0,suma2=0;
        int i=0,j=0;
        while(i<n1){
             System.out.println("Digito en la posicion "+(i+1)+" del primer arreglo");
             array[i]= sc.nextInt();
             suma1+=array[i];
             i++;
        }
        while(j<n2){
            System.out.println("Digito en la posicion "+(j+1)+" del segundo arreglo");
            array1[j]= sc.nextInt();
            suma2+= array1[j];
            j++;
        }
        if(suma1>suma2){
            System.out.println("La suma del primer arreglo es: "+suma1+" la suma del segundo es: "+suma2+" Entonces el arreglo 1 es mayor al 2");
        }
        if(suma2>suma1){
            System.out.println("La suma del primer arreglo es: "+suma1+" la suma del segundo es: "+suma2+" Entonces el arreglo 2 es mayor al 1");
        }
        if(suma2==suma1){
            System.out.println("Ambos son iguales");
        }
    }
    public static void mafn(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[],array1[];
        System.out.println("Cuantos digitos tendra el primer arreglo");
        int n1= sc.nextInt();
        System.out.println("Cuantos digitos tendra el segundo arreglo");
        int n2= sc.nextInt();
        array= new int[n1];
        array1 = new int[n2];
        int suma1= 0,suma2=0;
        int i=0,j=0;
        do{
             System.out.println("Digito en la posicion "+(i+1)+" del primer arreglo");
             array[i]= sc.nextInt();
             suma1+=array[i];
             i++;
        }while(i<n1);
        do{
            System.out.println("Digito en la posicion "+(j+1)+" del segundo arreglo");
            array1[j]= sc.nextInt();
            suma2+= array1[j];
            j++;
        }while(j<n2);
        if(suma1>suma2){
            System.out.println("La suma del primer arreglo es: "+suma1+" la suma del segundo es: "+suma2+" Entonces el arreglo 1 es mayor al 2");
        }
        if(suma2>suma1){
            System.out.println("La suma del primer arreglo es: "+suma1+" la suma del segundo es: "+suma2+" Entonces el arreglo 2 es mayor al 1");
        }
        if(suma2==suma1){
            System.out.println("Ambos son iguales");
        }
    }
}
