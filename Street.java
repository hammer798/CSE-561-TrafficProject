package Component.Project;

import GenCol.*;

import java.util.ArrayList;
import model.modeling.*;
import model.simulation.*;

import view.simView.*;

public class Street extends atomic{
	int numLanes;
	int dir;
	String lsVols = "", ssVols = "", rsVols = "";
	int left = 0, straight = 0, right = 0;
	int signal;
	ArrayList<Lane> lanes;
	int[] laneVolumes;
	int[] laneEntrants;
	
	public Street(int laneNum, int direction) {
		super("Street");
		numLanes = laneNum;
		laneVolumes = new int[numLanes];
		laneEntrants = new int[numLanes];
		dir = direction; //0 is NE, 1 is SW
		lanes = new ArrayList<Lane>();
		for(int x = 0; x < numLanes; x++) {
			Lane l = new Lane();
			lanes.add(l);
			laneVolumes[x] = 0;
			laneEntrants[x] = 0;
		}
		for(int x = 0; x < numLanes; x++) {
			addInport("lanevolume" + x);
			addInport("laneexiting" + x);
			addOutport("laneentering" + x);
		}
		addInport("newCars");
		addInport("leftStreetVolume");
		addInport("straightStreetVolume");
		addInport("rightStreetVolume");
		addInport("trafficSignal");
		addOutport("streetCapacities");
		addOutport("totalVolume");
		addOutport("trafficSignalOut");
		addOutport("carGoingLeft");//will indicate car going certain direction
		addOutport("carGoingStraight");//see above
		addOutport("carGoingRight");//see above
	}
	
	public void initialize(){
		//Initialization:
		phase = "active";
		sigma = 1/0.0; //infinity
	    super.initialize();
	 }
	
	//External Transition Function
	public void  deltext(double e, message x){
	    Continue(e);
	    for(int i=0; i<x.getLength(); i++) {
			if(messageOnPort(x, "newCars", i)) {
				entity val = x.getValOnPort("newCars", i);
				String value = val.getName();
				int numCars = Integer.parseInt(value);
				for(int z = 0; z < numCars; z++) {
					laneEntrants[sendCarToLane()]++;
				}
			}
	    }
	    for(int i=0; i < lanes.size(); i++) {
	    	for(int y=0; y<x.getLength(); y++) {
	    		if(messageOnPort(x, "lanevolume"+i, y)) {
	    			entity val = x.getValOnPort("lanevolume"+i, y);
	    			String value = val.getName();
	    			laneVolumes[i] = Integer.parseInt(value);
	    		}
	    	}
	    	for(int y=0; y<x.getLength(); y++) {
	    		if(messageOnPort(x, "laneexiting"+i, y)) {
	    			entity val = x.getValOnPort("laneexiting"+i, y);
	    			String value = val.getName();
	    			int turn = Integer.parseInt(value);
	    			handleTurn(turn);
	    		}
	    	}
	    }
	    for(int i=0; i<x.getLength(); i++) {
	    	if(messageOnPort(x, "trafficSignal", i)) {
	    		entity val = x.getValOnPort("trafficSignal", i);
	    		String value = val.getName();
	    		signal = Integer.parseInt(value);
	    	}
	    }
	    for(int i=0; i<x.getLength(); i++) {
	    	if(messageOnPort(x, "leftStreetVolume", i)) {
	    		entity val = x.getValOnPort("leftStreetVolume", i);
	    		lsVols = val.getName();
	    	}
	    }
	    for(int i=0; i<x.getLength(); i++) {
	    	if(messageOnPort(x, "straightStreetVolume", i)) {
	    		entity val = x.getValOnPort("straightStreetVolume", i);
	    		ssVols = val.getName();
	    	}
	    }
	    for(int i=0; i<x.getLength(); i++) {
	    	if(messageOnPort(x, "rightStreetVolume", i)) {
	    		entity val = x.getValOnPort("rightStreetVolume", i);
	    		rsVols = val.getName();
	    	}
	    }
	    
	    phase = "active";
	    holdIn(phase, 1);	    
	}
	
	public void deltint() {
		holdIn(phase, 1);
	}
	
	public message out() {
		message m = new message();
		content con1 = new content("trafficSignalOut", new entity(convertLightForDirection()));
		m.add(con1);
		if(left > 0) {
			content con2 = new content("carGoingLeft", new entity(""+left));
			m.add(con2);
			left=0;
		}
		if(straight > 0) {
			content con3 = new content("carGoingStraight", new entity(""+straight));
			m.add(con3);
			straight = 0;
		}
		if(right > 0) {
			content con4 = new content("carGoingRight", new entity(""+right));
			m.add(con4);
			right = 0;
		}
		int totalVolume = 0;
		for(int z=0; z<numLanes;z++) {
			totalVolume+=laneVolumes[z];
		}
		content con5 = new content("totalVolume", new entity("" +totalVolume));
		m.add(con5);
		content con6 = new content("streetCapacities", new entity(lsVols+"/"+ssVols+"/"+rsVols));
		m.add(con6);
		return m;
	}
	
	public String convertLightForDirection() {
		if(dir == 0) {
			if(signal == 0)
				return "2";
			else if(signal == 1)
				return "1";
			else
				return "0";
		}
		else {
			if(signal == 2)
				return "2";
			else if(signal == 3)
				return "1";
			else
				return "0";
		}
	}
	
	public int sendCarToLane() {
		//car gets sent to lane with minimum volume
		int minVolume = 50;
		int minIndex = 0;
		for(int x = 0; x < numLanes; x++) {
			if(laneVolumes[x] < minVolume) {
				minVolume = laneVolumes[x];
				minIndex = x;
			}
		}
		return minIndex;
	}
	
	public ArrayList<Lane> getLanes(){
		return lanes;
	}
	
	public void handleTurn(int turn) {
		if(turn == 0)
			left++;
		else if(turn == 1)
			straight++;
		else
			right++;
	}
}

