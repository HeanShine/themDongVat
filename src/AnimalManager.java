import java.util.ArrayList;

public class AnimalManager implements InterfaceAnimal {
    private ArrayList<Animal> listAnimal = new ArrayList<>();

    @Override
    public boolean isAnimal(Integer id) {
        for (int i = 0; i < listAnimal.size(); i++) {
            if (listAnimal.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void addAnimal(Animal animal) {

        if (isAnimal(animal.getId())) {
            System.out.println("da ton tai !");
            return;
        } else {
            listAnimal.add(animal);
        }
    }

    @Override
    public void updateAnimal(Animal animal, Integer idUpdate) {

        for (int i = 0; i < listAnimal.size(); i++) {
            if (listAnimal.get(i).getId() == idUpdate) {
                listAnimal.set(i, animal);
                System.out.println("cap nhat dong vat thanh cong");
                return;
            }
        }
        System.out.println("cap nhat hoc sinh that bai !");
    }


    @Override
    public void removeAnimal(Integer idRemove) {
        for (int i = 0; i < listAnimal.size(); i++) {
            if (listAnimal.get(i).getId() == idRemove) {
                listAnimal.remove(i);
                System.out.println("xoa dong vat thanh cong");
                return;
            }
        }
        System.out.println("xoa dong vat that bai !");
    }

    @Override
    public void displayAnimal() {
        if (listAnimal.isEmpty()) {
            System.out.println("danh sach rong");
        } else {
            for (Animal animal : listAnimal) {
                System.out.println(animal.toString());
            }
        }
    }

    @Override
    public void searchByAnimal(Integer idSearch) {
        for (int i = 0; i < listAnimal.size(); i++) {
            if (listAnimal.get(i).getId() == idSearch) {
                Animal animalById = listAnimal.get(i);

                System.out.println(" đã tim thay dong vat do ! ");
                System.out.println("ID: " + animalById.getId());
                System.out.println("Tên: " + animalById.getName());
                System.out.println("Màu : " + animalById.getColorHair());
                System.out.println("Loại : " + animalById.getTypeAnimal());
                return;
            }
        }
        System.out.println("tim kiem dong vat that bai !");
    }

    @Override
    public void sortByName() {
        if (listAnimal.isEmpty()) {
            System.out.println("danh sach động vật rỗng");
        }
        for (int i = 0; i < listAnimal.size(); i++) {
            for (int j = 0; j < listAnimal.size(); j++) {
                Animal animal1 = listAnimal.get(i);
                Animal animal2 = listAnimal.get(j);
                if (animal1.getName().compareTo(animal2.getName()) < 0) {
                    Animal temp = animal1;
                    listAnimal.set(i, animal2);
                    listAnimal.set(j, temp);
                }
            }
        }
        for (Animal animal : listAnimal) {
            System.out.println(animal.toString());
        }
    }
}
