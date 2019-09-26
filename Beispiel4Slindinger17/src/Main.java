import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        scanner.useDelimiter("\n");

        int eing = -1;
        while (eing != 4){
            AbstractCalculator calculator = new RelationalCalculator();
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

            if(!(eing < 1 || eing > 4)) {
                Number x = null;
                Number y = null;
                int eing2 = -1;
                while (eing2 < 1 || eing2 > 4) {
                    eing2 = -1;
                    try {
                        //enter numbers
                        x = new Number();
                        y = new Number();
                        System.out.print("Enter number x a> ");
                        x.setA(Double.parseDouble(scanner.next()));
                        System.out.print("Enter number x b> ");
                        y.setA(Double.parseDouble(scanner.next()));
                        System.out.print("Enter number y a> ");
                        x.setB(Double.parseDouble(scanner.next()));
                        System.out.print("Enter number y b> ");
                        y.setB(Double.parseDouble(scanner.next()));
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        continue;
                    }
                    while (eing2 < 1 || eing2 > 5) {
                        //choose Operation
                        System.out.println("Choose Operation:");
                        System.out.println("1 - add");
                        System.out.println("2 - subtract");
                        System.out.println("3 - multiply");
                        System.out.println("4 - divide");
                        System.out.println("5 - enter numbers again");

                        System.out.print("> ");
                        try {
                            eing2 = Integer.parseInt(scanner.next());
                            if (eing2 < 1 || eing2 > 5) throw new Exception();
                        } catch (Exception e) {
                            System.out.println("Invalid input [1-5]");
                        }
                        Number result = null;
                        switch (eing2) {
                            case 1:
                                result = calculator.add(x, y);
                                break;

                            case 2:
                                result = calculator.substract(x, y);
                                break;

                            case 3:
                                result = calculator.multiply(x, y);
                                break;

                            case 4:
                                result = calculator.divide(x, y);
                                break;
                        }
                        if (result != null) {
                            System.out.println("------------------");
                            System.out.println("Solution");
                            System.out.println("a = " + result.getA());
                            if (calculator instanceof ComplexCalculator) {
                                System.out.println("b = " + result.getB() + "i");
                            } else {
                                System.out.println("b = " + result.getB());
                            }
                            System.out.println("------------------");
                        }
                    }
                }
            }
        }
    }
}
