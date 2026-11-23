//jacob.murray@malad.us
//For Software Development 1 assignment 2.4-3.1
//This program creates a Mammal parent class and several child classes
//A cat object is created and the child classes attack the cat
//The cat has a chance to run away based on the scariness of the attacker
class Mammal {
    String name;
    String color1;
    String color2;
    String mammalType;
    int age;
    int fear;
    int scariness;
}
class Cat {
    String name = "Whiskers";
    String color1 = "Gray";
    String color2 = "White";
    String mammalType = "Cat";
    int age = 5;
    int fear = 0;
}
class Mouse extends Mammal {
    public Mouse() {
        this.name = "Jerry";
        this.color1 = "Brown";
        this.mammalType = "Mouse";
        this.age = 1;
        this.scariness = 1;
    }
}
class Human extends Mammal {
    public Human() {
        this.name = "Mr. Gross";
        this.color1 = "White";
        this.mammalType = "Human";
        this.age = 80;
        this.scariness = 50;
    }
}
class Dog extends Mammal {
    public Dog() {
        this.name = "Rover";
        this.color1 = "Black";
        this.color2 = "White";
        this.mammalType = "Dog";
        this.age = 3;
        this.scariness = 75;
    }
}
class CatReflection extends Mammal  {
    public CatReflection() {
        this.name = "Whiskers";
        this.color1 = "Gray";
        this.color2 = "White";
        this.mammalType = "Reflection";
        this.age = 5;
        this.scariness = 100;
    }
}
public class MammalObjects {
//This method creates a cat object and has several other mammal objects attack it
    public static void main(String[] args) {
        Cat Cat = new Cat();
        Mammal attacker;
        attacker = new Mouse();
        Cat.fear = attacker.scariness;
        for (int i = 0; i < 4; i++) {
            System.out.println(""+ attacker.name + " the " + attacker.mammalType + " is attacking the cat!");
            attacker = runChance(Cat, attacker);
        }
    }
//This method determines if the cat runs away or stays and fights based on the scariness of the attacker
    public static Mammal runChance(Cat Cat, Mammal attacker) {
        System.out.println("Run Chance: " + (Cat.fear) + "%");
        int randomNumber = (int)(Math.random() * 100) + 1;
        if (randomNumber <= Cat.fear) {
            System.out.println("The cat ran away!");
        }   
        else {
            System.out.println("The cat stayed and fought!");
        }
        if (attacker instanceof Mouse) {
            attacker = new Human();
        }
        else if (attacker instanceof Human) {
            attacker = new Dog();
        }
        else if (attacker instanceof Dog) {
            attacker = new CatReflection();
        }
        Cat.fear = attacker.scariness;
        return attacker;
    }
}