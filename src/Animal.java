import java.util.Scanner;

public class Animal {
    private Integer id;
    private String name;
    private String colorHair;
    private String typeAnimal;

    public Animal() {
        this.id = null;
        this.name = "";
        this.colorHair = "";
        this.typeAnimal = "";
    }

    public Animal(Integer id, String name, String colorHair, String typeAnimal) {
        this.id = id;
        this.name = name;
        this.colorHair = colorHair;
        this.typeAnimal = typeAnimal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorHair() {
        return colorHair;
    }

    public void setColorHair(String colorHair) {
        this.colorHair = colorHair;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public void inputAnimal() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Nhập id động vât : ");

            while (!scanner.hasNextInt()) {
                System.out.println("Đây không phải là số. Vui lòng nhập lại.");
                scanner.next();
            }

            this.id = scanner.nextInt();
        } while (this.id < 0);
        scanner.nextLine();

        System.out.println("nhập tên động vật : ");
        this.name = scanner.nextLine();

        System.out.println("nhập màu động vật : ");
        this.colorHair = scanner.nextLine();

        System.out.println("nhập loại động vật : ");
        this.typeAnimal = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colorHair='" + colorHair + '\'' +
                ", typeAnimal='" + typeAnimal + '\'' +
                '}';
    }
}
