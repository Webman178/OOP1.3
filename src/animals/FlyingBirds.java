package animals;

public class FlyingBirds extends Birds{

        public FlyingBirds(String name, int age, String livingEnvironment, String movement) {
            super(name, age, livingEnvironment, movement);
        }

        @Override
        public void eat() {
            System.out.println("Летающяя птица есть насекомых и рыбу ");
        }

        @Override
        public void sleep() {
            System.out.println("Летающяя птица спит ночью или днем ");
        }

        @Override
        public void moving() {
            System.out.println("Летающяя птица перемещается по " + getMovement());
        }

        @Override
        public void hunt() {
            System.out.println("Нелетающяя птица охотится на земле или воздухе ");
        }
    }

