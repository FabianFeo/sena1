
import java.util.Scanner;

  public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
  
        System.out.print("Ingrese la velocidad del automóvil en metros por segundo: ");
        double velocidadMetrosPorSegundo = scanner.nextDouble();
        
    
        double velocidadKilometrosPorHora = metrosPorSegundoAKilometrosPorHora(velocidadMetrosPorSegundo);
        
       
        System.out.println("La velocidad del automóvil es de " + velocidadKilometrosPorHora + " kilómetros por hora.");
        
   
        scanner.close();
    }
    

    public static double metrosPorSegundoAKilometrosPorHora(double velocidadMetrosPorSegundo) {
        return velocidadMetrosPorSegundo * 3.6; 
    }
