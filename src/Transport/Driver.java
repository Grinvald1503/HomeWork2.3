package Transport;

public class Driver <D extends Transport> {
    private String fio;
    private boolean driverLicense;
    private int experience;
    public Driver (String fio, boolean driverLicense, int experience) {
        if (fio == null) {
            this.fio = "No name";
        } else {
            this.fio = fio;
        }
        this.driverLicense = driverLicense;
        if (experience < 0) {
            this.experience = experience * -1;
        } else {
            this.experience = experience;
        }
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            this.experience = experience * -1;
        } else {
            this.experience = experience;
        }
    }

    public void perform(D auto) {
        if (driverLicense) {
            System.out.println("водитель "+ fio + " управляет автомобилем " + auto.getBrand() + auto.getModel() +" и будет участвовать в заезде");
        }
        else {
            System.out.println("У водителя нет прав");
        }
    }

    public String getFio() {
        return fio;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }
    public void startMoving() {
        System.out.println("Водитель начинает движение.");
    }
    public void stop() {
        System.out.println("Водитель начал остановку");
    }
    public void refuelCar() {
        System.out.println("Водитель начал заправку");
    }
}
