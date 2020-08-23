package change;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

public class RunController {
	
	//global Data members
	int total25=100,total10=100,total5 = 100,r,d;
	int calc25,calc10,calc5;
	
	@FXML TextField txtamt;
	@FXML Label ttl25,ttl5,ttl10,twoFive,five,oneZero;
	@FXML Button calcbtn;
	
	@FXML
	public void calculate(ActionEvent e) {
	try {
		//get the input from the field
		int amount = Integer.parseInt(txtamt.getText());
		//System.out.println(amount/25);

		//if conditions
		
		//for cents greater than 25
		if(amount > 25 && amount%5==0) {
			r = amount%25;
		    d = amount/25;
		    calc25 = d;
		
			  if(r >= 10) {
			    calc10 = r/10;
			    r = r%10;
			     }
			     if(r < 10) {
			    	 calc5 = r/5;
			         
			     }  
		    }else if(amount < 25 || amount%5==0) {
		    	r = amount%10;
			    d = amount/10;
			    calc10 = d;
			    
			    calc5 = r/5;
		    }
		    		
	}catch(Exception ex) {
		Alert alert = new Alert(AlertType.ERROR,"Wrong Input");
		alert.showAndWait();
	}

		//printing the results
		
		twoFive.setText("25 : "+Integer.toString(calc25)+" Coins needed");
		oneZero.setText("10 : "+Integer.toString(calc10)+" Coins needed");
		five.setText("05 : "+Integer.toString(calc5)+" Coins needed");
		
		//setting total after calculation
		
		ttl25.setText("25 Cents : "+Integer.toString(total25-calc25));
		ttl10.setText("10 Cents : "+Integer.toString(total10-calc10));
		ttl5.setText("5 Cents : "+Integer.toString(total5-calc5));

		}
		
	}
	


