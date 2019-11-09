package org.animals;
class Lion
{
String color;
float weight;
int age;
Lion(String color,float weight,int age)
{
this.color=color;this.weight=weight;this.age=age;
}
public boolean isVegetarian()
{
return false;
}
public boolean canClimb()
{
return false;
}
public void getSound()
{
System.out.println("roars");
}
}
class Monkey
{
String color;
float weight;
int age;
Monkey(String color,float weight,int age)
{
this.color=color;this.weight=weight;this.age=age;
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
class Elephant
{
String color;
float weight;
int age;
Elephant(String color,float weight,int age)
{
this.color=color;this.weight=weight;this.age=age;
}
public boolean isVegetarian()
{
return true;
}
public boolean canClimb()
{
return false;
}
public void getSound()
{
System.out.println("Trumpeting");
}
}
