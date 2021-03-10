package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.Parole2;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class FXMLController {
	
	Parole elenco ;
	Parole2 elenco2;
	long o1;
	long o2;
	long result1;
	long result2;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private TextField txtOrari;
 
    @FXML
    void doInsert(ActionEvent event) {
    	o1=System.nanoTime();
    	elenco.addParola(txtParola.getText());
    	o2=System.nanoTime();
    	result1=o2-o1;
    	o1=System.nanoTime();
    	elenco2.addParola(txtParola.getText());
    	o2=System.nanoTime();
    	result2=o2-o1;
    	txtOrari.setText("arrayList: "+Long.toString((result1))+" "+"linkedList: "+Long.toString((result2)));
    	String result="";
    	for(String s: elenco.getElenco()) {
    		result+=s+"\n";
    	}
    	txtResult.setText(result);  	
    	txtParola.clear();
    	
    }

    @FXML
    void doReset(ActionEvent event) {
    	o1=System.nanoTime();
    	elenco.reset();
    	o2=System.nanoTime();
    	result1=o2-o1;
    	o1=System.nanoTime();
    	elenco2.reset();
    	o2=System.nanoTime();
    	result2=o2-o1;
    	txtOrari.setText("arrayList: "+Long.toString((result1))+" "+"linkedList: "+Long.toString((result2)));
    	
    	
    	
    	
    	txtResult.clear();
    	
    
    	
    	
    }
    
    @FXML
    void handleCancella(ActionEvent event) {
    	String p=txtResult.getSelectedText();
    	o1=System.nanoTime();
    	elenco.cancellaParola(p);
    	o2=System.nanoTime();
    	result1=o2-o1;
    	
    	o1=System.nanoTime();
    	elenco2.cancellaParola(p);
    	o2=System.nanoTime();
    	result2=o2-o1;
    	txtOrari.setText("arrayList: "+Long.toString((result1))+" "+"linkedList: "+Long.toString((result2)));
    
    	String result="";
    	if(elenco.getElenco().size()==0)
    		txtResult.clear();
    	else {
    	for(String s: elenco.getElenco()) {
    		result+=s+"\n";
    	}
    	txtResult.setText(result);
    	}
    	
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
       
        
        elenco = new Parole() ;
        elenco2=new Parole2();
    }
}
