import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        //Abbildung 1:
        boolean result1 = BiConsumerBiPredicateUndBiFunction.biVergleich((a,b) -> a == b * 2, 10, 5);
        BiConsumerBiPredicateUndBiFunction.biAnzeige((Integer i1,Integer i2) -> System.out.println("Das Ergebnis des Testes " + i2 + " * 2 == " + i1 + " mit BiPredicate ist " + result1), 10, 5);
        Integer result6 = BiConsumerBiPredicateUndBiFunction.biBerechnung(Integer::sum, 5, 10);
        BiConsumerBiPredicateUndBiFunction.biAnzeige((Integer i1, Integer i2) -> System.out.println("Der Wert der Bifunction mit den Argumenten " + i1 + " und " + i2 + " ist " + result6), 5, 10);

        //Abbildung 3:
        BinaryOperator<Integer> maxByOperator = BinaryOperator.<Integer> maxBy(Integer::compareTo);
        BinaryOperator<Integer> minByOperator = BinaryOperator.<Integer> minBy(Integer::compare);

        //Abbildung 4:
        Integer result9 = BiConsumerBiPredicateUndBiFunction.biBerechnung(maxByOperator, 5, 10);
        BiConsumerBiPredicateUndBiFunction.biAnzeige((i1, i2) -> System.out.println("Der Wert des binaryOperators maxBy mit den Argumenten " + i1 + " und " + " i2 " + " ist "+ result9), 5, 10);

        //Abbildung 5:
        UnaryOperator<Integer> identyOperator = UnaryOperator.<Integer>identity();
        Integer result11 = BiConsumerBiPredicateUndBiFunction.berechnung(identyOperator, 5);
        BiConsumerBiPredicateUndBiFunction.anzeige(i -> System.out.println("Der Wert des Unary Operators mit den Argument " + i + " ist " + result11), 5);
    }
}
