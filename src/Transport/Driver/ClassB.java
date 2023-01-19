package Transport.Driver;

public class ClassB extends Driver {
    public ClassB(String fio, boolean driverLicense, int experience) throws CantLicensionException {
        super(fio, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getFio() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории В " + getFio() + " закончил движение");

    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории В " + getFio() + " заправляет авто");
    }
}
