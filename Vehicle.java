//Vehicle.java 
package TrafficProject.CSE_561_TrafficProject;

import java.util.Random;
import GenCol.*;


import model.modeling.*;
import model.simulation.*;

import view.simView.*;

public class Vehicle extends atomic{

//state is a tuple of phase and turn
protected int turn = 0; //0 is left, 1 is straight, 2 is right
  
public Vehicle(){
    super("Vehicle");
    addInport("newRoadSection"); 
    addOutport("turn");
}

public void initialize(){
	//Initialization:
	phase = "noChoice";
    turn = chooseTurn(); //set initial turn
    sigma = 1/0.0; //sigma: infinity
    super.initialize();
 }

//External Transition Function
public void  deltext(double e, message x){
    Continue(e);
    for(int i=0; i<x.getLength(); i++) {
		if(messageOnPort(x, "newRoadSection", i)) {
			entity val = x.getValOnPort("newRoadSection", i);
			turn = chooseTurn();
			phase = "choiceMade";
			holdIn("choiceMade", 5);//vehicle reevaluates choice every 5 seconds
		}
    }
}

//Internal Transition Function:
public void  deltint( ){
	if(phase == "choiceMade") {
		phase = "noChoice";
		holdIn("noChoice", 0.1); //takes .1 seconds to make new choice
	}
	if(phase == "noChoice") {
		turn = chooseTurn();
		phase = "choiceMade";
		holdIn("choiceMade", 5);
	}
}

//not 100% sure this is necessary but probably good to have
public void deltcon(double e, message x) { 
	deltint();
	deltext(0, x);
}

//Output Function:
public message out(){
	message m = new message();
	content con = new content("turn", new entity("" + turn));
	m.add(con);
    return m;
}
 
 public int chooseTurn() {
	 //turn becomes random number between 0-2
	 Random r = new Random();
	 return r.nextInt(3);
 }
 
 public int getTurn() {
	 return turn;
 }



}
