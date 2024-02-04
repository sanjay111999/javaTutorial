package src.lambdas.functionalInterfaces;

import java.util.function.Consumer;

public class LambdaDemo {

  public static void main(String[] args) {
    // Using Classes
    Consumer<String> consumer = new DemoConsumerClass();
    consumer.accept("Sanjay");

    // This way of creating an object is called anonymous object
    Consumer<String> consumer1 = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println("Way2"+s);
      }
    };
    consumer1.accept("Chowdary");

    // Using Lambdas
    // (): function parameter
    // {}: provide the implementation of abstract method
    Consumer<String> consumer2 = (str) -> {
      System.out.println(str);
    };
    consumer2.accept("Vempati");

    // Using method reference
    Consumer<String> consumer3 = System.out::println;
    consumer3.accept("Sai");

    // The major use of creating a functional interface we can't use
    // the lambda execution if we have more than one function in the interface.


    // When you want to use it only one time, We can use the lambda approach
  }
}
