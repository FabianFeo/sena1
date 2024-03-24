import java.util.Scanner;

public class CalculadoraVentas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese el nombre y las ventas de cada empleado:");
        System.out.println("(Por favor, ingrese las ventas en color rojo como se indica en la tabla)");
        String[] empleados = {"Pedro", "Juan", "María", "Ana", "David"};
        double[] ventas = new double[5];
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ventas de " + empleados[i] + ": ");
            ventas[i] = scanner.nextDouble();
        }
        
        
        double ventaEneroPedro = 2 * ventas[1];
        double ventaEneroMaria = ventas[3] / 2;
        double ventaFebreroAna = 3 * (ventas[1] + ventas[4]);
        double ventaMarzoJuan = 2 * (ventas[1] / 4);
        double ventaFebreroDavid = ventas[3] - ventaMarzoJuan;
        double ventaMarzoAna = 0.1 * (ventas[1] + ventas[0]);
        double ventaMarzoMaria = 1.2 * ventas[1];
        double ventaMarzoDavid = 0.7 * ventas[3];
        double ventaFebreroJuan = 0;
        double ventaEneroJuan = 0;
        
       
        double[] totalVentas = {
            ventas[0] + ventaEneroPedro,
            ventas[1] + ventaEneroJuan + ventaFebreroJuan + ventaMarzoJuan,
            ventas[2] + ventaEneroMaria,
            ventas[3] + ventaFebreroAna + ventaMarzoAna,
            ventas[4] + ventaFebreroDavid + ventaMarzoDavid
        };
        
        
        System.out.println("\nTotal de ventas realizadas por cada empleado:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i] + ": " + totalVentas[i]);
        }
        
   
        scanner.close();
    }
}