package Transport;


import Transport.Driver.CantLicensionException;
import Transport.Driver.ClassB;
import Transport.Driver.Driver;

public class Main {

    public static void main(String[] args) {
//        Car ladaGranta = new Car("Lada", "Granta", 1.7);
//        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0);
//        Car bmwZ8 = new Car("BMW", "Z8", 3.0);
//        Car hyundaiAvante = new Car("Huyndai", "Avante", 1.6);
//        Bus paz = new Bus("ПАЗ", "1234", 3.5);
//        Bus ikarus = new Bus("Икарус", "12313", 3.8);
//        Bus maz = new Bus("МАЗ", "234", 4.1);
//        Bus iveko = new Bus("Inveko", "23451", 3.7);
//        Truk kamaz = new Truk("Камаз", "23523", 4.2);
//        Truk man = new Truk("Man", "Man", 4.2);
//        Truk gaz = new Truk("Газ", "Next", 3.8);
//        Truk belaz = new Truk("Белаз", "2345", 4.0);


//        belaz.setSpeed(100);
        //      belaz.setSpeed(120);
        //    belaz.setSpeed(100);
        //  belaz.setLapTime(4.08);
        //belaz.setLapTime(4.55);
//        belaz.setLapTime(4.08);

//        System.out.println(hyundaiAvante);
//        System.out.println(ikarus);
//        belaz.bestLapTime();
//        belaz.maxSpeed();
//        ivan.perform(audiA8);
//        System.out.println(Truk.LoadCapacity.N1);
//      System.out.println(Truk.LoadCapacity.N2);
//        System.out.println(Truk.LoadCapacity.N3);


        try {
            ClassB max = new ClassB("asd", false, 0);
        } catch (CantLicensionException e) {
            throw new RuntimeException(e);
        }
    }


}