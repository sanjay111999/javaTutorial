package src.lambdas.functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This is implementation of objects sort with comparable
 */
public class ClassSortDemo {

  static class Car implements Comparable<Car> {
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

    @Override
    public int compareTo(Car other) {
      return this.price  - other.price;
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
    Collections.sort(carsList);
    System.out.println(carsList);
  }




}
