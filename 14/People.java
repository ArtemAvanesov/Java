public class People {

    String name; // People name
    int age; // People age
    Cat cat; // Cat

    People (String name, int age, Cat cat){
        this.name = name;
        this.age = age;
        this.cat = cat;
    }

    public void Info(){
        System.out.println("People name: " + this.name + ". People age: " + this.age + ". " + "Cat: " + this.cat.name);
    }
}