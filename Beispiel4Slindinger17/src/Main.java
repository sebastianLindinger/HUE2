import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        scanner.useDelimiter("\n");

        int eing = -1;
        while (eing != 4){
            AbstractCalculator calculator;
            System.out.println("Choose Calculator:");
            System.out.println("1 - Relational Calculator");
            System.out.println("2 - Vector Calculator");
            System.out.println("3 - Complex Calculator");
            System.out.println("4 - Exit program");

            //enter calculator
            System.out.print("> ");
            try{
                eing = Integer.parseInt(scanner.next());
                if(eing < 1 || eing > 4) throw new Exception();
            } catch (Exception e){
                System.out.println("Invalid input [1-4]");
            }

            switch (eing) {
                case 1:
                    calculator = new RelationalCalculator();
                    break;

                case 2:
                    calculator = new VectorCalculator();
                    break;

                case 3:
                    calculator = new ComplexCalculator();
                    break;
            }

            //enter numbers
            while (true){
                try {
                    Number x = new Number();
                    Number y = new Number();
                    System.out.print("Enter number x a>");
                    x.setA(Double.parseDouble(scanner.next()));
                    System.out.print("Enter number x b>");
                    x.setB(Double.parseDouble(scanner.next()));
                    System.out.print("Enter number y a>");
                    y.setA(Double.parseDouble(scanner.next()));
                    System.out.print("Enter number y b>");
                    y.setB(Double.parseDouble(scanner.next()));
                    break;
                } catch (Exception e){
                    System.out.println("Invalid input");
                }
            }

            if(!(eing < 1 || eing > 4)){
                int eing2 = 5;
                while (eing2 == 5) {
                    System.out.println("Choose Operation:");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    System.out.println("5 - enter numbers again");

                    System.out.print("> ");
                    try{
                        eing2 = Integer.parseInt(scanner.next());
                        if(eing2 < 1 || eing2 > 5) throw new Exception();
                    } catch (Exception e){
                        System.out.println("Invalid input [1-5]");
                    }
                }
            }



        }
    }
}
