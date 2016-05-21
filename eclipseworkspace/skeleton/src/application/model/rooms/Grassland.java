package application.model.rooms;

import java.util.HashMap;

import application.model.Room;
import application.model.Doorway;
import application.model.Doorway.Direction;
 
public class Grassland extends Room {
	
	public static String identifier = "Grassland";

	public Grassland (HashMap<String, Room> rooms) { 
		super(rooms, "You see a tranquil expanse of grassy hills. A slight breeze comes from a less-tranquil clearing to the north", "You see the rolling hills of an open grassland");
		super.id = identifier;
	}
	
	@Override public void initialize () {
		// Add Doorways 
		addDoorway(new Doorway(Direction.NORTH, this.rooms.get(ClearingW.identifier)));
		addDoorway(new Doorway(Direction.EAST, this.rooms.get(WornRoadB.identifier)));
		
		// Add Items, Enemies, Weapons, Bags, etc.
	}
}
