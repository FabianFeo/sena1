public class CalculadoraSalarios {
    public static void main(String[] args) {
       
        double ventasSemanales = 10000; 
        
        
        double salarioEmpleado1 = 0.1 * ventasSemanales;
        double salarioEmpleado2 = 3 * salarioEmpleado1;
        double salarioEmpleado3 = 0.5 * (salarioEmpleado1 + salarioEmpleado2);
        double salarioEmpleado4 = 0.2 * salarioEmpleado3;
        double salarioEmpleado5 = 0.5 * (salarioEmpleado3 + salarioEmpleado1) + 2 * salarioEmpleado4;
        
      
        double totalPagar = salarioEmpleado1 + salarioEmpleado2 + salarioEmpleado3 + salarioEmpleado4 + salarioEmpleado5;
        
        
        System.out.println("Salario del empleado 1: $" + salarioEmpleado1);
        System.out.println("Salario del empleado 2: $" + salarioEmpleado2);
        System.out.println("Salario del empleado 3: $" + salarioEmpleado3);
        System.out.println("Salario del empleado 4: $" + salarioEmpleado4);
        System.out.println("Salario del empleado 5: $" + salarioEmpleado5);
        System.out.println("Total a pagar por la empresa: $" + totalPagar);
    }
}