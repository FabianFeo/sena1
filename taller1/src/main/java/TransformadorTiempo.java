import java.util.Scanner;

public class TransformadorTiempo {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese la medida de tiempo en horas, minutos y segundos:");
        System.out.print("Horas: ");
        int horas = scanner.nextInt();
        System.out.print("Minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Segundos: ");
        int segundos = scanner.nextInt();
        
        
        minutos += segundos / 60;
        segundos %= 60;
        
        
        horas += minutos / 60;
        minutos %= 60;
        
        
        System.out.println("\nLa medida de tiempo transformada es: " + horas + "h " + minutos + "m " + segundos + "s");
        
       
        scanner.close();
    }
}
