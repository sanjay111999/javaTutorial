package src.lambdas.functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * This is implementation of objects sort with comparable
 */
public class ClassLambdaSortDemo {

  static class Car {
    int speed;
    int price;
    String brand;

    Car(int speed, int price, String brand) {
      this.speed = speed;
      this.price = price;
      this.brand = brand;
    }

    @Override
    public String toString() {
      return "Speed: " + this.speed + " Price: " + this.price + " Brand: " + this.brand;
    }
  }

  public static void main(String[] args) {
    Car car1 = new Car(10, 100, "A");
    Car car2 = new Car(20, 80, "B");
    Car car3 = new Car(30, 40, "C");
    Car car4 = new Car(40, 60, "D");

    ArrayList<Car> carsList = new ArrayList<>();
    carsList.add(car1);
    carsList.add(car2);
    carsList.add(car3);
    carsList.add(car4);
    System.out.println(carsList);
    Comparator<Car> sortByPrice = new Comparator<Car>() {
      @Override
      public int compare(Car o1, Car o2) {
        return o1.price - o2.price;
      }
    };
    Comparator<Car> sortBySpeed = new Comparator<Car>() {
      @Override
      public int compare(Car o1, Car o2) {
        return o1.speed - o2.speed;
      }
    };
    Collections.sort(carsList, sortByPrice);
    System.out.println(carsList);
    Collections.sort(carsList, (a, b) -> a.speed - b.speed);
    System.out.println(carsList);
  }




}
