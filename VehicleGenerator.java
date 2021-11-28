package Component.Project;

import GenCol.*;


import model.modeling.*;

public class VehicleGenerator extends atomic {
	int count;
	public VehicleGenerator() {
		super("VehicleGenerator");
		addOutport("car");
		
		initialize();
	}
	
	public void initialize() {
		phase = "active";
		sigma = 1;
		count = 0;
		super.initialize();
	}
	
	public void deltext(double e, message x) {
		Continue(e);
	}
	
	public void deltint() {
		if(count < 50) {
			count++;
			holdIn(phase, .5);
		}
		else{
			phase = "passive";
			holdIn(phase, INFINITY);
		}
	}
	
	public message out() {
		message m = new message();
		if(phase.equals("active")) {
			content con = new content("car", new entity("1"));
			m.add(con);
		}
		return m;

	}
}
