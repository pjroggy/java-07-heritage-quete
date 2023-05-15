public class Hangar{
    public static void main(String[] args) {
        Car car = new Car("Peugeot", 10000);
        Boat boat = new Boat("Beneteau", 500);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}