package pl.sda.orange2.lambda;

@FunctionalInterface
public interface CoffeeeMaker {
    String prepare(int water, String coffeeType);
}
