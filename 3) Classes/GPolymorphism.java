//Same method name, different output
public class GPolymorphism {
    static class Animal{
        public void animalsound(){
            System.out.println("Animal sound");
        }
        
    }
    static class Dog extends Animal{
        public void animalsound(){
            System.out.println("bhau bhau");
        }

    }
    static class Cat extends Animal{
        public void animalsound(){
            System.out.println("meow meow");
        }

    }
    static class Pig extends Animal{
        public void animalsound(){
            System.out.println("wee wee");
        }

    }
    public static void main(String[] args) {
        Animal myanimal = new Animal();
        Animal mydog = new Dog();
        Animal mycat = new Cat();
        Animal mypig = new Pig();

        myanimal.animalsound();
        mydog.animalsound();
        mycat.animalsound();
        mypig.animalsound();

    }
}
