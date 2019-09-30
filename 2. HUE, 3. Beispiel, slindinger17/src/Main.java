import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        scanner.useDelimiter("\n");

        System.out.println("Enter Filename: [file/openMe.txt]");
        String filename = scanner.next();

        NumberTester numberTester = new NumberTester(filename);
    }
}
