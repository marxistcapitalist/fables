package application.model.items;

import application.MapManager;
import application.model.Item;
import application.model.interfaces.Inventoryable;
import application.model.interfaces.Statusable;
import application.view.Logger;
import application.view.LogEntry.LogType;

public class Sword extends Item implements Inventoryable, Statusable {
	
public Sword() { super(); }
	
	public Sword(String name) {
		identifier = name;
	}
	
	public Sword(String name, String description, String information) {
		this(name);
		super.description = description;
		super.information = information;	
	}

	@Override
	public void executeDrop() {
		super.executeDrop();
		MapManager.getInventoryItems().add(this);
		MapManager.getCurrentRoom().getRoomItems().remove(this);
		Logger.log(LogType.RESPONSE, "The sword begins to glow...");
		Logger.log(LogType.ITEM, "The sword zooms back to your grasp");
	}

	@Override
	public void executeTake() {
		Logger.log(LogType.RESPONSE, "The sword begins to glow...");
	}

}
