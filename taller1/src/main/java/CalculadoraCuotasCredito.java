import java.util.Scanner;

public class CalculadoraCuotasCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingrese el valor del crédito: ");
        double valorCredito = scanner.nextDouble();
        
        
        double primeraCuota = valorCredito * 0.5;
        double segundaCuota = valorCredito * 0.35;
        double terceraCuota = valorCredito - primeraCuota - segundaCuota;
        
       
        System.out.println("\nEl valor de la primera cuota es: " + primeraCuota);
        System.out.println("El valor de la segunda cuota es: " + segundaCuota);
        System.out.println("El valor de la tercera cuota es: " + terceraCuota);
        
       
        scanner.close();
    }
}