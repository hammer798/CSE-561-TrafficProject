package Component.Project;

import java.util.ArrayList;
import model.modeling.*;
import model.simulation.*;

import view.simView.*;

public class TrafficGrid extends digraph {
	public TrafficGrid(String name) {
		super(name);
		addOutport("timeFinished");
		ArrayList<atomic> streets = new ArrayList<atomic>();
		//generator and transducer
		atomic vg = new VehicleGenerator();
		atomic tt = new TrafficTransducer("tt");
		
		//vertical street sections
		atomic vN0_0 = new Street(3, 0);
		atomic vN0_1 = new Street(3, 0);
		atomic vN0_2 = new Street(3, 0);
		atomic vN0_3 = new Street(3, 0);
		streets.add(vN0_0);
		streets.add(vN0_1);
		streets.add(vN0_2);
		streets.add(vN0_3);
		
		atomic vS0_0 = new Street(3, 1);
		atomic vS0_1 = new Street(3, 1);
		atomic vS0_2 = new Street(3, 1);
		atomic vS0_3 = new Street(3, 1);
		streets.add(vS0_0);
		streets.add(vS0_1);
		streets.add(vS0_2);
		streets.add(vS0_3);
		
		atomic vN1_0 = new Street(3, 0);
		atomic vN1_1 = new Street(3, 0);
		atomic vN1_2 = new Street(3, 0);
		atomic vN1_3 = new Street(3, 0);
		streets.add(vN1_0);
		streets.add(vN1_0);
		streets.add(vN1_0);
		streets.add(vN1_0);
		
		atomic vS1_0 = new Street(3, 1);
		atomic vS1_1 = new Street(3, 1);
		atomic vS1_2 = new Street(3, 1);
		atomic vS1_3 = new Street(3, 1);
		streets.add(vS1_0);
		streets.add(vS1_1);
		streets.add(vS1_2);
		streets.add(vS1_3);
		
		atomic vN2_0 = new Street(4, 0);
		atomic vN2_1 = new Street(4, 0);
		atomic vN2_2 = new Street(4, 0);
		atomic vN2_3 = new Street(4, 0);
		streets.add(vN2_0);
		streets.add(vN2_1);
		streets.add(vN2_2);
		streets.add(vN2_3);
		
		atomic vS2_0 = new Street(4, 1);
		atomic vS2_1 = new Street(4, 1);
		atomic vS2_2 = new Street(4, 1);
		atomic vS2_3 = new Street(4, 1);
		streets.add(vS2_0);
		streets.add(vS2_1);
		streets.add(vS2_2);
		streets.add(vS2_3);
		
		atomic vN3_0 = new Street(3, 0);
		atomic vN3_1 = new Street(3, 0);
		atomic vN3_2 = new Street(3, 0);
		atomic vN3_3 = new Street(3, 0);
		streets.add(vN3_0);
		streets.add(vN3_1);
		streets.add(vN3_2);
		streets.add(vN3_3);
		
		atomic vS3_0 = new Street(3, 1);
		atomic vS3_1 = new Street(3, 1);
		atomic vS3_2 = new Street(3, 1);
		atomic vS3_3 = new Street(3, 1);
		streets.add(vS3_0);
		streets.add(vS3_1);
		streets.add(vS3_2);
		streets.add(vS3_3);
		
		atomic vN4_0 = new Street(3, 0);
		atomic vN4_1 = new Street(3, 0);
		atomic vN4_2 = new Street(3, 0);
		atomic vN4_3 = new Street(3, 0);
		streets.add(vN4_0);
		streets.add(vN4_1);
		streets.add(vN4_2);
		streets.add(vN4_3);
		
		atomic vS4_0 = new Street(3, 1);
		atomic vS4_1 = new Street(3, 1);
		atomic vS4_2 = new Street(3, 1);
		atomic vS4_3 = new Street(3, 1);
		streets.add(vS4_0);
		streets.add(vS4_1);
		streets.add(vS4_2);
		streets.add(vS4_3);
		
		//horizontal street sections
		atomic hE0_0 = new Street(2, 0);
		atomic hE0_1 = new Street(2, 0);
		atomic hE0_2 = new Street(2, 0);
		atomic hE0_3 = new Street(2, 0);
		atomic hE0_4 = new Street(2, 0);
		atomic hE0_5 = new Street(2, 0);
		streets.add(hE0_0);
		streets.add(hE0_1);
		streets.add(hE0_2);
		streets.add(hE0_3);
		streets.add(hE0_4);
		streets.add(hE0_5);
		
		atomic hW0_0 = new Street(2, 0);
		atomic hW0_1 = new Street(2, 0);
		atomic hW0_2 = new Street(2, 0);
		atomic hW0_3 = new Street(2, 0);
		atomic hW0_4 = new Street(2, 0);
		atomic hW0_5 = new Street(2, 0);
		streets.add(hW0_0);
		streets.add(hW0_1);
		streets.add(hW0_2);
		streets.add(hW0_3);
		streets.add(hW0_4);
		streets.add(hW0_5);
			
		atomic hE1_0 = new Street(2, 0);
		atomic hE1_1 = new Street(2, 0);
		atomic hE1_2 = new Street(2, 0);
		atomic hE1_3 = new Street(2, 0);
		atomic hE1_4 = new Street(2, 0);
		atomic hE1_5 = new Street(2, 0);
		streets.add(hE1_0);
		streets.add(hE1_1);
		streets.add(hE1_2);
		streets.add(hE1_3);
		streets.add(hE1_4);
		streets.add(hE1_5);
		
		atomic hW1_0 = new Street(2, 1);
		atomic hW1_1 = new Street(2, 1);
		atomic hW1_2 = new Street(2, 1);
		atomic hW1_3 = new Street(2, 1);
		atomic hW1_4 = new Street(2, 1);
		atomic hW1_5 = new Street(2, 1);
		streets.add(hW1_0);
		streets.add(hW1_1);
		streets.add(hW1_2);
		streets.add(hW1_3);
		streets.add(hW1_4);
		streets.add(hW1_5);
		
		atomic hE2_0 = new Street(2, 0);
		atomic hE2_1 = new Street(2, 0);
		atomic hE2_2 = new Street(2, 0);
		atomic hE2_3 = new Street(2, 0);
		atomic hE2_4 = new Street(2, 0);
		atomic hE2_5 = new Street(2, 0);
		streets.add(hE2_0);
		streets.add(hE2_1);
		streets.add(hE2_2);
		streets.add(hE2_3);
		streets.add(hE2_4);
		streets.add(hE2_5);
		
		atomic hW2_0 = new Street(2, 1);
		atomic hW2_1 = new Street(2, 1);
		atomic hW2_2 = new Street(2, 1);
		atomic hW2_3 = new Street(2, 1);
		atomic hW2_4 = new Street(2, 1);
		atomic hW2_5 = new Street(2, 1);
		streets.add(hW2_0);
		streets.add(hW2_1);
		streets.add(hW2_2);
		streets.add(hW2_3);
		streets.add(hW2_4);
		streets.add(hW2_5);
		
		//traffic lights
		atomic t0_0 = new TrafficLight();
		atomic t0_1 = new TrafficLight();
		atomic t0_2 = new TrafficLight();
		atomic t0_3 = new TrafficLight();
		atomic t0_4 = new TrafficLight();
		atomic t1_0 = new TrafficLight();
		atomic t1_1 = new TrafficLight();
		atomic t1_2 = new TrafficLight();
		atomic t1_3 = new TrafficLight();
		atomic t1_4 = new TrafficLight();
		atomic t2_0 = new TrafficLight();
		atomic t2_1 = new TrafficLight();
		atomic t2_2 = new TrafficLight();
		atomic t2_3 = new TrafficLight();
		atomic t2_4 = new TrafficLight();

		//coupling traffic lights and streets
		addCoupling(t0_0, "signal", vS0_0, "trafficSignal");
		addCoupling(t0_0, "signal", vN0_1, "trafficSignal");
		addCoupling(t0_0, "signal", hE0_0, "trafficSignal");
		addCoupling(t0_0, "signal", hW0_1, "trafficSignal");
		
		addCoupling(t0_1, "signal", vS1_0, "trafficSignal");
		addCoupling(t0_1, "signal", vN1_1, "trafficSignal");
		addCoupling(t0_1, "signal", hE0_1, "trafficSignal");
		addCoupling(t0_1, "signal", hW0_2, "trafficSignal");
		
		addCoupling(t0_2, "signal", vS2_0, "trafficSignal");
		addCoupling(t0_2, "signal", vN2_1, "trafficSignal");
		addCoupling(t0_2, "signal", hE0_2, "trafficSignal");
		addCoupling(t0_2, "signal", hW0_3, "trafficSignal");
		
		addCoupling(t0_3, "signal", vS3_0, "trafficSignal");
		addCoupling(t0_3, "signal", vN3_1, "trafficSignal");
		addCoupling(t0_3, "signal", hE0_3, "trafficSignal");
		addCoupling(t0_3, "signal", hW0_4, "trafficSignal");
		
		addCoupling(t0_4, "signal", vS4_0, "trafficSignal");
		addCoupling(t0_4, "signal", vN4_1, "trafficSignal");
		addCoupling(t0_4, "signal", hE0_4, "trafficSignal");
		addCoupling(t0_4, "signal", hW0_5, "trafficSignal");
		
		
		addCoupling(t1_0, "signal", vS0_1, "trafficSignal");
		addCoupling(t1_0, "signal", vN0_2, "trafficSignal");
		addCoupling(t1_0, "signal", hE1_0, "trafficSignal");
		addCoupling(t1_0, "signal", hW1_1, "trafficSignal");
		
		addCoupling(t1_1, "signal", vS1_1, "trafficSignal");
		addCoupling(t1_1, "signal", vN1_2, "trafficSignal");
		addCoupling(t1_1, "signal", hE1_1, "trafficSignal");
		addCoupling(t1_1, "signal", hW1_2, "trafficSignal");
		
		addCoupling(t1_2, "signal", vS2_1, "trafficSignal");
		addCoupling(t1_2, "signal", vN2_2, "trafficSignal");
		addCoupling(t1_2, "signal", hE1_2, "trafficSignal");
		addCoupling(t1_2, "signal", hW1_3, "trafficSignal");
		
		addCoupling(t1_3, "signal", vS3_1, "trafficSignal");
		addCoupling(t1_3, "signal", vN3_2, "trafficSignal");
		addCoupling(t1_3, "signal", hE1_3, "trafficSignal");
		addCoupling(t1_3, "signal", hW1_4, "trafficSignal");
		
		addCoupling(t1_4, "signal", vS4_1, "trafficSignal");
		addCoupling(t1_4, "signal", vN4_2, "trafficSignal");
		addCoupling(t1_4, "signal", hE1_4, "trafficSignal");
		addCoupling(t1_4, "signal", hW1_5, "trafficSignal");
		
		
		addCoupling(t2_0, "signal", vS0_2, "trafficSignal");
		addCoupling(t2_0, "signal", vN0_3, "trafficSignal");
		addCoupling(t2_0, "signal", hE2_0, "trafficSignal");
		addCoupling(t2_0, "signal", hW2_1, "trafficSignal");
		
		addCoupling(t2_1, "signal", vS1_2, "trafficSignal");
		addCoupling(t2_1, "signal", vN1_3, "trafficSignal");
		addCoupling(t2_1, "signal", hE2_1, "trafficSignal");
		addCoupling(t2_1, "signal", hW2_2, "trafficSignal");
		
		addCoupling(t2_2, "signal", vS2_2, "trafficSignal");
		addCoupling(t2_2, "signal", vN2_3, "trafficSignal");
		addCoupling(t2_2, "signal", hE2_2, "trafficSignal");
		addCoupling(t2_2, "signal", hW2_3, "trafficSignal");
		
		addCoupling(t2_3, "signal", vS3_2, "trafficSignal");
		addCoupling(t2_3, "signal", vN3_3, "trafficSignal");
		addCoupling(t2_3, "signal", hE2_3, "trafficSignal");
		addCoupling(t2_3, "signal", hW2_4, "trafficSignal");
		
		addCoupling(t2_4, "signal", vS4_2, "trafficSignal");
		addCoupling(t2_4, "signal", vN4_3, "trafficSignal");
		addCoupling(t2_4, "signal", hE2_4, "trafficSignal");
		addCoupling(t2_4, "signal", hW2_5, "trafficSignal");
		
		//coupling generator and exterior streets
		addCoupling(vg, "car", vS0_0, "newCars");
		addCoupling(vg, "car", vS1_0, "newCars");
		addCoupling(vg, "car", vS2_0, "newCars");
		addCoupling(vg, "car", vS3_0, "newCars");
		addCoupling(vg, "car", vS4_0, "newCars");
		addCoupling(vg, "car", vN0_3, "newCars");
		addCoupling(vg, "car", vN1_3, "newCars");
		addCoupling(vg, "car", vN2_3, "newCars");
		addCoupling(vg, "car", vN3_3, "newCars");
		addCoupling(vg, "car", vN4_3, "newCars");
		addCoupling(vg, "car", hE0_0, "newCars");
		addCoupling(vg, "car", hE1_0, "newCars");
		addCoupling(vg, "car", hE2_0, "newCars");
		addCoupling(vg, "car", hW0_5, "newCars");
		addCoupling(vg, "car", hW1_5, "newCars");
		addCoupling(vg, "car", hW2_5, "newCars");
		
		//coupling streets together
		
		addCoupling(vS0_0, "carGoingLeft", hE0_1, "newCars");
		addCoupling(vS0_0, "carGoingStraight", vS0_1, "newCars");
		addCoupling(vS0_0, "carGoingRight", hW0_0, "newCars");
		addCoupling(hE0_1, "totalVolume", vS0_0, "leftStreetVolume");
		addCoupling(vS0_1, "totalVolume", vS0_0, "staightStreetVolume");
		addCoupling(hW0_0, "totalVolume", vS0_0, "rightStreetVolume");
		
		addCoupling(vS1_0, "carGoingLeft", hE0_2, "newCars");
		addCoupling(vS1_0, "carGoingStraight", vS1_1, "newCars");
		addCoupling(vS1_0, "carGoingRight", hW0_1, "newCars");
		addCoupling(hE0_2, "totalVolume", vS1_0, "leftStreetVolume");
		addCoupling(vS1_1, "totalVolume", vS1_0, "staightStreetVolume");
		addCoupling(hW0_1, "totalVolume", vS1_0, "rightStreetVolume");
		
		addCoupling(vS2_0, "carGoingLeft", hE0_3, "newCars");
		addCoupling(vS2_0, "carGoingStraight", vS2_1, "newCars");
		addCoupling(vS2_0, "carGoingRight", hW0_2, "newCars");
		addCoupling(hE0_3, "totalVolume", vS2_0, "leftStreetVolume");
		addCoupling(vS2_1, "totalVolume", vS2_0, "staightStreetVolume");
		addCoupling(hW0_2, "totalVolume", vS2_0, "rightStreetVolume");
		
		addCoupling(vS3_0, "carGoingLeft", hE0_4, "newCars");
		addCoupling(vS3_0, "carGoingStraight", vS3_1, "newCars");
		addCoupling(vS3_0, "carGoingRight", hW0_3, "newCars");
		addCoupling(hE0_4, "totalVolume", vS3_0, "leftStreetVolume");
		addCoupling(vS3_1, "totalVolume", vS3_0, "staightStreetVolume");
		addCoupling(hW0_3, "totalVolume", vS3_0, "rightStreetVolume");
		
		addCoupling(vS4_0, "carGoingLeft", hE0_5, "newCars");
		addCoupling(vS4_0, "carGoingStraight", vS4_1, "newCars");
		addCoupling(vS4_0, "carGoingRight", hW0_4, "newCars");
		addCoupling(hE0_5, "totalVolume", vS4_0, "leftStreetVolume");
		addCoupling(vS4_1, "totalVolume", vS4_0, "staightStreetVolume");
		addCoupling(hW0_4, "totalVolume", vS4_0, "rightStreetVolume");
		
		addCoupling(vS0_1, "carGoingLeft", hE1_1, "newCars");
		addCoupling(vS0_1, "carGoingStraight", vS0_2, "newCars");
		addCoupling(vS0_1, "carGoingRight", hW1_0, "newCars");
		addCoupling(hE1_1, "totalVolume", vS0_1, "leftStreetVolume");
		addCoupling(vS0_2, "totalVolume", vS0_1, "staightStreetVolume");
		addCoupling(hW1_0, "totalVolume", vS0_1, "rightStreetVolume");
		
		addCoupling(vS1_1, "carGoingLeft", hE1_2, "newCars");
		addCoupling(vS1_1, "carGoingStraight", vS1_2, "newCars");
		addCoupling(vS1_1, "carGoingRight", hW1_1, "newCars");
		addCoupling(hE1_2, "totalVolume", vS1_1, "leftStreetVolume");
		addCoupling(vS1_2, "totalVolume", vS1_1, "staightStreetVolume");
		addCoupling(hW1_1, "totalVolume", vS1_1, "rightStreetVolume");
		
		addCoupling(vS2_1, "carGoingLeft", hE1_3, "newCars");
		addCoupling(vS2_1, "carGoingStraight", vS2_2, "newCars");
		addCoupling(vS2_1, "carGoingRight", hW1_2, "newCars");
		addCoupling(hE1_3, "totalVolume", vS2_1, "leftStreetVolume");
		addCoupling(vS2_2, "totalVolume", vS2_1, "staightStreetVolume");
		addCoupling(hW1_2, "totalVolume", vS2_1, "rightStreetVolume");
		
		addCoupling(vS3_1, "carGoingLeft", hE1_4, "newCars");
		addCoupling(vS3_1, "carGoingStraight", vS3_2, "newCars");
		addCoupling(vS3_1, "carGoingRight", hW1_3, "newCars");
		addCoupling(hE1_4, "totalVolume", vS3_1, "leftStreetVolume");
		addCoupling(vS3_2, "totalVolume", vS3_1, "staightStreetVolume");
		addCoupling(hW1_3, "totalVolume", vS3_1, "rightStreetVolume");
		
		addCoupling(vS4_1, "carGoingLeft", hE1_5, "newCars");
		addCoupling(vS4_1, "carGoingStraight", vS4_2, "newCars");
		addCoupling(vS4_1, "carGoingRight", hW1_4, "newCars");
		addCoupling(hE1_5, "totalVolume", vS4_1, "leftStreetVolume");
		addCoupling(vS4_2, "totalVolume", vS4_1, "staightStreetVolume");
		addCoupling(hW1_4, "totalVolume", vS4_1, "rightStreetVolume");
		
		addCoupling(vN0_1, "carGoingRight", hE0_1, "newCars");
		addCoupling(vN0_1, "carGoingStraight", vN0_0, "newCars");
		addCoupling(vN0_1, "carGoingLeft", hW0_0, "newCars");
		addCoupling(hE0_1, "totalVolume", vN0_1, "rightStreetVolume");
		addCoupling(vN0_0, "totalVolume", vN0_1, "staightStreetVolume");
		addCoupling(hW0_0, "totalVolume", vN0_1, "leftStreetVolume");
		
		addCoupling(vN1_1, "carGoingRight", hE0_2, "newCars");
		addCoupling(vN1_1, "carGoingStraight", vN1_0, "newCars");
		addCoupling(vN1_1, "carGoingLeft", hW0_1, "newCars");
		addCoupling(hE0_2, "totalVolume", vN1_1, "rightStreetVolume");
		addCoupling(vN1_0, "totalVolume", vN1_1, "staightStreetVolume");
		addCoupling(hW0_1, "totalVolume", vN1_1, "leftStreetVolume");
		
		addCoupling(vN2_1, "carGoingRight", hE0_3, "newCars");
		addCoupling(vN2_1, "carGoingStraight", vN2_0, "newCars");
		addCoupling(vN2_1, "carGoingLeft", hW0_2, "newCars");
		addCoupling(hE0_3, "totalVolume", vN2_1, "rightStreetVolume");
		addCoupling(vN2_0, "totalVolume", vN2_1, "staightStreetVolume");
		addCoupling(hW0_2, "totalVolume", vN2_1, "leftStreetVolume");
		
		addCoupling(vN3_1, "carGoingRight", hE0_4, "newCars");
		addCoupling(vN3_1, "carGoingStraight", vN3_0, "newCars");
		addCoupling(vN3_1, "carGoingLeft", hW0_3, "newCars");
		addCoupling(hE0_4, "totalVolume", vN3_1, "rightStreetVolume");
		addCoupling(vN3_0, "totalVolume", vN3_1, "staightStreetVolume");
		addCoupling(hW0_3, "totalVolume", vN3_1, "leftStreetVolume");
		
		addCoupling(vN4_1, "carGoingRight", hE0_5, "newCars");
		addCoupling(vN4_1, "carGoingStraight", vN4_0, "newCars");
		addCoupling(vN4_1, "carGoingLeft", hW0_4, "newCars");
		addCoupling(hE0_5, "totalVolume", vN4_1, "rightStreetVolume");
		addCoupling(vN4_0, "totalVolume", vN4_1, "staightStreetVolume");
		addCoupling(hW0_4, "totalVolume", vN4_1, "leftStreetVolume");

		
		addCoupling(vS0_2, "carGoingLeft", hE2_1, "newCars");
		addCoupling(vS0_2, "carGoingStraight", vS0_3, "newCars");
		addCoupling(vS0_2, "carGoingRight", hW2_0, "newCars");
		addCoupling(hE2_1, "totalVolume", vS0_2, "leftStreetVolume");
		addCoupling(vS0_3, "totalVolume", vS0_2, "staightStreetVolume");
		addCoupling(hW2_0, "totalVolume", vS0_2, "rightStreetVolume");
		
		addCoupling(vS1_2, "carGoingLeft", hE2_2, "newCars");
		addCoupling(vS1_2, "carGoingStraight", vS1_3, "newCars");
		addCoupling(vS1_2, "carGoingRight", hW2_1, "newCars");
		addCoupling(hE2_2, "totalVolume", vS1_2, "leftStreetVolume");
		addCoupling(vS1_3, "totalVolume", vS1_2, "staightStreetVolume");
		addCoupling(hW2_1, "totalVolume", vS1_2, "rightStreetVolume");
		
		addCoupling(vS2_2, "carGoingLeft", hE2_3, "newCars");
		addCoupling(vS2_2, "carGoingStraight", vS2_3, "newCars");
		addCoupling(vS2_2, "carGoingRight", hW2_2, "newCars");
		addCoupling(hE2_3, "totalVolume", vS2_2, "leftStreetVolume");
		addCoupling(vS2_3, "totalVolume", vS2_2, "staightStreetVolume");
		addCoupling(hW2_2, "totalVolume", vS2_2, "rightStreetVolume");
		
		addCoupling(vS3_2, "carGoingLeft", hE2_4, "newCars");
		addCoupling(vS3_2, "carGoingStraight", vS3_3, "newCars");
		addCoupling(vS3_2, "carGoingRight", hW2_3, "newCars");
		addCoupling(hE2_4, "totalVolume", vS3_2, "leftStreetVolume");
		addCoupling(vS3_3, "totalVolume", vS3_2, "staightStreetVolume");
		addCoupling(hW2_3, "totalVolume", vS3_2, "rightStreetVolume");
		
		addCoupling(vS4_2, "carGoingLeft", hE2_5, "newCars");
		addCoupling(vS4_2, "carGoingStraight", vS4_3, "newCars");
		addCoupling(vS4_2, "carGoingRight", hW2_4, "newCars");
		addCoupling(hE2_5, "totalVolume", vS4_2, "leftStreetVolume");
		addCoupling(vS4_3, "totalVolume", vS4_2, "staightStreetVolume");
		addCoupling(hW2_4, "totalVolume", vS4_2, "rightStreetVolume");

		
		addCoupling(vN0_2, "carGoingRight", hE1_1, "newCars");
		addCoupling(vN0_2, "carGoingStraight", vN0_1, "newCars");
		addCoupling(vN0_2, "carGoingLeft", hW1_0, "newCars");
		addCoupling(hE1_1, "totalVolume", vN0_2, "rightStreetVolume");
		addCoupling(vN0_1, "totalVolume", vN0_2, "staightStreetVolume");
		addCoupling(hW1_0, "totalVolume", vN0_2, "leftStreetVolume");
		
		addCoupling(vN1_2, "carGoingRight", hE1_2, "newCars");
		addCoupling(vN1_2, "carGoingStraight", vN1_1, "newCars");
		addCoupling(vN1_2, "carGoingLeft", hW1_1, "newCars");
		addCoupling(hE1_2, "totalVolume", vN1_2, "rightStreetVolume");
		addCoupling(vN1_1, "totalVolume", vN1_2, "staightStreetVolume");
		addCoupling(hW1_1, "totalVolume", vN1_2, "leftStreetVolume");
		
		addCoupling(vN2_2, "carGoingRight", hE1_3, "newCars");
		addCoupling(vN2_2, "carGoingStraight", vN2_1, "newCars");
		addCoupling(vN2_2, "carGoingLeft", hW1_2, "newCars");
		addCoupling(hE1_3, "totalVolume", vN2_2, "rightStreetVolume");
		addCoupling(vN2_1, "totalVolume", vN2_2, "staightStreetVolume");
		addCoupling(hW1_2, "totalVolume", vN2_2, "leftStreetVolume");
		
		addCoupling(vN3_2, "carGoingRight", hE1_4, "newCars");
		addCoupling(vN3_2, "carGoingStraight", vN3_1, "newCars");
		addCoupling(vN3_2, "carGoingLeft", hW1_3, "newCars");
		addCoupling(hE1_4, "totalVolume", vN3_2, "rightStreetVolume");
		addCoupling(vN3_1, "totalVolume", vN3_2, "staightStreetVolume");
		addCoupling(hW1_3, "totalVolume", vN3_2, "leftStreetVolume");
		
		addCoupling(vN4_2, "carGoingRight", hE1_5, "newCars");
		addCoupling(vN4_2, "carGoingStraight", vN4_1, "newCars");
		addCoupling(vN4_2, "carGoingLeft", hW1_4, "newCars");
		addCoupling(hE1_5, "totalVolume", vN4_2, "rightStreetVolume");
		addCoupling(vN4_1, "totalVolume", vN4_2, "staightStreetVolume");
		addCoupling(hW1_4, "totalVolume", vN4_2, "leftStreetVolume");
		
		
		addCoupling(vN0_3, "carGoingRight", hE2_1, "newCars");
		addCoupling(vN0_3, "carGoingStraight", vN0_2, "newCars");
		addCoupling(vN0_3, "carGoingLeft", hW2_0, "newCars");
		addCoupling(hE2_1, "totalVolume", vN0_3, "rightStreetVolume");
		addCoupling(vN0_2, "totalVolume", vN0_3, "staightStreetVolume");
		addCoupling(hW2_0, "totalVolume", vN0_3, "leftStreetVolume");
		
		addCoupling(vN1_3, "carGoingRight", hE2_2, "newCars");
		addCoupling(vN1_3, "carGoingStraight", vN1_2, "newCars");
		addCoupling(vN1_3, "carGoingLeft", hW2_1, "newCars");
		addCoupling(hE2_2, "totalVolume", vN1_3, "rightStreetVolume");
		addCoupling(vN1_2, "totalVolume", vN1_3, "staightStreetVolume");
		addCoupling(hW2_1, "totalVolume", vN1_3, "leftStreetVolume");
		
		addCoupling(vN2_3, "carGoingRight", hE2_3, "newCars");
		addCoupling(vN2_3, "carGoingStraight", vN2_2, "newCars");
		addCoupling(vN2_3, "carGoingLeft", hW2_2, "newCars");
		addCoupling(hE2_3, "totalVolume", vN2_3, "rightStreetVolume");
		addCoupling(vN2_2, "totalVolume", vN2_3, "staightStreetVolume");
		addCoupling(hW2_2, "totalVolume", vN2_3, "leftStreetVolume");
		
		addCoupling(vN3_3, "carGoingRight", hE2_4, "newCars");
		addCoupling(vN3_3, "carGoingStraight", vN3_2, "newCars");
		addCoupling(vN3_3, "carGoingLeft", hW2_3, "newCars");
		addCoupling(hE2_4, "totalVolume", vN3_3, "rightStreetVolume");
		addCoupling(vN3_2, "totalVolume", vN3_3, "staightStreetVolume");
		addCoupling(hW2_3, "totalVolume", vN3_3, "leftStreetVolume");
		
		addCoupling(vN4_3, "carGoingRight", hE2_5, "newCars");
		addCoupling(vN4_3, "carGoingStraight", vN4_2, "newCars");
		addCoupling(vN4_3, "carGoingLeft", hW2_4, "newCars");
		addCoupling(hE2_5, "totalVolume", vN4_3, "rightStreetVolume");
		addCoupling(vN4_2, "totalVolume", vN4_3, "staightStreetVolume");
		addCoupling(hW2_4, "totalVolume", vN4_3, "leftStreetVolume");
		
		
		addCoupling(hE0_0, "carGoingRight", vS0_1, "newCars");
		addCoupling(hE0_0, "carGoingStraight", hE0_1, "newCars");
		addCoupling(hE0_0, "carGoingLeft", vN0_0, "newCars");
		addCoupling(vS0_1, "totalVolume", hE0_0, "rightStreetVolume");
		addCoupling(hE0_1, "totalVolume", hE0_0, "staightStreetVolume");
		addCoupling(vN0_0, "totalVolume", hE0_0, "leftStreetVolume");
		
		addCoupling(hE1_0, "carGoingRight", vS0_2, "newCars");
		addCoupling(hE1_0, "carGoingStraight", hE1_1, "newCars");
		addCoupling(hE1_0, "carGoingLeft", vN0_1, "newCars");
		addCoupling(vS0_2, "totalVolume", hE1_0, "rightStreetVolume");
		addCoupling(hE1_1, "totalVolume", hE1_0, "staightStreetVolume");
		addCoupling(vN0_1, "totalVolume", hE1_0, "leftStreetVolume");
		
		addCoupling(hE2_0, "carGoingRight", vS0_3, "newCars");
		addCoupling(hE2_0, "carGoingStraight", hE2_1, "newCars");
		addCoupling(hE2_0, "carGoingLeft", vN0_2, "newCars");
		addCoupling(vS0_3, "totalVolume", hE2_0, "rightStreetVolume");
		addCoupling(hE2_1, "totalVolume", hE2_0, "staightStreetVolume");
		addCoupling(vN0_2, "totalVolume", hE2_0, "leftStreetVolume");
		
		
		addCoupling(hE0_1, "carGoingRight", vS1_1, "newCars");
		addCoupling(hE0_1, "carGoingStraight", hE0_2, "newCars");
		addCoupling(hE0_1, "carGoingLeft", vN1_0, "newCars");
		addCoupling(vS1_1, "totalVolume", hE0_1, "rightStreetVolume");
		addCoupling(hE0_2, "totalVolume", hE0_1, "staightStreetVolume");
		addCoupling(vN1_0, "totalVolume", hE0_1, "leftStreetVolume");
		
		addCoupling(hE1_1, "carGoingRight", vS1_2, "newCars");
		addCoupling(hE1_1, "carGoingStraight", hE1_2, "newCars");
		addCoupling(hE1_1, "carGoingLeft", vN1_1, "newCars");
		addCoupling(vS1_2, "totalVolume", hE1_1, "rightStreetVolume");
		addCoupling(hE1_2, "totalVolume", hE1_1, "staightStreetVolume");
		addCoupling(vN1_1, "totalVolume", hE1_1, "leftStreetVolume");
		
		addCoupling(hE2_1, "carGoingRight", vS1_3, "newCars");
		addCoupling(hE2_1, "carGoingStraight", hE2_2, "newCars");
		addCoupling(hE2_1, "carGoingLeft", vN1_2, "newCars");
		addCoupling(vS1_3, "totalVolume", hE2_1, "rightStreetVolume");
		addCoupling(hE2_2, "totalVolume", hE2_1, "staightStreetVolume");
		addCoupling(vN1_2, "totalVolume", hE2_1, "leftStreetVolume");
		
		addCoupling(hW0_1, "carGoingRight", vS0_0, "newCars");
		addCoupling(hW0_1, "carGoingStraight", hW0_0, "newCars");
		addCoupling(hW0_1, "carGoingLeft", vN0_1, "newCars");
		addCoupling(vS0_0, "totalVolume", hW0_1, "rightStreetVolume");
		addCoupling(hW0_0, "totalVolume", hW0_1, "staightStreetVolume");
		addCoupling(vN0_1, "totalVolume", hW0_1, "leftStreetVolume");
		
		addCoupling(hW1_1, "carGoingRight", vS0_1, "newCars");
		addCoupling(hW1_1, "carGoingStraight", hW1_0, "newCars");
		addCoupling(hW1_1, "carGoingLeft", vN0_2, "newCars");
		addCoupling(vS0_1, "totalVolume", hW1_1, "rightStreetVolume");
		addCoupling(hW1_0, "totalVolume", hW1_1, "staightStreetVolume");
		addCoupling(vN0_2, "totalVolume", hW1_1, "leftStreetVolume");
		
		addCoupling(hW2_1, "carGoingRight", vS0_2, "newCars");
		addCoupling(hW2_1, "carGoingStraight", hW2_0, "newCars");
		addCoupling(hW2_1, "carGoingLeft", vN0_3, "newCars");
		addCoupling(vS0_2, "totalVolume", hW2_1, "rightStreetVolume");
		addCoupling(hW2_0, "totalVolume", hW2_1, "staightStreetVolume");
		addCoupling(vN0_3, "totalVolume", hW2_1, "leftStreetVolume");
		
		
		addCoupling(hE0_2, "carGoingRight", vS2_1, "newCars");
		addCoupling(hE0_2, "carGoingStraight", hE0_3, "newCars");
		addCoupling(hE0_2, "carGoingLeft", vN2_0, "newCars");
		addCoupling(vS2_1, "totalVolume", hE0_2, "rightStreetVolume");
		addCoupling(hE0_3, "totalVolume", hE0_2, "staightStreetVolume");
		addCoupling(vN2_0, "totalVolume", hE0_2, "leftStreetVolume");
		
		addCoupling(hE1_2, "carGoingRight", vS2_2, "newCars");
		addCoupling(hE1_2, "carGoingStraight", hE1_3, "newCars");
		addCoupling(hE1_2, "carGoingLeft", vN2_1, "newCars");
		addCoupling(vS2_2, "totalVolume", hE1_2, "rightStreetVolume");
		addCoupling(hE1_3, "totalVolume", hE1_2, "staightStreetVolume");
		addCoupling(vN2_1, "totalVolume", hE1_2, "leftStreetVolume");
		
		addCoupling(hE2_2, "carGoingRight", vS2_3, "newCars");
		addCoupling(hE2_2, "carGoingStraight", hE2_3, "newCars");
		addCoupling(hE2_2, "carGoingLeft", vN2_2, "newCars");
		addCoupling(vS2_3, "totalVolume", hE2_2, "rightStreetVolume");
		addCoupling(hE2_3, "totalVolume", hE2_2, "staightStreetVolume");
		addCoupling(vN2_2, "totalVolume", hE2_2, "leftStreetVolume");
		
		addCoupling(hW0_2, "carGoingRight", vS1_0, "newCars");
		addCoupling(hW0_2, "carGoingStraight", hW0_1, "newCars");
		addCoupling(hW0_2, "carGoingLeft", vN1_1, "newCars");
		addCoupling(vS1_0, "totalVolume", hW0_2, "rightStreetVolume");
		addCoupling(hW0_1, "totalVolume", hW0_2, "staightStreetVolume");
		addCoupling(vN1_1, "totalVolume", hW0_2, "leftStreetVolume");
		
		addCoupling(hW1_2, "carGoingRight", vS1_1, "newCars");
		addCoupling(hW1_2, "carGoingStraight", hW1_1, "newCars");
		addCoupling(hW1_2, "carGoingLeft", vN0_2, "newCars");
		addCoupling(vS1_1, "totalVolume", hW1_2, "rightStreetVolume");
		addCoupling(hW1_1, "totalVolume", hW1_2, "staightStreetVolume");
		addCoupling(vN0_2, "totalVolume", hW1_2, "leftStreetVolume");
		
		addCoupling(hW2_2, "carGoingRight", vS1_2, "newCars");
		addCoupling(hW2_2, "carGoingStraight", hW2_1, "newCars");
		addCoupling(hW2_2, "carGoingLeft", vN1_3, "newCars");
		addCoupling(vS1_2, "totalVolume", hW2_2, "rightStreetVolume");
		addCoupling(hW2_1, "totalVolume", hW2_2, "staightStreetVolume");
		addCoupling(vN1_3, "totalVolume", hW2_2, "leftStreetVolume");
		
		
		addCoupling(hE0_3, "carGoingRight", vS3_1, "newCars");
		addCoupling(hE0_3, "carGoingStraight", hE0_4, "newCars");
		addCoupling(hE0_3, "carGoingLeft", vN3_0, "newCars");
		addCoupling(vS3_1, "totalVolume", hE0_3, "rightStreetVolume");
		addCoupling(hE0_4, "totalVolume", hE0_3, "staightStreetVolume");
		addCoupling(vN3_0, "totalVolume", hE0_3, "leftStreetVolume");
		
		addCoupling(hE1_3, "carGoingRight", vS3_2, "newCars");
		addCoupling(hE1_3, "carGoingStraight", hE1_4, "newCars");
		addCoupling(hE1_3, "carGoingLeft", vN3_1, "newCars");
		addCoupling(vS3_2, "totalVolume", hE1_3, "rightStreetVolume");
		addCoupling(hE1_4, "totalVolume", hE1_3, "staightStreetVolume");
		addCoupling(vN3_1, "totalVolume", hE1_3, "leftStreetVolume");
		
		addCoupling(hE2_3, "carGoingRight", vS3_3, "newCars");
		addCoupling(hE2_3, "carGoingStraight", hE2_4, "newCars");
		addCoupling(hE2_3, "carGoingLeft", vN3_2, "newCars");
		addCoupling(vS3_3, "totalVolume", hE2_3, "rightStreetVolume");
		addCoupling(hE2_4, "totalVolume", hE2_3, "staightStreetVolume");
		addCoupling(vN3_2, "totalVolume", hE2_3, "leftStreetVolume");
		
		addCoupling(hW0_3, "carGoingRight", vS2_0, "newCars");
		addCoupling(hW0_3, "carGoingStraight", hW0_2, "newCars");
		addCoupling(hW0_3, "carGoingLeft", vN2_1, "newCars");
		addCoupling(vS2_0, "totalVolume", hW0_3, "rightStreetVolume");
		addCoupling(hW0_2, "totalVolume", hW0_3, "staightStreetVolume");
		addCoupling(vN2_1, "totalVolume", hW0_3, "leftStreetVolume");
		
		addCoupling(hW1_3, "carGoingRight", vS2_1, "newCars");
		addCoupling(hW1_3, "carGoingStraight", hW1_2, "newCars");
		addCoupling(hW1_3, "carGoingLeft", vN2_2, "newCars");
		addCoupling(vS2_1, "totalVolume", hW1_3, "rightStreetVolume");
		addCoupling(hW1_2, "totalVolume", hW1_3, "staightStreetVolume");
		addCoupling(vN2_2, "totalVolume", hW1_3, "leftStreetVolume");
		
		addCoupling(hW2_3, "carGoingRight", vS2_2, "newCars");
		addCoupling(hW2_3, "carGoingStraight", hW2_2, "newCars");
		addCoupling(hW2_3, "carGoingLeft", vN2_3, "newCars");
		addCoupling(vS2_2, "totalVolume", hW2_3, "rightStreetVolume");
		addCoupling(hW2_2, "totalVolume", hW2_3, "staightStreetVolume");
		addCoupling(vN2_3, "totalVolume", hW2_3, "leftStreetVolume");

		
		addCoupling(hE0_4, "carGoingRight", vS4_1, "newCars");
		addCoupling(hE0_4, "carGoingStraight", hE0_5, "newCars");
		addCoupling(hE0_4, "carGoingLeft", vN4_0, "newCars");
		addCoupling(vS4_1, "totalVolume", hE0_4, "rightStreetVolume");
		addCoupling(hE0_5, "totalVolume", hE0_4, "staightStreetVolume");
		addCoupling(vN4_0, "totalVolume", hE0_4, "leftStreetVolume");
		
		addCoupling(hE1_4, "carGoingRight", vS4_2, "newCars");
		addCoupling(hE1_4, "carGoingStraight", hE1_5, "newCars");
		addCoupling(hE1_4, "carGoingLeft", vN4_1, "newCars");
		addCoupling(vS4_2, "totalVolume", hE1_4, "rightStreetVolume");
		addCoupling(hE1_5, "totalVolume", hE1_4, "staightStreetVolume");
		addCoupling(vN4_1, "totalVolume", hE1_4, "leftStreetVolume");
		
		addCoupling(hE2_4, "carGoingRight", vS4_3, "newCars");
		addCoupling(hE2_4, "carGoingStraight", hE2_5, "newCars");
		addCoupling(hE2_4, "carGoingLeft", vN4_2, "newCars");
		addCoupling(vS4_3, "totalVolume", hE2_4, "rightStreetVolume");
		addCoupling(hE2_5, "totalVolume", hE2_4, "staightStreetVolume");
		addCoupling(vN4_2, "totalVolume", hE2_4, "leftStreetVolume");
		
		addCoupling(hW0_4, "carGoingRight", vS3_0, "newCars");
		addCoupling(hW0_4, "carGoingStraight", hW0_3, "newCars");
		addCoupling(hW0_4, "carGoingLeft", vN3_1, "newCars");
		addCoupling(vS3_0, "totalVolume", hW0_4, "rightStreetVolume");
		addCoupling(hW0_3, "totalVolume", hW0_4, "staightStreetVolume");
		addCoupling(vN3_1, "totalVolume", hW0_4, "leftStreetVolume");
		
		addCoupling(hW1_4, "carGoingRight", vS3_1, "newCars");
		addCoupling(hW1_4, "carGoingStraight", hW1_3, "newCars");
		addCoupling(hW1_4, "carGoingLeft", vN3_2, "newCars");
		addCoupling(vS3_1, "totalVolume", hW1_4, "rightStreetVolume");
		addCoupling(hW1_3, "totalVolume", hW1_4, "staightStreetVolume");
		addCoupling(vN3_2, "totalVolume", hW1_4, "leftStreetVolume");
		
		addCoupling(hW2_4, "carGoingRight", vS3_2, "newCars");
		addCoupling(hW2_4, "carGoingStraight", hW2_3, "newCars");
		addCoupling(hW2_4, "carGoingLeft", vN3_3, "newCars");
		addCoupling(vS3_2, "totalVolume", hW2_4, "rightStreetVolume");
		addCoupling(hW2_3, "totalVolume", hW2_4, "staightStreetVolume");
		addCoupling(vN3_3, "totalVolume", hW2_4, "leftStreetVolume");
		
		
		addCoupling(hW0_5, "carGoingRight", vS4_0, "newCars");
		addCoupling(hW0_5, "carGoingStraight", hW0_4, "newCars");
		addCoupling(hW0_5, "carGoingLeft", vN4_1, "newCars");
		addCoupling(vS4_0, "totalVolume", hW0_5, "rightStreetVolume");
		addCoupling(hW0_4, "totalVolume", hW0_5, "staightStreetVolume");
		addCoupling(vN4_1, "totalVolume", hW0_5, "leftStreetVolume");
		
		addCoupling(hW1_5, "carGoingRight", vS4_1, "newCars");
		addCoupling(hW1_5, "carGoingStraight", hW1_4, "newCars");
		addCoupling(hW1_5, "carGoingLeft", vN4_2, "newCars");
		addCoupling(vS4_1, "totalVolume", hW1_5, "rightStreetVolume");
		addCoupling(hW1_4, "totalVolume", hW1_5, "staightStreetVolume");
		addCoupling(vN4_2, "totalVolume", hW1_5, "leftStreetVolume");
		
		addCoupling(hW2_5, "carGoingRight", vS4_2, "newCars");
		addCoupling(hW2_5, "carGoingStraight", hW2_4, "newCars");
		addCoupling(hW2_5, "carGoingLeft", vN4_3, "newCars");
		addCoupling(vS4_2, "totalVolume", hW2_5, "rightStreetVolume");
		addCoupling(hW2_4, "totalVolume", hW2_5, "staightStreetVolume");
		addCoupling(vN4_3, "totalVolume", hW2_5, "leftStreetVolume");
		
		//street to internal lane coupling
		for(int x = 0; x < streets.size(); x++) {
			ArrayList<Lane> lanes = ((Street)(streets.get(x))).getLanes();
			for(int y = 0; y < lanes.size(); y++) {
				addCoupling(streets.get(x), "laneentering" + y, lanes.get(y), "newCar");
				addCoupling(streets.get(x), "trafficSignalOut", lanes.get(y), "trafficSignal");
				addCoupling(streets.get(x), "streetCapacities", lanes.get(y), "streetCapacities");
				addCoupling(lanes.get(y), "exitingCar", streets.get(x), "laneexiting" + y);
				addCoupling(lanes.get(y), "currentVolume", streets.get(x), "lanevolume" + y);
			}
		}
		
		//transducer coupling
		addCoupling(vN0_0, "carGoingStraight", tt, "carOut0");
		addCoupling(vN1_0, "carGoingStraight", tt, "carOut1");
		addCoupling(vN2_0, "carGoingStraight", tt, "carOut2");
		addCoupling(vN3_0, "carGoingStraight", tt, "carOut3");
		addCoupling(vN4_0, "carGoingStraight", tt, "carOut4");
		addCoupling(vS0_3, "carGoingStraight", tt, "carOut5");
		addCoupling(vS1_3, "carGoingStraight", tt, "carOut6");
		addCoupling(vS2_3, "carGoingStraight", tt, "carOut7");
		addCoupling(vS3_3, "carGoingStraight", tt, "carOut8");
		addCoupling(vS4_3, "carGoingStraight", tt, "carOut9");
		addCoupling(hE0_5, "carGoingStraight", tt, "carOut10");
		addCoupling(hE1_5, "carGoingStraight", tt, "carOut11");
		addCoupling(hE2_5, "carGoingStraight", tt, "carOut12");
		addCoupling(hW0_0, "carGoingStraight", tt, "carOut13");
		addCoupling(hW1_0, "carGoingStraight", tt, "carOut14");
		addCoupling(hW2_0, "carGoingStraight", tt, "carOut15");
		addCoupling(tt, "timeOut", this, "timeFinished");


		
		initialize();
	}
}
