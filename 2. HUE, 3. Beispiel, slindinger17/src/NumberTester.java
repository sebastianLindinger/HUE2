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
        String[] row = fileName.split("\n");

        for (int i = 1; i < row.length; i++) {
            row[i] = row[i].trim();
            switch (Integer.parseInt(row[i].substring(0, 1))) {
                case 1:
                    setOddEvenTester(Integer.parseInt(row[i].substring(2)), (Number) -> {
                        if ((Number % 2) == 0) {
                            return true;
                        } else {
                            return false;
                        }
                    });



                    break;

                case 2:
                    setPrimeTester(Integer.parseInt(row[i].substring(2)),(n) -> {
                        for (int j = 2; j < n / 2; j++) {
                            if ((n % j) == 0) {
                                return false;
                            }
                        }
                        return true;
                    });
                    break;

                case 3:
                    setPalindromeTester(Integer.parseInt(row[i].substring(2)), (n) -> {
                        String n1 = ""+n;
                        String number = "";
                        for(int i1 = n1.length()-1; i1 >= 0; i1--){
                            number += n1.charAt(i1);
                        }
                        return n1.equals(number);
                    });
            }

        }
    }
}
