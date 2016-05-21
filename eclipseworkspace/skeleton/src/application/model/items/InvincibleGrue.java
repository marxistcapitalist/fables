package application.model.items;

import application.MapManager;
import application.MapManager.Health;
import application.model.Item;
import application.model.interfaces.Killable;
import application.view.Logger;
import application.view.LogEntry.LogType;

public class InvincibleGrue extends Grue implements Killable {
	
	public int health =  0;
	
	public InvincibleGrue() { super(); }
	
	public InvincibleGrue(String name) {
		super(name);
	}
	
	public InvincibleGrue(String name, String description, String information, int health) {
		super(name, description, information, health);
	}
	

	@Override
	public void executeUsedUpon(Item item) {
		this.killByGrue();
	}

	@Override
	public void executeUsedUponConsumed(Item item) {
		this.killByGrue();
	}
	
	@Override
	public void executeInspect() {
		this.killByGrue();
	}
	
	protected void killByGrue() {
		Logger.log(LogType.KILL, "You are eaten by a grue.\nHow GRUEsome!");
		MapManager.setHealth(Health.DEAD);
	}

}
