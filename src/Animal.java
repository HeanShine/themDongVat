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

        System.out.println("nhap ma dong vat : ");
        this.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("nhap ten dong vat : ");
        this.name = scanner.nextLine();

        System.out.println("nhap mau dong vat : ");
        this.colorHair = scanner.nextLine();

        System.out.println("nhap loai dong vat : ");
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
