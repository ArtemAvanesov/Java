public class Cat {

    String name; // Cat name
    int age; // Cat age

    Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void Info(){
        System.out.println("Cat name is: " + this.name + ". Cat age is: " + this.age + ".");
    }
}