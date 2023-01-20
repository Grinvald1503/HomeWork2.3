package Transport.Driver;

public class ClassD extends Driver{
    public ClassD(String fio, boolean driverLicense, int experience) throws CantLicensionException {
        super(fio, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getFio() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории D " + getFio() + " закончил движение");

    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории D " + getFio() + " заправляет авто");
    }
}
