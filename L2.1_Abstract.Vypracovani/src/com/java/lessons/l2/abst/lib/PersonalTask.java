package com.java.lessons.l2.abst.lib;

import java.util.Date;

/*Podtrida PersonalTask: dedi od TaskAbstract
attributy: timeSolved

datesolved() //if <due_to tak getissolved vyreseno.
ale v programmers task se to udela jinak

*/
public class PersonalTask extends TaskAbstract{
    public PersonalTask(int id, String description, String length, Date due_to,
			String name) {
		super(id, description, length, due_to, name);
		// TODO Auto-generated constructor stub
	}

	private boolean timeSolved;
    private Date dateSolved;
    
	@Override
	public boolean getIsSolved() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
 
	
	
}
