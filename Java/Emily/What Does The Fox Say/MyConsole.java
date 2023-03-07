public class MyConsole {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];

        animals[0] = new Bird();
        animals[1] = new Cat();
        animals[2] = new Cow();
        animals[3] = new Dog();
        animals[4] = new Duck();
        animals[5] = new Elephant();
        animals[6] = new Fish();
        animals[7] = new Frog();
        animals[8] = new Mouse();
        animals[9] = new Seal();

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
