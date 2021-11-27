package TrafficProject.CSE_561_TrafficProject;

import GenCol.*;

import java.util.ArrayList;
import model.modeling.*;
import model.simulation.*;

import view.simView.*;

public class Street extends atomic{
	int numLanes;
	int lsCaps = 0, ssCaps = 0, rsCaps = 0;
	ArrayList<Lane> lanes1, lanes2; //lanes1 is for one direction, N and E, lanes2 is for other, S and W
	
	public Street(int laneNum) {
		super("Street");
		numLanes = laneNum;
		lanes1 = new ArrayList<Lane>();
		lanes2 = new ArrayList<Lane>();
		for(int x = 0; x < numLanes; x++) {
			Lane l = new Lane();
			Lane l2 = new Lane();
			lanes1.add(l);
			lanes2.add(l2);
		}
		for(int x = 0; x < numLanes; x++) {
			addInport("laneN/Evolume" + x);
			addInport("laneN/Eexiting" + x);
			addInport("laneS/Wvolume" + x);
			addInport("laneS/Wexiting" + x);
		}
		addInport("leftStreetVolumes");
		addInport("straightStreetVolumes");
		addInport("rightStreetCapacities");
		addInport("trafficSignalN/E");//relevant for lanes1
		addInport("trafficSignalS/W");//relevant for lanes2
		addOutport("carsGoingLeft");//will be an integer of number cars turning left
		addOutport("carsGoingStraight");//see above
		addOutport("carsGoingRight");//see above
	}
	
	public void initialize(){
		//Initialization:
	    super.initialize();
	 }
	
	//External Transition Function
	public void  deltext(double e, message x){
	    Continue(e);
	    
	    
	}
}
