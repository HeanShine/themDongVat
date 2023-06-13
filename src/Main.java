import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalManager manageAnimal = new AnimalManager();

        while (true) {
            System.out.println("\n----- Quản lý động vật -----");
            System.out.println("1.them dong vat :");
            System.out.println("2.xoa dong vat :");
            System.out.println("3.tim kiem dong vat :");
            System.out.println("4.sua dong vat :");
            System.out.println("5.show dong vat :");
            System.out.println("6.sap xep dong vat theo ten :");
            System.out.println("0. Thoát chương trình");
            System.out.println("-----------------------------");
            System.out.print("Vui lòng chọn một tùy chọn: ");

            int choice;
            do {
                System.out.print("Vui lòng chọn một tùy chọn: ");

                while (!scanner.hasNextInt()) {
                    System.out.println("Đây không phải là số. Vui lòng nhập lại.");
                    scanner.next();
                }

                choice = scanner.nextInt();
            } while (choice < 0);


            switch (choice) {

                case 1:
                    int choiceAnimal;
                    System.out.println("1.thêm chó");
                    System.out.println("2.thêm mèo");
                    System.out.println("3.thêm chim");
                    do {
                        System.out.print("Vui lòng chọn một tùy chọn dong vat: ");

                        while (!scanner.hasNextInt()) {
                            System.out.println("Đây không phải là số. Vui lòng nhập lại.");
                            scanner.next();
                        }

                        choiceAnimal = scanner.nextInt();
                    } while (choiceAnimal <= 0 || choiceAnimal > 3);


                    switch (choiceAnimal) {
                        case 1:
                            Dog dog = new Dog();
                            dog.inputDog();
                            manageAnimal.addAnimal(dog);
                            break;

                        case 2:
                            Cat cat = new Cat();
                            cat.inputCat();
                            manageAnimal.addAnimal(cat);
                            break;
                        case 3:
                            Bird bird = new Bird();
                            bird.inputBird();
                            manageAnimal.addAnimal(bird);
                            break;
                    }
                    break;


                case 2:
                    int idRemove;

                    do {
                        System.out.print("Nhập id dong vat muốn update: ");

                        while (!scanner.hasNextInt()) {
                            System.out.println("Đây không phải là số. Vui lòng nhập lại.");
                            scanner.next();
                        }

                        idRemove = scanner.nextInt();
                    } while (idRemove <= 0);

                    manageAnimal.removeAnimal(idRemove);
                    break;

                case 3:

                    int idSearch;

                    do {
                        System.out.print("Nhập id dong vat muốn tim kiem : ");

                        while (!scanner.hasNextInt()) {
                            System.out.println("Đây không phải là số. Vui lòng nhập lại.");
                            scanner.next();
                        }

                        idSearch = scanner.nextInt();
                    } while (idSearch <= 0);

                    manageAnimal.searchByAnimal(idSearch);
                    break;
                case 4:

                    int idUpdate;

                    do {
                        System.out.print("Nhập id dong vat muốn xoa: ");

                        while (!scanner.hasNextInt()) {
                            System.out.println("Đây không phải là số. Vui lòng nhập lại.");
                            scanner.next();
                        }

                        idUpdate = scanner.nextInt();
                    } while (idUpdate <= 0);

                    Animal animalUpdate = new Animal();
                    animalUpdate.inputAnimal();
                    manageAnimal.updateAnimal(animalUpdate, idUpdate);
                    break;

                case 5:
                    manageAnimal.displayAnimal();
                    break;

                case 6:
                    manageAnimal.sortByName();
            }
        }
    }
}