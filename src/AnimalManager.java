import java.util.ArrayList;

public class AnimalManager implements InterfaceAnimal {
    private ArrayList<Animal> listAnimal = new ArrayList<>();

    @Override
    public boolean isAnimal(Integer id) {
        if (listAnimal.contains(id))
            return true;
        else
            return false;
    }

    @Override
    public void addAnimal(Animal animal) {

        if (isAnimal(animal.getId())) {
            System.out.println("da ton tai !");
        }else {
            listAnimal.add(animal);
        }
    }

    @Override
    public void updateAnimal(Animal animal) {
        for (Animal animal1 : listAnimal) {
            if (animal1.getId() == animal.getId()) {

                animal1.setName(animal.getName());
                animal1.setColorHair(animal.getColorHair());
                animal1.setTypeAnimal(animal.getTypeAnimal());
            } else {
                System.out.println("dong vat khong ton tai");
            }
        }
    }

    @Override
    public void removeAnimal(Animal animal) {
        for (Animal animal1 : listAnimal) {
            if (animal1.getId() == animal.getId()) {
                listAnimal.remove(animal);
            } else {
                System.out.println("dong vat khong ton tai");
            }
        }
    }


    @Override
    public void displayAnimal() {
        if (listAnimal.isEmpty()) {
            System.out.println("danh sach rong");
        } else {
            for (Animal animal : listAnimal) {
                System.out.println(animal.toString());;
            }
        }
    }
}
