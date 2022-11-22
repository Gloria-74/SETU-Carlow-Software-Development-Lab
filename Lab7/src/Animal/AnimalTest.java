package Animal;

public class AnimalTest {

    public static void main(String[] args) {

        Animal dog = new Dog("Poodle", 4, 'M');

        Animal cat = new Cat("Tom", 2, 'F');

        Vet vet = new Vet("Dr Michael Miller");
        Vet vet1 = new Vet("Dr Michelle Adams");

        vet.vaccinate(dog);
        vet1.vaccinate(cat);

        Animal[] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = cat;

        for (Animal ani: animals) {
            System.out.println(ani);
            ani.eat();
            ani.sleep();
            ani.makeSound();
        }

        if (dog instanceof Animal)
        {
            System.out.println("Dog has been vaccinated: " + dog);
        } if (cat instanceof Animal)
        {
            System.out.println("Cat has been vaccinated: " + cat);
        } else
        {
            System.out.println("Animal has not been vaccinated.");
        }

    }

}
