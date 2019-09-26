public class ComplexCalculator extends AbstractCalculator{
    public ComplexCalculator(){
        super(
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() + x.getB());
                    result.setB(y.getA() + y.getB());
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() - x.getB());
                    result.setB(y.getA() - y.getB());
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();

                    double a = (x.getA() * x.getB());
                    double b = (x.getA() * y.getB());
                    double c = (y.getA() * x.getB());
                    double d = (y.getA() * y.getB()) * -1;

                    result.setA(a+d);
                    result.setB(b+c);
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();

                    double a1 = (x.getA() * x.getB());
                    double b1 = (x.getA() * y.getB()) * -1;
                    double c1 = (y.getA() * x.getB());
                    double d1 = (y.getA() * y.getB());
                    double a2 = (x.getB() * x.getB());
                    double b2 = (y.getB() * y.getB());

                    result.setA((a1+d1)/25);
                    result.setB((b1+c1)/25);
                    return result;
                }
        );
    }

    public Number add(Number a, Number b){
        return add.calc(a, b);
    }

    public Number substract(Number a, Number b){
        return substract.calc(a, b);
    }

    public Number multiply(Number a, Number b){
        return multiply.calc(a, b);
    }

    public Number divide(Number a, Number b){
        return divide.calc(a, b);
    }
}
