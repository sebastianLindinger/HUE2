import java.util.function.*;

public class BiConsumerBiPredicateUndBiFunction {

    public static void main(String[] args) {
        /*vergleich();
        biVergleich();

        anzeige();
        biAnzeige();

        berechnung();
        biBerechnung();*/

        //Abbildung 1:
        boolean result1 = biVergleich((a,b) -> a == b * 2, 10, 5);
        biAnzeige((Integer i1,Integer i2) -> System.out.println("Das Ergebnis des Testes " + i2 + " * 2 == " + i1 + " mit BiPredicate ist " + result1), 10, 5);
        Integer result6 = biBerechnung(Integer::sum, 5, 10);
        biAnzeige((Integer i1, Integer i2) -> System.out.println("Der Wert der Bifunction mit den Argumenten " + i1 + " und " + i2 + " ist " + result6), 5, 10);

        //Abbildung 3:
        BinaryOperator<Integer> maxByOperator = BinaryOperator.<Integer> maxBy(Integer::compareTo);
        BinaryOperator<Integer> minByOperator = BinaryOperator.<Integer> minBy(Integer::compare);

        //Abbildung 4:
        Integer result9 = biBerechnung(maxByOperator, 5, 10);
        biAnzeige((i1, i2) -> System.out.println("Der Wert des binaryOperators maxBy mit den Argumenten " + i1 + " und " + " i2 " + " ist "+ result9), 5, 10);

        //Abbildung 5:
        UnaryOperator<Integer> identyOperator = UnaryOperator.<Integer>identity();
        Integer result11 = berechnung(identyOperator, 5);
        anzeige(i -> System.out.println("Der Wert des Unary Operators mit den Argument " + i + " ist " + result11), 5);
    }

    public static boolean vergleich(Predicate<Integer> predicate, Integer i){
        return predicate.test(i);
    }

    public static boolean biVergleich(BiPredicate<Integer, Integer> biPredicate, Integer i1, Integer i2){
        return biPredicate.test(i1, i2);
    }

    public static void anzeige (Consumer<Integer> consumer, Integer i){
        consumer.accept(i);
    }

    public static void biAnzeige(BiConsumer<Integer, Integer> biConsumer, Integer i1, Integer i2){
        biConsumer.accept(i1, i2);
    }

    public static Integer berechnung(Function<Integer, Integer> function, Integer i){
        return function.apply(i);
    }

    public static Integer biBerechnung(BiFunction<Integer, Integer, Integer> biFunction, Integer i1, Integer i2){
        return biFunction.apply(i1, i2);
    }

    public static Integer berechnungMitBinaryOperator(BinaryOperator<Integer> binaryOperator, Integer i1, Integer i2){
        return binaryOperator.apply(i1, i2);
    }
}
