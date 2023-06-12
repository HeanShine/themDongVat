import java.util.Scanner;

public class Bird  extends Animal{

    public Bird() {
        super();
    }

    public Bird(Integer id, String name, String colorHair, String typeAnimal) {
        super(id, name, colorHair, typeAnimal);
    }
     // viet ham thong tin cho chim ke thua tu lop Animal
    public void inputBird() {
        super.inputAnimal();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
