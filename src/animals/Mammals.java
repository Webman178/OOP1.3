package animals;

import java.util.Objects;

public abstract class Mammals extends Animals {


    private int speed;
    private String typeFood;

    public Mammals(String name, int age, String livingEnvironment, int speed, String typeFood) {
        super(name, age, livingEnvironment);
        this.speed = speed;
        this.typeFood = typeFood;
    }

    public abstract void walking();


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        if (!super.equals(o)){
            return false;
        }
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(typeFood, mammals.typeFood);
    }

}

