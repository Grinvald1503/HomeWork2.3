package Transport.Driver;

import Transport.Transport;

public abstract class Driver {
    private String fio;
    private boolean driverLicense;
    private int experience;

    public Driver(String fio, boolean driverLicense, int experience) throws CantLicensionException {
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
        if (!this.driverLicense) {
            throw new CantLicensionException("Необходимо указать тип прав!");

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


    public String getFio() {
        return fio;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public abstract void startMoving();

    public abstract void stop();

    public abstract void refuelCar();
}
