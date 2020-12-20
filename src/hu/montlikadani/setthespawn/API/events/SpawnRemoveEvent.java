package hu.montlikadani.setthespawn.API.events;

import hu.montlikadani.setthespawn.SpawnData;

/**
 * Called when a spawn has been removed by a player.
 */
public class SpawnRemoveEvent extends BaseEvent {

	private SpawnData spawnData;

	public SpawnRemoveEvent(SpawnData spawnData) {
		this.spawnData = spawnData;
	}

	/**
	 * Returns the removed spawn data.
	 * 
	 * @return {@link SpawnData}
	 */
	public SpawnData getSpawnData() {
		return spawnData;
	}
}
