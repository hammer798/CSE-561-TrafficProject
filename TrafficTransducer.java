package Component.Project;

import GenCol.*;
import model.modeling.*;

public class TrafficTransducer extends atomic{
	int count = 0;
	double time = 0;
	public TrafficTransducer(String name) {
		super(name);
		for(int x = 0; x < 16; x++) {
			addInport("carOut"+x);
		}
		addOutport("timeOut");
	}
	
	public void initialize(){
		phase = "active";
		count = 0;
		time = 0;
		sigma = 1;
	}
	
	public void deltext(double e, message x) {
		Continue(e);
		time+=e;
		for(int y=0; y<16; y++) {
			for(int i=0; i<x.getLength(); i++) {
				if(messageOnPort(x, "carOut" + y, i)) {
					entity val = x.getValOnPort("carOut"+y, i);
					String value = val.getName();
					int numCars = Integer.parseInt(value);
					count+=numCars;
				}
			}
		}
		if(count < 400) {
			holdIn(phase, INFINITY);
		}
		else {
			holdIn("passive", 1);
		}
		
	}
	
	public void deltint() {
		holdIn(phase, INFINITY);
	}
	
	public message out() {
		message m = new message();
		content con = new content("timeOut", new entity(""+time));
		m.add(con);
		return m;
	}
}
