import java.util.Scanner;

public class driverDFA{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String inputText = scanner.nextLine();
       ManWolf.process(inputText);
     }
}