package application.model.rooms;

import java.util.HashMap;

import application.model.Doorway;
import application.model.Doorway.Direction;
import application.model.Room;
import application.model.items.Apple;
import application.model.items.Bag;
import application.model.items.Chest;
import application.model.items.Paper;
 
public class HouseDining extends Room {
	
	public static String identifier = "HouseDining";

	public HouseDining (HashMap<String, Room> rooms) { 
		super(rooms, "This is the kitchen of the white house. A table seems to have been used recently for the preparation of food. A passage leads to the west, and a dark staircase can be seen leading upward. A dark chimney leads down and to the east is a small window");
		super.id = identifier;
	}
	
	@Override public void initialize () {
		addDoorway(new Doorway(Direction.WEST, this.rooms.get(HouseLiving.identifier),"LivingRoom"));
		addDoorway(new Doorway(Direction.UP, this.rooms.get(HouseAttic.identifier), "Stairs"));
		addDoorway(new Doorway(Direction.EAST, this.rooms.get(BehindHouse.identifier),"Window","housewindow"));
		
		addItem(new Chest("Table","Kitchen",
					new Bag("Sack","Brown","smells of hot peppers",
						new Apple("Clove","Garlic","smells garlicy"),
						new Apple("Lunch","Medium","smells spicy")
						),
				new Paper("Bottle","Glass","very small")
				));	
	}
}
