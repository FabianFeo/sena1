import java.util.Scanner;

public class CalculadoraAlambre {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el largo del campo en metros: ");
        double largoCampo = scanner.nextDouble();
        System.out.print("Ingrese el ancho del campo en metros: ");
        double anchoCampo = scanner.nextDouble();
        
        
        double perimetro = 2 * (largoCampo + anchoCampo);
        
        
        double metrosAlambre = 5 * perimetro;
        
        
        double rendimientoAlambre = 145; 
        double areaHectareas = (largoCampo * anchoCampo) / 10000; 
        double alambreKg = (rendimientoAlambre * areaHectareas) * 100; 
        
        
        int metrosPorRollo = 200;
        int rollosAlambre = (int) Math.ceil(metrosAlambre / metrosPorRollo);
        
        
        System.out.println("\nMetros de alambre de púas necesarios: " + metrosAlambre + " metros");
        System.out.println("Cantidad de kg de alambre esperada: " + alambreKg + " kg");
        System.out.println("Cantidad de rollos de alambre requeridos: " + rollosAlambre + " rollos");
        
        
        scanner.close();
    }
}
