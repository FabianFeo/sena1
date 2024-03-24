import java.util.Scanner;

public class CalcularNotaFinal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese las tres notas del alumno:");
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Nota 4: ");
        double nota4 = scanner.nextDouble();
        
        
        double notaFinal = calcularNotaFinal(nota1, nota2, nota3, nota4);
        
       
        System.out.println("\nLa nota final del alumno es: " + notaFinal);
        
        
        scanner.close();
    }
    
    
    public static double calcularNotaFinal(double nota1, double nota2, double nota3, double nota4) {
        double porcentajeNota1 = 0.15;
        double porcentajeNota2 = 0.20;
        double porcentajeNota3 = 0.30;
        double porcentajeNota4 = 0.35;
        
        double notaFinal = (nota1 * porcentajeNota1) + (nota2 * porcentajeNota2) + (nota3 * porcentajeNota3);
        return notaFinal;
    }
}