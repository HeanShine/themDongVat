import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalManager manageAnimal = new AnimalManager();

        while (true) {
            System.out.println("\n----- Quản lý dong vat -----");
            System.out.println("1.them dong vat :");
            System.out.println("2.xoa dong vat :");
            System.out.println("3.tim kiem dong vat :");
            System.out.println("4.sua dong vat :");
            System.out.println("5.show dong vat :");
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
                        choiceAnimal = scanner.nextInt();
                    } while (choiceAnimal < 0 || choiceAnimal > 3);


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

                case 5:
                    manageAnimal.displayAnimal();
                    break;
            }
        }
    }
}
