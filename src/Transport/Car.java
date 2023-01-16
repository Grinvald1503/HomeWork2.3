package Transport;

import Transport.Driver.ClassB;
import Transport.Driver.Driver;

public class Car extends Transport <ClassB> {
    private BodyType bodyType;


    public Car(String brand, String model, double engineValue, ClassB driver, BodyType bodyType) {
        super(brand, model, engineValue, driver);
        this.bodyType = bodyType;


    }

    private enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        OFF_ROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("фургон"),
        MINIVAN("Минивен");
        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
            if (bodyType == null) {
                bodyType = "Неизвестно";
            }
        }

        @Override
        public String toString() {
            return "Тип кузова - " + getBodyType();
        }

        public String getBodyType() {
            return bodyType;
        }
    }




    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println("Кузов: " + bodyType);
    }

    @Override
    public void startMoving() {
        System.out.println("Авто начал движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Авто остановился.");
    }

    @Override
    public String toString() {
        return "Марка - " + getBrand() + ", Модель - " + getModel() + ", Объём двигателя - " + getEngineValue();
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            this.bodyType = BodyType.SEDAN;
        }
        this.bodyType = bodyType;
    }
}

