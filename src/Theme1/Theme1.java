class Animal{
    public void say(){
        System.out.println("Something say");
    }
}
class Cat extends Animal{
    public void say(){
        System.out.println("Mew");
    }
}
class Dog extends Animal{
    public void say(){
        System.out.println("Gav");
    }
}
class Duck extends Animal{
    public void say(){
        System.out.println("Krya");
    }
}

public class Theme1 {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void say() {
                System.out.println("mew");
            }
        };
        Animal dog = new Animal() {
            @Override
            public void say() {
                System.out.println("gav");
            }
        };
        Animal duck = new Animal() {
            @Override
            public void say() {
                System.out.println("mew");
            }
        };
    }
}
