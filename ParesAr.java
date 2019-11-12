
/**
 * Write a description of class ParesAr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ParesAr
{
  public static void main(String args []){
      Scanner sc = new Scanner(System.in);
      int array[];
      System.out.println("Digite la longitud del arreglo");
      int n= sc.nextInt();
      if(n<=0){
          System.out.println("El numero de puede ser menor o igual a 0");
        }
      array = new int[n];
      for(int x=0;x<n;x++){
          System.out.println("Digite valor de la posición "+(x+1));
          array[x]=sc.nextInt();
        }
      for(int i=0; i<n; i++){
          if(array[i]%2==0){
              System.out.println(array[i]);
            }
        }
    }
    
    
  public static void pares(String args[]){
      Scanner sc = new Scanner(System.in);
      int array[];
      System.out.println("Digite longitud del arreglo");
      int n= sc.nextInt();
      int i=0;
      array = new int[n];
      for(int x=0; x<n; x++){
        System.out.println("Digite valor de la posicion "+(x+1));
        array[x]=sc.nextInt();
      }
      while(i<n){
          if(array[i]%2==0){
              System.out.println(array[i]);
            }
            i++;
        }
    }  
    
  public static void paresdo(String args[]){
      Scanner sc = new Scanner(System.in);
      int array[];
      System.out.println("Longitud: ");
      int n= sc.nextInt();
      int i =0;
      array= new int [n];
      for(int x=0; x<n; x++){
          System.out.println("Posición: "+(x+1));
          array[x]=sc.nextInt();
        }
      do{
          if(array[i]%2==0){
              System.out.println(array[i]);
            }
            i++;
        }
        while(i<n);
    }
}
