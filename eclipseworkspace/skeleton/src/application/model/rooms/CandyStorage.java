package application.model.rooms;

import java.util.HashMap;

import application.model.Room;
import application.model.items.Apple;
import application.model.items.Scenery;
import application.model.Doorway;
import application.model.Doorway.Direction;
 
public class CandyStorage extends Room {
	
	public static String identifier = "CandyStorage";

	public CandyStorage (HashMap<String, Room> rooms) { 
		super(rooms, "You are standing in a room full of bones and rotting flesh. It smells revolting", "You see a rather dark, foul-smelling room");
		super.id = identifier;
	}
	
	@Override public void initialize () {
		// Add Doorways 
		addDoorway(new Doorway(Direction.WEST, this.rooms.get(CandyHouse.identifier)));
		
		// Add Items, Enemies, Weapons, Bags, etc.
		addItem(new Scenery("Head", "Decapitated", "is heavily rotted. You prefer not to describe its appearance, even to yourself"));
		addItem(new Scenery("Pile", "Gut", "is something you'd rather not look at, lest you lose your lunch"));
		addItem(new Scenery("Pile", "Bone", "is unfortunately the least disgusting thing in the room"));
	}
}
