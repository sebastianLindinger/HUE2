import sun.misc.IOUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class NumberTester {
    private String fileName;

    public NumberTester(String fileName) {
        this.fileName = fileName;
        testFile();
    }

    public void setOddEvenTester(int Number, NumberTest oddTester) {
        if(oddTester.testNumber(Number)){
            System.out.println("ODD");
        } else {
            System.out.println("NOT ODD");
        }
    }

    public void setPrimeTester(int Number, NumberTest primeTester) {
        if(!primeTester.testNumber(Number)){
            System.out.println("NO PRIME");
        } else {
            System.out.println("PRIME");
        }
    }

    public void setPalindromeTester(int Number, NumberTest palindromeTester) {
        if(palindromeTester.testNumber(Number)){
            System.out.println("PALINDROME");
        }
        else {
            System.out.println("NO PALINDROME");
        }
    }

    public void testFile() {
        File file = new File(fileName);
        if(file.exists()){
            try(FileReader fileStream = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader (fileStream) ) {

                int i = -1;
                int length = 0;
                String line;
                do {
                    i++;
                    line  = bufferedReader.readLine();
                    if(0 == length){
                        try {
                            length = Integer.parseInt(line);
                        } catch (NumberFormatException e){
                            System.out.println("not a valid input on line 1 in text file");
                        }
                    } else {
                        try {
                            switch (Integer.parseInt(line.substring(0, 1))) {
                                case 1:
                                    setOddEvenTester(Integer.parseInt(line.substring(2)), (Number) -> {
                                        if ((Number % 2) == 0) {
                                            return true;
                                        } else {
                                            return false;
                                        }
                                    });
                                    break;

                                case 2:
                                    setPrimeTester(Integer.parseInt(line.substring(2)), (n) -> {
                                        for (int j = 2; j < n / 2; j++) {
                                            if ((n % j) == 0) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    });
                                    break;

                                case 3:
                                    setPalindromeTester(Integer.parseInt(line.substring(2)), (n) -> {
                                        String n1 = "" + n;
                                        String number = "";
                                        for (int i1 = n1.length() - 1; i1 >= 0; i1--) {
                                            number += n1.charAt(i1);
                                        }
                                        return n1.equals(number);
                                    });
                                    break;

                                default:
                                    throw new Exception();
                            }

                        } catch (Exception e){
                            System.out.println("not a valid input on line " + (i+1) +" in text file");
                        }
                    }
                }while(i < length);

            } catch (FileNotFoundException e) {
            } catch (IOException ex ) {
            }
        } else {
            System.out.println("File not found");
        }
    }
}
