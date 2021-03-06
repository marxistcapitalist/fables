package application.model.rooms;

import java.util.HashMap;

import application.model.Doorway;
import application.model.Doorway.Direction;
import application.model.Room;
import application.model.items.Paper;
 
public class ClearingNorth extends Room {
	
	public static String identifier = "ClearingNorth";

	public ClearingNorth (HashMap<String, Room> rooms) { 
		super(rooms, "This is a clearing, with a forest surrounding you on the west and south. There is a pile of leaves on the ground.");
		super.id = identifier;
	}
	
	@Override public void initialize () {
		addDoorway(new Doorway(Direction.WEST, this.rooms.get(ForestWest.identifier)));
		addDoorway(new Doorway(Direction.DOWN, this.rooms.get(GratingRoom.identifier), "Grating", "gratingkey"));
		addDoorway(new Doorway(Direction.NORTH, this.rooms.get(ClearingNorth.identifier)));
		addDoorway(new Doorway(Direction.EAST, this.rooms.get(ForestNorth.identifier)));
		addDoorway(new Doorway(Direction.SOUTH, this.rooms.get(ForestPath.identifier)));
		
		addItem(new Paper("Leaves","Pile-Of","is covering some grating"));
	}
}
