import java.text.DecimalFormat;
public class Financiero{
    private double sueldo[] = new double[]{100.00,489.12,12454.12,1234.10,
                              823.05,109.20,5.27,1542.25,839.18,
                              83.99,1295.01,1.75};
    
    public void resolver(){
        double saldoPromedio = 0;
        for (int index = 0 ; index < sueldo.length ; index++) {
            saldoPromedio+= sueldo[index];
        }

        saldoPromedio/=12;
         DecimalFormat formato= new DecimalFormat("#.00");

        System.out.println("$"+formato.format(saldoPromedio));
    }

    public static void main(String[] args) {
        Financiero financiero = new Financiero();
        financiero.resolver();
    }
}