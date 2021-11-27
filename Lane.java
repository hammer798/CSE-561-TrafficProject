//Lane.java 
package TrafficProject.CSE_561_TrafficProject;

import java.util.ArrayList;
import GenCol.*;


import model.modeling.*;
import model.simulation.*;

import view.simView.*;
public class Lane extends atomic{

	int capacity = 40; //check notes for actual number-lanes modelled as 1/8 mile section of road
	int currentSignal = 0; //0 is red, 1 is green, 2 is left turn, street will convert this from traffic light
	ArrayList<Vehicle> cars;
	
	public Lane(){
	    super("Lane");
	    addInport("newCar"); 
	    addInport("streetCapacities"); //from street
	    addInport("trafficSignal"); //from traffic signal via street
	    addOutport("exitingCar");
	    addOutport("currentVolume"); //both outports will go into street, which will direct traffic to next target lane
	}
	//maybe add secondary constructor based on how we implement roads and lights(would take initial light signal)
	
	public void initialize(){
		//Initialization:
		phase = "notFull";
	    cars = new ArrayList<Vehicle>();
	    sigma = 1/0.0; //sigma: infinity
	    super.initialize();
	 }
	
	//External Transition Function
	public void  deltext(double e, message x){
	    Continue(e);
	    for(int i=0; i<x.getLength(); i++) {
			if(messageOnPort(x, "newCar", i)) {
				entity val = x.getValOnPort("newCar", i);
				Vehicle newCar = new Vehicle();
				cars.add(newCar);
				if(cars.size()==capacity) {
					phase = "full";
					holdIn("full", 1);
				}
			}
	    }
	    for(int i=0; i<x.getLength(); i++) {
			if(messageOnPort(x, "trafficSignal", i)) {
				entity val = x.getValOnPort("trafficSignal", i);
				int signal = Integer.parseInt(val.getName());
				currentSignal = signal;
				holdIn("notFull", 1);
			}
	    }
	}
	
	//Internal Transition Function:
	public void  deltint( ){
		holdIn(phase, 1); //one vehicle can exit a lane every second assuming there's space wherever they're going
	}
	
	//not 100% sure this is necessary but probably good to have
	public void deltcon(double e, message x) { 
		deltint();
		deltext(0, x);
	}
	
	//Output Function:
	public message out(){
		message m = new message();
		int chosenTurn = cars.get(0).getTurn();
		if((currentSignal == 1 && (chosenTurn == 1 || chosenTurn == 2) || (currentSignal == 2 && chosenTurn == 0))){ //basically, does current traffic light match turn choice, will add capacity checks once implemented in traffic light
			content con = new content("exitingCar", new entity("" + chosenTurn)); //pass turn so light knows where to send it
			cars.remove(0);
			phase = "notFull";
			m.add(con);
		}
		content con2 = new content("currentVolume", new entity("" + cars.size()));
		m.add(con2);
	    return m;
	}
 



}
