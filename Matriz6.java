
/**
 * 1.Hacer un programa que lea un arreglo tridimensional (nXmXz), donde n,m y z son de
 * diferente magnitud, almacenar valores aleatorios comprendidos entre cero y 30, y
 * posteriormente calcular cual cara tiene más números impares almacenados.
 */
import java.util.Scanner;
public class Matriz6
{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int array[][][],c1=0,c2=0,c3=0;
       System.out.println("Digite largo: ");
       int n = sc.nextInt();
       System.out.println("Digite alto: ");
       int m = sc.nextInt();
       System.out.println("Digite ancho; ");
       int z= sc.nextInt();
       array = new int [n][m][z];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               for(int h=0;h<z;h++){
                   array[i][j][h]=(int)(Math.random()*30);
                   if(array[i][j][0]%2!=0){c1++;}
                   if(array[i][0][h]%2!=0){c2++;}
                   if(array[0][j][h]%2!=0){c3++;}
                }
            }
        }
        System.out.println(c1+"\t"+c2+"\t"+c3);
       if(c1==c2&&c2==c3){System.out.println("Todas las caras tienen el mismo números de impares");}
       if(c1==c2&&c2>c3){System.out.println("La cara 1 y 2 tiene mas números impares");}
       if(c1==c3&&c3>c2){System.out.println("La cara 1 y 3 tienen mas números impares");}
       if(c2==c3&&c3>c1){System.out.println("La cara 2 y 3 tienen mas números impares");}
       if(c1==c2&&c2<c3){System.out.println("La cara 3 tiene mas números impares");}
       if(c1==c3&&c3<c2){System.out.println("La cara 2 tienen mas números impares");}
       if(c2==c3&&c3<c1){System.out.println("Todas las caras tienen el mismo números de impares");}
       
       if(c1>c2&&c1>c3){System.out.println("La cara 1 tiene más números impares");}
       if(c2>c1&&c2>c3){System.out.println("La cara 2 tiene más números impares");}
       if(c3>c2&&c3>c1){System.out.println("La cara 3 tiene más números impares");}

    }
}
