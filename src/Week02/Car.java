// Car.java is not my work. I just have it here to use it as a reference. Credits:
// https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/cars/Car.java .
package Week02;

public class Car {
    private String plateNo;
    private double km;
    private boolean rented;

    // Constructor overloading
    public Car() {
        this("N/A", 0);
    }

    // Constructor
    public Car(String plateNo, double km) {
        setPlateNo(plateNo);
        setKm(km);
        setRented(false);
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        if (km > 0 && km > this.km) {
            this.km = km;
        }
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public String toString() {
        return "plateNo='" + plateNo + '\'' +
                ", km=" + km;
    }
}