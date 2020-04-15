public class Main {

    public  static  void main(String[] args) {

        Cat cat1 = new Cat("Murka", 5);
        cat1.Info();
        Cat cat2 = new Cat("Fluff", 7);
        cat2.Info();
        People people1 = new People("Basil", 23, cat1);
        people1.Info();
        People people2 = new People("Petr", 20, cat2);
        people2.Info();
    }
}