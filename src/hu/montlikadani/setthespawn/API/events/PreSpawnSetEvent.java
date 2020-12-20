package hu.montlikadani.setthespawn.API.events;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.Validate;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * Fired when a player attempted to set a spawn.
 */
public class PreSpawnSetEvent extends BaseEvent implements Cancellable {

	private Location location;
	private double cost;
	private List<String> groups;
	private boolean perWorld;
	private Player player;

	private boolean cancelled = false;

	public PreSpawnSetEvent() {
		this(null);
	}

	public PreSpawnSetEvent(Location location) {
		this(location, 0D);
	}

	public PreSpawnSetEvent(Location location, double cost) {
		this(location, cost, Collections.emptyList());
	}

	public PreSpawnSetEvent(Location location, double cost, List<String> groups) {
		this(location, cost, groups, false);
	}

	public PreSpawnSetEvent(Location location, double cost, List<String> groups, boolean perWorld) {
		this.location = location;
		setCost(cost);
		this.groups = groups;
		this.perWorld = perWorld;
	}

	/**
	 * Returns the location where the spawn attempted to set.
	 * 
	 * @return {@link Location}
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * Returns the amount of cost for spawn usage.
	 * 
	 * @return amount of cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * Returns a list of groups for which the spawn has been attempted set.
	 * 
	 * @return the list of groups
	 */
	public List<String> getGroups() {
		return groups;
	}

	/**
	 * Checks whenever the spawn is per world handled.
	 * 
	 * @return true if yes
	 */
	public boolean isPerWorld() {
		return perWorld;
	}

	/**
	 * Returns the player who attempted to set spawn.
	 * 
	 * @return {@link Player}
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Sets the new location for the spawn.
	 * 
	 * @param location {@link Location}
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * Sets the cost for the spawn.
	 * 
	 * @param cost the new cost (>= 0)
	 * @return the new cost
	 */
	public void setCost(double cost) {
		Validate.isTrue(cost >= 0, "Cost should be greater or equals than zero (>= 0)");

		this.cost = cost;
	}

	/**
	 * Sets the new list of groups for spawn.
	 * 
	 * @param groups list of group names
	 * @return the new list
	 */
	public void setGroups(List<String> groups) {
		this.groups = groups == null ? Collections.emptyList() : groups;
	}

	/**
	 * Sets the player who attempts to set spawn.
	 * 
	 * @param player {@link Player}
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * Sets the per world to a new boolean.
	 * 
	 * @param perWorld true/false
	 */
	public void setPerWorld(boolean perWorld) {
		this.perWorld = perWorld;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
}
