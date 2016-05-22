package application.model.rooms;

import java.util.HashMap;

import application.model.Room;
import application.model.Doorway;
import application.model.Doorway.Direction;
 
public class CrossRoads extends Room {
	
	public static String identifier = "CrossRoads";

	public CrossRoads (HashMap<String, Room> rooms) { 
		super(rooms, "You are standing in a place the dirt trail takes a hard turn.\nBreadcrumbs lead north, and flowers lead south", "You observe a crossing of two different trails");
		super.id = identifier;
	}
	
	@Override public void initialize () {
		// Add Doorways
		addDoorway(new Doorway(Direction.WEST, this.rooms.get(ForestPath.identifier)));
		//addDoorway(new Doorway(Direction.SOUTH, this.rooms.get(FlowerTrailA.identifier)));
		addDoorway(new Doorway(Direction.NORTH, this.rooms.get(BreadcrumbA.identifier)));
		
		// Add Items, Enemies, Weapons, Bags, etc.
		
	}
}
