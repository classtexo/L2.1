package com.java.lessons.l2.abst.lib;
import java.util.Date;

/*Ukol:
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

pro ciselne typy pouzivej primitivni datove typy.*/
       //>>>??? A co stringy???

public class ProgrammersTask extends TaskAbstract{

	boolean isSolved;
	private Issue[] issues; 
	
	//kdyz vsechny issues splneny tak getIsSolved vratie true; Specialitka Overridingu
	
	public ProgrammersTask(int id, String description, String length,
			Date dueTo, String name,Issue[] issues) {
		//Toto je zavolani PRIMO konstruktoru predka??
		super(id, description, length, dueTo, name);
		this.issues = issues; 
	}
	
	public int getIssuesCount() {
		return issues.length;
	}
	

	@Override
	public boolean getIsSolved() {
		// TODO Auto-generated method stub
		//bude vracet boolean alltasks closed
		return false;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	

}
