

public class Bird  extends Animal{

    public Bird() {
        super();
    }

    public Bird(Integer id, String name, String colorHair, String typeAnimal) {
        super(id, name, colorHair, typeAnimal);
    }

    public void inputBird() {
        super.inputAnimal();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
