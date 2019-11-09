package org.animals;
public class Monkey
{
public String color;
public float weight;
public int age;
public Monkey()
{
}
public Monkey(String color,float weight,int age)
{
this.color=color;
this.weight=weight;
this.age=age;
}
public boolean isVegetarian()
{
return true;
}
public boolean canClimb()
{
return true;
}
public void getSound()
{
System.out.println("barks");
}
}

