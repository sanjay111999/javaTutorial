package src.lambdas.functionalInterfaces;

public class Client {

  public static void main(String[] args) {
    DemoFuncInterface way1 = new DemoClass();
    way1.fun();

    DemoFuncInterface way2 = new DemoFuncInterface() {
      @Override
      public void fun() {
        System.out.println("this is way 2");
      }
    };
    way2.fun();

  }

}
