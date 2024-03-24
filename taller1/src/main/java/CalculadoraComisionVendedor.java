import java.util.Scanner;

public class CalculadoraComisionVendedor {
    public static void main(String[] args) {
      
        double costoToyota = 16000000;
        double costoMazda = 19500000;
        double costoRenault = 12000000;
        
    
        double comisionToyota = 0.045; 
        double comisionMazda = 0.03;   
        double comisionRenault = 0.024; 
        
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Ingrese el número de vehículos vendidos por marca:");
        System.out.print("Toyota: ");
        int cantidadToyota = scanner.nextInt();
        System.out.print("Mazda: ");
        int cantidadMazda = scanner.nextInt();
        System.out.print("Renault: ");
        int cantidadRenault = scanner.nextInt();
        
      
        double ventasToyota = cantidadToyota * costoToyota;
        double ventasMazda = cantidadMazda * costoMazda;
        double ventasRenault = cantidadRenault * costoRenault;
        
   
        double comisionTotalToyota = ventasToyota * comisionToyota;
        double comisionTotalMazda = ventasMazda * comisionMazda;
        double comisionTotalRenault = ventasRenault * comisionRenault;
        
      
        double totalVentas = ventasToyota + ventasMazda + ventasRenault;
        double totalComisiones = comisionTotalToyota + comisionTotalMazda + comisionTotalRenault;
        
    
        System.out.println("\nResumen de ventas y comisiones:");
        System.out.println("Ventas Toyota: $" + ventasToyota);
        System.out.println("Comisión Toyota: $" + comisionTotalToyota);
        System.out.println("Ventas Mazda: $" + ventasMazda);
        System.out.println("Comisión Mazda: $" + comisionTotalMazda);
        System.out.println("Ventas Renault: $" + ventasRenault);
        System.out.println("Comisión Renault: $" + comisionTotalRenault);
        System.out.println("\nTotal de ventas: $" + totalVentas);
        System.out.println("Total de comisiones: $" + totalComisiones);
        

        double salarioBasico = 1000000; 
        double totalDevengado = salarioBasico + totalComisiones;
        
  
        System.out.println("\nSalario básico mensual del vendedor: $" + salarioBasico);
        System.out.println("Total devengado por el vendedor: $" + totalDevengado);
        
  
        scanner.close();
    }
}