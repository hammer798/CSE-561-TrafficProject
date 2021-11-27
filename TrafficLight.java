package TrafficProject.CSE_561_TrafficProject;

import java.util.Random;
import GenCol.*;


import model.modeling.*;
import model.simulation.*;

import view.simView.*;

public class TrafficLight extends atomic{

	//state is a tuple of phase and currentSignal
	protected int currentSignal = 0; //0 is N/S left, 1 is N/S straight, 2 is E/W left, 3 is E/W straight
	protected int[] signalOrder = {0, 1, 2, 3};
	protected int[] timeLengths = {15, 45};
	
	public TrafficLight(){
		//takes no inputs
	    super("TrafficLight");
	    addOutport("signal");
	}
	
	public void initialize(){
		//Initialization:
		setRandomLight();
	    super.initialize();
	 }
	
	//External Transition Function
	public void  deltext(double e, message x){
	    Continue(e);
	}
	
	//Internal Transition Function:
	public void  deltint( ){
		if(currentSignal != 3)
			currentSignal++;
		else
			currentSignal = 0;
		phase = getPhaseName();
		holdIn(phase, timeLengths[currentSignal%2]);
	}
	
	//not 100% sure this is necessary but probably good to have
	public void deltcon(double e, message x) { 
		deltint();
		deltext(0, x);
	}
	
	//Output Function:
	public message out(){
		message m = new message();
		content con = new content("signal", new entity("" + currentSignal));
		m.add(con);
	    return m;
	}
	 
	public void setRandomLight() {
		//signal becomes random number between 0-3
		Random r = new Random();
		currentSignal = r.nextInt(4);
		phase = getPhaseName();
		sigma = r.nextInt(timeLengths[currentSignal%2]+1); //random number between 0 and max time for light(effectively initialize at random point in light cycle
	}
	 
	public int getSignal() {
		return currentSignal;
	}
	 
	public String getPhaseName() {
		if(currentSignal == 0)
			return "NSLeft";
		else if(currentSignal == 1)
			return "NSStraight";
		else if(currentSignal == 2)
			return "EWLeft";
		else
			return "EWStraight";
	}



}

