package com.java.lessons.l2.abst.lib;
/*Trida Issue: Id, Name, State, severenity

Podtrida ProgrammersTask: dedi od TaskAbstract
atributy isSolved
Issues - obsahuje vazby na Issue (agreguje do sebe Issues)
metoda getIssuesCount*/

public class Issue {
  int id = -1;
  String name = null;
  String state = null;    //<< stavy Created, Accepted, Solved, Reopen
  int severity = -1;      //Pokud vse Solved => 
}

