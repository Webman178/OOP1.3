package animals;

import java.util.Objects;

public abstract class Birds extends Animals {

    private String movement;
    public Birds(String name, int age, String livingEnvironment, String movement) {
        super(name, age, livingEnvironment);
        this.movement = movement;
    }

    public abstract void hunt();

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Birds birds = (Birds) o;
        return Objects.equals(movement, birds.movement);
    }

}
