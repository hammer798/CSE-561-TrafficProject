package Component.Project;

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
}

public void initialize(){
	//Initialization:
    turn = chooseTurn(); //set initial turn
	phase = ""+turn;
    sigma = 5; //sigma: 5
    super.initialize();
 }

//External Transition Function
public void  deltext(double e, message x){
    Continue(e);
}

//Internal Transition Function:
public void  deltint( ){
	turn = chooseTurn();
	phase = ""+turn;
	holdIn(phase, 5);
}

//not 100% sure this is necessary but probably good to have
public void deltcon(double e, message x) { 
	deltint();
	deltext(0, x);
}

//Output Function:
public message out(){
	message m = new message();
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

