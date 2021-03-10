package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole2 {

	
	private LinkedList<String> parole;
	
	public Parole2() {
		parole=new LinkedList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	
	public List<String> getElenco() {
		List<String> nuovo=new ArrayList<String>(parole);
		Collections.sort(nuovo);
		
		return nuovo;
	}
	
	public void reset() {
		parole.clear();
	}

	
	public void cancellaParola(String p) {
		parole.remove(p);
	}
}
