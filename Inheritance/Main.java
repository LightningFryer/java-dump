package Inheritance;

public interface Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes S class", 2022);
        System.out.println(car.isDriving);

        car.drive();
        System.out.println(car.isDriving);

        car.stop();
        System.out.println(car.isDriving);

    }
}
