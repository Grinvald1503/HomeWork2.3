package Transport;

import Transport.Driver.ClassC;

public class Truk extends Transport<ClassC> {
    private LoadCapacity loadCapacity;

    public Truk (String brand, String model, double engineValue, ClassC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineValue, driver);
        this.loadCapacity = loadCapacity;
    }
    private enum LoadCapacity {
        N1 (0, 3.5f),
        N2 (3.5f, 12),
        N3 (12, 0);
        private final float lowerBound;
        private final float upperBound;

        LoadCapacity(float lowerBound, float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public float getLowerBound() {
            return lowerBound;
        }

        public float getUpperBound() {
            return upperBound;
        }


        @Override
        public String toString() {
            String low = " от " + lowerBound;
            if (lowerBound == 0) {
                low = "";
            }
            String upp = " до " + upperBound;
            if (upperBound == 0) {
                upp = "";
            }
            return "Грузоподъёмность -" + low + upp + " тонн.";
        }
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Грузовик остановился.");
    }

    @Override
    public String toString() {
        return "Марка - " + getBrand() + ", Модель - " + getModel() + ", Объём двигателя - " + getEngineValue();
    }



    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println("Грузоподъёмность: " + loadCapacity);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        if (loadCapacity == null) {
            this.loadCapacity = LoadCapacity.N1;
        }
        this.loadCapacity = loadCapacity;
    }
}

