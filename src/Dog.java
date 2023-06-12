import java.util.ArrayList;

public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(Integer id, String name, String colorHair, String typeAnimal) {
        super(id, name, colorHair, typeAnimal);
    }

    public void inputDog() {
        super.inputAnimal();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
