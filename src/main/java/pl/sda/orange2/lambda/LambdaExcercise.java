package pl.sda.orange2.lambda;

public class LambdaExcercise {
    public static void main(String[] args) {
        System.out.println("----------------");
        System.out.println("Coffee time");

        CoffeeeMaker myCoffeeMaker = (int water, String coffeeType) -> "my coffee";
        CoffeeeMaker myCoffeeMaker2 = (int water, String coffeeType) -> {
            return "my coffee";
        };
        CoffeeeMaker myCoffeeMaker3 = (int water, String coffeeType) -> {
            System.out.println("Coffee brewing");
            return "my coffee";
        };
    }

    ;

}
