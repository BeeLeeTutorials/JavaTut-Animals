package com.beeleeong;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // new Class -> creating an instance of the Class
        Animal[] zoo = {
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog(),
                new Dog(),
        };

        for (int i = 0; i < zoo.length; i++) {
            System.out.print((i + 1) + " ");
            zoo[i].speak();
        }
    }
}
