package application.model.rooms;

import java.util.HashMap;

import application.model.Room;
import application.model.Doorway;
import application.model.Doorway.Direction;
 
public class FlowerTrailA extends Room {
	
	public static String identifier = "FlowerTrailA";

	public FlowerTrailA (HashMap<String, Room> rooms) { 
		super(rooms, "You are standing on a trail marked by beautiful flowers, although the howling gets louder.\nThe flowers continue to the east", "You observe a beautiful path of flowers, and hear howling");
		super.id = identifier;
	}
	
	@Override public void initialize () {
		// Add Doorways 
		addDoorway(new Doorway(Direction.EAST, this.rooms.get(FlowerTrailB.identifier)));
		addDoorway(new Doorway(Direction.NORTH, this.rooms.get(CrossRoads.identifier)));
		
		// Add Items, Enemies, Weapons, Bags, etc.
		
	}
}
