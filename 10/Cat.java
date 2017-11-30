package cat_package;


public class Cat extends Animals {
    private int age;
    private String type;
    private String name;

    public Cat(int age, String type, String name) {
        this.age = age;
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Я ем!");
    }

    public void say()
    {
        System.out.println("Мяу!");
    }


    @Override
    public String toString() {
        return "Cat[Имя: " + name + ", Порода: " + type + ", Возраст: " + age + "]";
    }
}
