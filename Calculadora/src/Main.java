import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Pedimos numeros
            System.out.println("Ingrese el primer numero: ");
            double numero1 = sc.nextDouble();

            System.out.println("Ingrese el segundo numero: ");
            double numero2 = sc.nextDouble();

            //Mostramos el menu de operaciones
            System.out.println("Seleccione una operacion: ");
            System.out.println("1 Suma (+)");
            System.out.println("2 Resta (-)");
            System.out.println("3 Multiplicaion (*)");
            System.out.println("4 Division (/)");

            System.out.println("Opcion: ");
            int opcion  = sc.nextInt();


            double resultado;

            //Usamos swith para realizar la operacipon
            switch (opcion) {
                case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (numero2 == 0){
                        System.out.println("Error: No se puede dividir entre cero.");
                    } else {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado:" + resultado);
                    }
                    break;
                default:
                    System.out.println("Opcion no valida:");
            }
        } catch (Exception e) {
            System.out.println("Error. Entrada no valida. Asegurese de ingresar numeros:");
        } finally {
            sc.close(); // Cerramos el scanner para liberar ingresos
        }
    }
}