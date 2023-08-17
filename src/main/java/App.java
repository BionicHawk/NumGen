import java.util.Scanner;
import java.util.Vector;

public class App {
    private static int n;
    private static float[] numbers;
    private static Scanner scanner;

    private static void generateNumbers(){
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (float)Math.random();
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros a generar\n> ");
        n = scanner.nextInt();

        numbers = new float[n];
        generateNumbers();
        for (float number : numbers){
            System.out.println(String.format("%.5f", number));
        }

        System.out.println("Pulsa cualquier tecla para continuar...");
        try{
            System.in.read();
        }catch (Exception e){
            System.out.println("Ocurrió esta excepción: " + e.toString());
        }
        scanner.close();
    }
}
