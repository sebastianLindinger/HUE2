public class Main {
    public static void main(String[] args) {
        AbstractCalculator calc = new RelationalCalculator();
        Number a = new Number(1.0, 2.0);
        Number b = new Number(1.0, 2.0);
        Number c = calc.add(a, b);
        System.out.println(c.getA() + " " + c.getB());
    }
}
