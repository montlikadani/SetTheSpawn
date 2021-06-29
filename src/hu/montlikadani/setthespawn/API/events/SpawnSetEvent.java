package hu.montlikadani.setthespawn.API.events;

import hu.montlikadani.setthespawn.spawn.SpawnData;

/**
 * Fired when a spawn set by a player.
 */
public class SpawnSetEvent extends BaseEvent {

	private SpawnData data;

	public SpawnSetEvent(SpawnData data) {
		this.data = data;
	}

	/**
	 * Returns the set of spawn data.
	 * 
	 * @return {@link SpawnData}
	 */
	public SpawnData getSpawnData() {
		return data;
	}
}
