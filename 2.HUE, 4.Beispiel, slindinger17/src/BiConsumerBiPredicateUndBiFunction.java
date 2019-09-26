import java.util.function.*;

public class BiConsumerBiPredicateUndBiFunction {

    public static void main(String[] args) {
        vergleich();
        biVergleich();

        anzeige();
        biAnzeige();

        berechnung();
        biBerechnung();
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
}
