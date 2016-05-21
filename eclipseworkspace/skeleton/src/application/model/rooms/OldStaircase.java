package application.model.rooms;

import java.util.HashMap;

import application.model.Room;
import application.model.items.Scenery;
import application.model.Doorway;
import application.model.Doorway.Direction;
 
public class OldStaircase extends Room {
	
	public static String identifier = "OldStaircase";

	public OldStaircase (HashMap<String, Room> rooms) { 
		super(rooms, "You stand in front of the staircase.\nThis staircase has a few rotten boards leading up to darkness,\nbefore falling apart entirely", "You see the ruins of a staircase.");
		super.id = identifier;
	}
	
	@Override public void initialize () {
		// Add Doorways 
		addDoorway(new Doorway(Direction.NORTH, this.rooms.get(House.identifier)));
		
		// Add Items, Enemies, Weapons, Bags, etc.
		addItem(new Scenery("Staircase", "Decaying", "is entirely unusable. It's not even worth trying"));
	}
}
