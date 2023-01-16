package Transport.Driver;

public class ClassC extends Driver{
    public ClassC(String fio, boolean driverLicense, int experience) {
        super(fio, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории С " + getFio() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории С " + getFio() + " закончил движение");

    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории С " + getFio() + " заправляет авто");
    }
}
