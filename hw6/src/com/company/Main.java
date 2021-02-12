package com.company;

public class Main {

    public static void main(String[] args) {
	Animal cat = new Cat("Кек");
	cat.run(10);
	cat.swim(1);

	Animal dog = new Dog("Лол");
	dog.run(1);
	dog.swim(40);
    }
}
