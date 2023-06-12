public class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(Integer id, String name, String colorHair, String typeAnimal) {
        super(id, name, colorHair, typeAnimal);
    }

    public void inputCat() {
        super.inputAnimal();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
