package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	
	private List<String> parole;
		
	public Parole() {
		parole=new ArrayList<String>();
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

}
