
/**
 * 1.Hacer un programa que dadas dos arreglos tridimensionales (largo X ancho X altura),
 * agregarle números aleatorios comprendidos entre 1 y 5,000 y que determine en que
 * posiciones se encuentran los números primos en el arreglo y cuantos hay.
 */
import java.util.Scanner;
public class Matriz10
{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        int array[][][],array1[][][];
        System.out.println("Largo del arreglo 1: ");
        int x=sc.nextInt();
        System.out.println("Alto del arreglo 1: ");
        int y =sc.nextInt();
        System.out.println("Ancho del arreglo 1: ");
        int z = sc.nextInt();
        array= new int[x][y][z];
        int primos1=0,primos2=0,c=0;;
        for(int i =0; i<x; i++){
        for(int j =0; j<y; j++){
        for(int h =0; h<z; h++){
            array[i][j][h]=(int)(Math.random()*5000)+1;
            int num=array[i][j][h];
            for(int a = 1; a <= num; a++){
                if(num%a==0){
                 c++;
                }}
            if(c==2){
                    primos1++;
                    System.out.println("Posicion numero primo primer arreglo: "+"("+i+","+j+","+h+")");
            }else{c=0;}
             
            }
        }
        }
        System.out.println("Largo del arreglo 2: ");
        int x1=sc.nextInt();
        System.out.println("Alto del arreglo 2: ");
        int y1 =sc.nextInt();
        System.out.println("Ancho del arreglo 2: ");
        int z1 = sc.nextInt();
        array1= new int[x1][y1][z1];
        for(int i =0; i<x1; i++)
        for(int j =0; j<y1; j++)
        for(int h =0; h<z1; h++){
            array1[i][j][h]=(int)(Math.random()*5000+1);
            int num=array1[i][j][h];
            for(int a = 1; a <= num; a++){
                if(num%a==0){
                 c++;
                }}
            if(c==2){
                    primos2++;
                    System.out.println("Posicion numero primo segundo arreglo: "+"("+i+","+j+","+h+")");
            }else{c=0;}
        }
        System.out.println("El arreglo 1 tiene "+primos1+" números primos"+"\n"+"El arreglo 2 tiene "+primos2+" números primos");;
    }
}
