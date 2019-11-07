package oop;

public class BirdDemo {
public static void main(String args[])
{
	Bird b=new Bird();
	b.birdColor="Orange";
	b.birdName="Parrot";
	/*b.legs=2;
	  b.wings=2;*/
	b.walk();
	b.fly();
	b.setSingStatus();
	b.sing();
	System.out.println("object id: " +b.hashCode());
	Bird k=new Bird();
	k.birdColor="Black";
	k.birdName="kokila";
	k.walk();
	k.setSingStatus();
	k.sing();
	k.fly();
}
}
