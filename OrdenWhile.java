
/**
 * Write a description of class OrdenWhile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class OrdenWhile
{
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
}
