package application.model.rooms;

import java.util.HashMap;

import application.model.Room;
import application.model.items.Scenery;
import application.MapManager;
 
public class Bedroom extends Room {
	
	public static String identifier = "Bedroom";

	public Bedroom (HashMap<String, Room> rooms) { 
		super(rooms, "You wake up suddenly, in your bed.\n\"Man, what a weird dream...\" you think, as you look around your room.\nHowever, you look on your sidetable, and see the mysterious book...\nThe book is open with all the treasures inside...\n------------------------\nTHANKS for PLAYING! Inspect the book to go to the ending room.", "You see your bedroom, where you just came from");
		super.id = identifier;
	}
	
	@Override public void initialize () {
		// Add Doorways 
		// None, you made it to the end!
		
		// Add Items, Enemies, Weapons, Bags, etc.
		addItem(new Scenery("Book", "Mysterious", "") {
			@Override
			public void executeInspect() {
				MapManager.moveOnWin();
			}
		});
		// TODO Add some fun items to examine in your bedroom
	}
}