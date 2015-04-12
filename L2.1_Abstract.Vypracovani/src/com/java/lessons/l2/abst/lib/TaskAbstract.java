package com.java.lessons.l2.abst.lib;
import java.util.Date;

/*Ukol:
Hlavni abstraktni trida: TaskAbstract
chranene atributy: id,description , length, dueTo, name, isClosed

neimplementovana metoda: getIsSolved, close

Trida Issue: Id, Name, State, severenity

Podtrida ProgrammersTask: dedi od TaskAbstract
atributy isSolved
Issues - obsahuje vazby na Issue (agreguje do sebe Issues)
metoda getIssuesCount

Podtrida PersonalTask: dedi od TaskAbstract
attributy: timeSolved < dueto plni na cas.

pro ciselne typy pouzivej primitivni datove typy.*/   //<<<< STRING NENI PRIMITIVNI!!!!!

// protected vidim v potomkovi, privat ani v objektu ktery dedil

// Task abstract - dle nej je vytvoreny ProgrammersTask, Personal task
// Proto TaskAbstract obsahuje to co ma definovane u sebe a jeste to navic
// co je definovano u subclassu

public abstract class TaskAbstract {
 protected int id ;
 protected String description;
 protected String length;
 protected Date dueTo;
 protected String name;
 protected boolean isClosed;
 
 //ALT-SHIFT-S <<< menu Get& set
 //Atributy Private nebo Protected a nastavit Get/Set
 
 
 public abstract boolean getIsSolved();
 public abstract void close();
 // muzu sem uz vypsat i nejake implementace nebo to musi zustat prazdne jak u Iface?
 // musim si u sebe vsechny implementovat nebo jen nektere?
 
 public int getId() {
  	    return id; 
  	    }
  //Nekolik prikladu konstruktoru - lisi se poctem vstup ni parametru (pro inicializaci objektu)
 
public TaskAbstract(int id, String description, String length, Date due_to,
		String name) {  //konstruktor pro mnoho parm
	super();
	this.id = id;
	this.description = description;
	this.length = length;
	this.dueTo = due_to;
	this.name = name;
	this.isClosed = false;
}

public TaskAbstract(int id, String description) {
	super();           //konstruktor pro omezeny pocet parm
	this.id = id;
	this.description = description;
}


public void setId(int id) {
	this.id = id;
}
public String getDescription() {
	return description; // Proc tady uz nepotrebuji this. ???
}
public void setDescription(String description) {
	this.description = description;
}
public String getLength() {
	return length;
}
public void setLength(String length) {
	this.length = length;
}
public Date getDue_to() {
	return dueTo;
}
public void setDue_to(Date dueTo) {
	this.dueTo = dueTo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isClosed() {
	return isClosed;
}
public void setClosed(boolean isClosed) {
	this.isClosed = isClosed;
}


 
}


 
