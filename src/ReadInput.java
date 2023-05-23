import java.util.Scanner;
public class ReadInput {
    public static String read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Expression (For eg: 6*4/2+19-10)");
        String inputLine = scanner.nextLine();
        scanner.close();
        return inputLine;
    }
}