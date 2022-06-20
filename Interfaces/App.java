package Interfaces;

public class App {
    public static void main(String[] args) {
        MidSizeSedan car = new MidSizeSedan();
        // using Vehicle interface to create car
        Vehicle vehicle = new MidSizeSedan();
        Trackable trackable = new MidSizeSedan();
    }
}
