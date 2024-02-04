package src.lambdas.functionalInterfaces;

@FunctionalInterface
public interface DemoFuncInterface {
  void fun();

  default void fun1() {
    System.out.println("This is default function in the interface: fun1");
  }

}
