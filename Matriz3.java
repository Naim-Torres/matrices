import java.util.Scanner;
public class Matriz3
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int matriz1[][],contador=0;
        System.out.println("Digite número de filas de la primer matriz:");
        int n1= sc.nextInt();
        System.out.println("Digite número de columnas de la primer matriz");
        int m1= sc.nextInt();
        matriz1= new int [n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz1[i][j]= sc.nextInt();
            }
        }
        int matriz2[][];
        System.out.println("Digite número de filas de la segunda matriz:");
        int n2= sc.nextInt();
        System.out.println("Digite número de columnas de la segunda matriz");
        int m2= sc.nextInt();
        matriz2= new int [n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz2[i][j]= sc.nextInt();
            }
        }
        int matriz3[][];
        System.out.println("Digite número de filas de la tercer matriz:");
        int n3= sc.nextInt();
        System.out.println("Digite número de columnas de la tercer matriz");
        int m3= sc.nextInt();
        matriz3= new int [n3][m3];
        for(int i=0;i<n3;i++){
            for(int j=0;j<m3;j++){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz3[i][j]= sc.nextInt();
            }
        }
        if(matriz1.length==matriz2.length && matriz2.length==matriz3.length && m1==m2 && m2==m3){
            for(int a=0;a<matriz1.length;a++){
                if(matriz1[a][a]==matriz2[a][a] && matriz2[a][a]==matriz3[a][a]){
                    contador++;
                }
            }
            if(contador==n1 || contador==m1){
                System.out.println("Las digonales son iguales");
            }
        }else{
            System.out.println("Las digonales no son iguales");
        }
        
    }
}