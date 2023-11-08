package javalab;

public class rinherit1 {

	public static void main(String [] args) {
		Animals animals = new Animals();
		Cats cats = new Cats();
		animals.makeSound();
		cats.makeSound();
		
	}
}	
		//Animal.java
		 class Animals {
			public void makeSound() {
				System.out.println("The animal makes a sound.");
			}
		}
		//Cat.java
		 class Cats extends Animals{
			//Override
			public void makeSound() {
				System.out.println("The cat quarrels.");
			}
			
		}
		
	
