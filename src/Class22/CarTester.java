package Class22;

public class CarTester {
    public static void main(String[] args) {
        Car[]cars={new BMW(),new Toyota(),new Tesla() };
        for(Car car:cars){
            car.start();
            car.stop();
            car.park();
        }
    }
}
