public class RelationalCalculator extends AbstractCalculator{
    public RelationalCalculator(){
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
                    result.setA(x.getA() * x.getB());
                    result.setB(y.getA() * y.getB());
                    return result;
                },
                (x, y) -> {
                    Number result = new Number();
                    result.setA(x.getA() / x.getB());
                    result.setB(y.getA() / y.getB());
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
