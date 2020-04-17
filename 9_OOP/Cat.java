public class Cat {

    int age;
    String type;
    String name;

    void say()
    {
        System.out.println("Meow!");
    }


    @Override
    public String toString() {
        return "Cat[Name: " + name + ", Type: " + type + ", Age: " + age + "]";
    }
}
