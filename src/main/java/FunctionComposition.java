import java.util.function.Function;

public class FunctionComposition {

    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> sum = x -> y -> x + y;

        System.out.println(
                sum.apply(1).apply(2)
        );
    }

}
