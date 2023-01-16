package Transport;

import Transport.Driver.ClassC;
import Transport.Driver.ClassD;

public class Bus extends Transport<ClassD> {
    private Capacity capacity;

    public Bus(String brand, String model, double engineValue, ClassD driver, Capacity capacity) {
        super(brand, model, engineValue, driver);
        this.capacity = capacity;
    }


    private enum Capacity {
        VERY_SMALL(0, 10),
        SMALL(0, 25),
        AVERAGE(40, 50),
        BIG(60, 80),
        VERY_BIG(100, 120);
        private final int minPlaces;
        private final int maxPlaces;

        Capacity(int minPlaces, int maxPlaces) {
            this.minPlaces = minPlaces;
            this.maxPlaces = maxPlaces;
        }

        public int getMinPlaces() {
            return minPlaces;
        }

        public int getMaxPlaces() {
            return maxPlaces;
        }

        @Override
        public String toString() {
            String low = " от " + minPlaces;
            if (minPlaces == 0) {
                low = "";
            }
            String upp = " до " + maxPlaces;
            if (maxPlaces == 0) {
                upp = "";

            }

            return "Вместительность -" + low + upp + " мест.";


        }
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Автобус остановился.");
    }

    @Override
    public String toString() {
        return "Марка - " + getBrand() + ", Модель - " + getModel() + ", Объём двигателя - " + getEngineValue();

    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }

        System.out.println("Мест: " + capacity);

    }
}
