package com.java.lessons.l2.abst;

import com.java.lessons.l2.abst.lib.TaskHelper;

/*Ukol:
Hlavni abstraktni trida: TaskAbstract
     chranene atributy: id,description , length, due_to, name, isClosed
     neimplementovana metoda: getIsSolved, close

Podtrida ProgrammersTask: dedi od TaskAbstract
     atributy isSolved
     Issues - obsahuje vazby na Issue (agreguje do sebe Issues)
                ????? Jak implementovat "agregaco" - jakym mechanismem <List> ?
                      Udelat nekolik instanci????
     metoda getIssuesCount


Trida Issue: 
      Id, Name, State, severenity


Podtrida PersonalTask: dedi od TaskAbstract
      attributy: timeSolved
      datesolved() //if <due_to tak getissolved vyreseno.

pro ciselne typy pouzivej primitivni datove typy.*/
       //>>>??? A co stringy???

/*Prezvykani: TaskAbstract bude obsahovat vse spolecne co se da pouzit v dalsich classech
 * ProgrammerTask je seznam issues a soucasne re
   
    	
    	
   Now you may be wondering why not declare an abstract class as an interface, and have the Dog 
   and Cow implement the interface. Sure you could - but you'd also need to implement the eat 
   and sleep methods. By using abstract classes, you can inherit the implementation of other (non-abstract) 
   methods. You can't do that with interfaces - an interface cannot provide any method implementations.
   => Abstract udelam zaklad a dle potrebnych nuanci dolepuji k extend tridam funkcionality!
               zaklad je spolecny, ABSTRACT metody je list co u kazdeho MUSIM/MUZU implementovat
   => Interface, zavazny predpis co vse se ma implementovat a to se musi udelat cele!

*/

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// zalozim dve instance PersonalTasku
		// zalozim 2 instance ProgrammersTask
		// pridam je do jednoho listu<> 
		// vypisu stav ukolu (jestli je uzavreny) a nazev // "instanceOf"
		// !! Nepouzivej toString ale metodama z abstraktni tridy
		// u issue udelat "enum" vyctovy typ
		// 
		
		TaskHelper.closeSolvedTasks(list);
        // 
	}

}

/*

Answer

Abstract classes are classes that contain one or more abstract methods. An abstract method is a method that is declared, but contains no implementation. Abstract classes may not be instantiated, and require subclasses to provide implementations for the abstract methods. Let's look at an example of an abstract class, and an abstract method.

Suppose we were modeling the behavior of animals, by creating a class hierachy that started with a base class called Animal. Animals are capable of doing different things like flying, digging and walking, but there are some common operations as well like eating and sleeping. Some common operations are performed by all animals, but in a different way as well. When an operation is performed in a different way, it is a good candidate for an abstract method (forcing subclasses to provide a custom implementation). Let's look at a very primitive Animal base class, which defines an abstract method for making a sound (such as a dog barking, a cow mooing, or a pig oinking). 

public abstract Animal
{
   public void eat(Food food)
   {
        // do something with food.... 
   }

   public void sleep(int hours)
   {
        try
	{
		// 1000 milliseconds * 60 seconds * 60 minutes * hours
		Thread.sleep ( 1000 * 60 * 60 * hours);
	}
	catch (InterruptedException ie) {  ignore  } 
   }

   public abstract void makeNoise();
}
Note that the abstract keyword is used to denote both an abstract method, and an abstract class. Now, any animal that wants to be instantiated (like a dog or cow) must implement the makeNoise method - otherwise it is impossible to create an instance of that class. Let's look at a Dog and Cow subclass that extends the Animal class.

public Dog extends Animal
{
   public void makeNoise() { System.out.println ("Bark! Bark!"); }
}

public Cow extends Animal
{
   public void makeNoise() { System.out.println ("Moo! Moo!"); }
}
Now you may be wondering why not declare an abstract class as an interface, and have the Dog and Cow implement the interface. Sure you could - but you'd also need to implement the eat and sleep methods. By using abstract classes, you can inherit the implementation of other (non-abstract) methods. You can't do that with interfaces - an interface cannot provide any method implementations.


*/