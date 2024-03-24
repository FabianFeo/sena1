import java.util.Scanner;

public class CalculadoraPromedio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Ingrese la calificación de Matemáticas:");
        double examenMatematicas = pedirCalificacion("Examen", scanner);
        double promedioTareasMatematicas = pedirPromedioTareas(3, scanner);
        
       
        System.out.println("Ingrese la calificación de Física:");
        double examenFisica = pedirCalificacion("Examen", scanner);
        double promedioTareasFisica = pedirPromedioTareas(2, scanner);
        
        
        System.out.println("Ingrese la calificación de Química:");
        double examenQuimica = pedirCalificacion("Examen", scanner);
        double promedioTareasQuimica = pedirPromedioTareas(3, scanner);
        
        
        double promedioMatematicas = calcularPromedio(examenMatematicas, promedioTareasMatematicas, 0.9, 0.1);
        double promedioFisica = calcularPromedio(examenFisica, promedioTareasFisica, 0.8, 0.2);
        double promedioQuimica = calcularPromedio(examenQuimica, promedioTareasQuimica, 0.85, 0.15);
        
       
        double promedioGeneral = (promedioMatematicas + promedioFisica + promedioQuimica) / 3.0;
        
      
        System.out.println("\nPromedio en Matemáticas: " + promedioMatematicas);
        System.out.println("Promedio en Física: " + promedioFisica);
        System.out.println("Promedio en Química: " + promedioQuimica);
        System.out.println("\nPromedio general: " + promedioGeneral);
        
       
        scanner.close();
    }
  
    public static double pedirCalificacion(String tipoExamen, Scanner scanner) {
        System.out.print("Ingrese la calificación del " + tipoExamen + ": ");
        return scanner.nextDouble();
    }
    
  
    public static double pedirPromedioTareas(int numeroTareas, Scanner scanner) {
        double sumaCalificaciones = 0;
        for (int i = 1; i <= numeroTareas; i++) {
            System.out.print("Ingrese la calificación de la tarea " + i + ": ");
            sumaCalificaciones += scanner.nextDouble();
        }
        return sumaCalificaciones / numeroTareas;
    }
    

    public static double calcularPromedio(double calificacionExamen, double promedioTareas, double pesoExamen, double pesoTareas) {
        return (calificacionExamen * pesoExamen) + (promedioTareas * pesoTareas);
    }
}