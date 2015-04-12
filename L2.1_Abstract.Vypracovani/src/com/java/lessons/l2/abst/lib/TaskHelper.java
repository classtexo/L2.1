package com.java.lessons.l2.abst.lib;

/*

tato trida nepujde instanciovat (nepujde mi zavolat konstruktor) 

*/
public class TaskHelper {
 public static closeSolvedTasks(list<TasksAbstract> tasks) {
	 // vezme list tech tasku a co jsou vyresene tak je uzavre
	 // staticke metody tridy << nastudovat a aplikovat zde
 }
 
 public static void printCokolivJineho() {
	 //neco jineho nez se tiskne v main()
 }
 
 // jeste osefovat konstruktor, figl je, ze toto je neinstancovane, normalni konstruktor nefunguje
 // hint je private, JINAK TO BERE ZE SUPER konstruktor.
 // delame to aby to slo volat pres tu tecku! Nechceme aby to nekto vytvarel
 // Kdyz schovam konstruktor ze to nikdo neinstancuje a pouzije jen staticke metody.
 
 //?? kdyztak co napadne tak doplnit.
}
