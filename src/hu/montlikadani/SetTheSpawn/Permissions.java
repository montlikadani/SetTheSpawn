package hu.montlikadani.SetTheSpawn;

public class Permissions {

	private static SetTheSpawn plugin = SetTheSpawn.getPlugin(SetTheSpawn.class);

	public enum Perm {
		PINFO("setthespawn.plugininfo"),
		HELP("setthespawn.help"),
		RELOAD("setthespawn.reload"),
		PDISABLE("setthespawn.disable"),
		SETSPAWN("setthespawn.setspawn"),
		SPAWNUSE("setthespawn.spawn.use"),
		DELSPAWN("setthespawn.delspawn"),
		BYPASSCOOLD("setthespawn.bypass.cooldown"),
		SPAWNALL("setthespawn.spawn.teleport.all"),
		SPAWNOTHER("setthespawn.spawn.teleport.other"),
		SETUP("setthespawn.spawn.setup"),
		CREATESIGN("setthespawn.sign.create"),
		BREAKSIGN("setthespawn.sign.break"),
		USESIGN("setthespawn.sign.use"),
		SIGNTPALL("setthespawn.sign.use.everybody"),
		STOPALLCOUNT("setthespawn.countdown.stopall"),
		BYPASSPVP("setthespawn.bypass.blockspawninpvp"),
		BUKKITSPAWN("setthespawn.bukkitspawn"),
		BUKKITSPAWNOTHER("setthespawn.bukkitspawn.other"),
		IMPORTESSSPAWN("setthespawn.importessspawn"),
		TOGGLESPAWN("setthespawn.togglespawn"),
		BYPASSTOGGLESPAWN("setthespawn.togglespawn.bypass"),
		BYPASSFLY("setthespawn.bypass.fly"),
		BYPASSFIRE("setthespawn.bypass.fire"),
		BYPASSSNEAK("setthespawn.bypass.sneak"),

		SPAWNCOST(plugin.getConfig().getString("spawn-cost.permission")),
		SPAWNSIGNCOST(plugin.getConfig().getString("spawn-cost.sign.permission")),
		SPAWNMOVEDCOST(plugin.getConfig().getString("cancel-teleport.move.pay-if-moved.permission")),
		SPAWNJUMPEDCOST(plugin.getConfig().getString("cancel-teleport.jump.pay-if-jumped.permission")),
		SPAWNDAMAGECOST(plugin.getConfig().getString("cancel-teleport.damage.pay-if-damage.permission")),
		CANCELTPMOVE(plugin.getConfig().getString("cancel-teleport.move.permission")),
		CANCELTPJUMP(plugin.getConfig().getString("cancel-teleport.jump.permission")),
		CANCELTPDAMAGE(plugin.getConfig().getString("cancel-teleport.damage.permission"));

		private String perm;

		Perm(String perm) {
			this.perm = perm;
		}

		public String getPerm() {
			return perm;
		}
	}
}
