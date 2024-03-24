import java.util.Scanner;

public class CalculadoraArenaRevoco {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese las medidas de la pared en metros:");
        System.out.print("Largo: ");
        double largoPared = scanner.nextDouble();
        System.out.print("Alto: ");
        double altoPared = scanner.nextDouble();
        
       
        double areaPared = calcularAreaPared(largoPared, altoPared);
        
        
        double cantidadArena = calcularCantidadArena(areaPared);
        
       
        System.out.println("\nLa cantidad de arena necesaria para revocar la pared es: " + cantidadArena + " metros cúbicos.");
        
        
        scanner.close();
    }
    
    
    public static double calcularAreaPared(double largo, double alto) {
        return largo * alto;
    }
    
    
    public static double calcularCantidadArena(double areaPared) {
        double arenaPorMetroCuadrado = 0.5; 
        return areaPared * arenaPorMetroCuadrado;
    }
}