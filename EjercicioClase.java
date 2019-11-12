import java.util.Scanner;
public class EjercicioClase
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int matriz[][];
        System.out.println("Digite número de filas de la primer matriz:");
        int n= sc.nextInt();
        System.out.println("Digite número de columnas de la segunda matriz");
        int m= sc.nextInt();
        matriz= new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Número en la posición "+(i+1)+" x "+(j+1)+" :");
                matriz[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matriz: "+"\n");

        for (int x=0; x < n; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
             System.out.print(matriz[x][y]);
              if (y!=matriz[x].length-1){ 
                  System.out.print("\t");
                }
            }
             System.out.println("|");
        }
        System.out.println("Matriz invertida: "+"\n");
        for (int x=(n-1); x >= 0; x--) {
            System.out.print("|");
            for (int y=matriz[x].length-1; y >=0; y--) {
             System.out.print(matriz[x][y]);
              if (y!=0){ 
                  System.out.print("\t");
                }
            }
             System.out.println("|");
        }
    }
}
