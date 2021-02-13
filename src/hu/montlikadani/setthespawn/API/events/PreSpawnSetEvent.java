package hu.montlikadani.setthespawn.API.events;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.Validate;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * Fired when a player attempted to set a spawn.
 */
public class PreSpawnSetEvent extends BaseEvent implements Cancellable {

	private double cost;
	private boolean perWorld;

	private Location location;
	private Player player;
	private World targetWorld;

	private final List<String> groups = new ArrayList<>();

	private boolean cancelled = false;

	public PreSpawnSetEvent(Location location) {
		this(location, 0D);
	}

	public PreSpawnSetEvent(Location location, double cost) {
		this(location, cost, false);
	}

	public PreSpawnSetEvent(Location location, double cost, boolean perWorld) {
		this.location = location;
		this.perWorld = perWorld;

		setCost(cost);
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
		Validate.isTrue(cost >= 0, "Cost should be greater than -1 (>= 0)");

		this.cost = cost;
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

	/**
	 * Returns the target world where to teleport the player.
	 * <p>
	 * Set to <code>null</code> to use the {@link #getLocation()} world.
	 * 
	 * @return the target world
	 */
	public World getTargetWorld() {
		return targetWorld;
	}

	/**
	 * Sets the target world where to teleport the player.
	 * 
	 * @param targetWorld {@link World}
	 */
	public void setTargetWorld(World targetWorld) {
		this.targetWorld = targetWorld;
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
