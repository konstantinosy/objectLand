// CarRental.java is not my work. I just have it here to use it as a reference. Credits:
// https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/cars/CarRental.java .

package Week02;

public class CarRental {
    public static void main(String[] args) {
        Car a = new Car("AZB6723", 1000);
        Car b = new Car("AOO9011", 2500);
        Car c = new Car();
        Car d = a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
