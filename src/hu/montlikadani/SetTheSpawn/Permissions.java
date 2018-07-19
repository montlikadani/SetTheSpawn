package hu.montlikadani.SetTheSpawn;

import org.bukkit.permissions.Permission;

public class Permissions {

	private static SetTheSpawn plugin = SetTheSpawn.getPlugin(SetTheSpawn.class);

	public static final Permission PINFO = new Permission("setthespawn.plugininfo");
	public static final Permission HELP = new Permission("setthespawn.help");
	public static final Permission RELOAD = new Permission("setthespawn.reload");
	public static final Permission PDISABLE = new Permission("setthespawn.plugindisable");
	public static final Permission TABCOMP = new Permission("setthespawn.cmd.tabcomplete");
	public static final Permission SETSPAWN = new Permission("setthespawn.setspawn");
	public static final Permission SPAWNUSE = new Permission("setthespawn.spawn.use");
	public static final Permission DELSPAWN = new Permission("setthespawn.delspawn");
	public static final Permission BYPASSCOOLD = new Permission("setthespawn.bypass.cooldown");
	public static final Permission SPAWNALL = new Permission("setthespawn.spawn.teleport.all");
	public static final Permission SPAWNOTHER = new Permission("setthespawn.spawn.teleport.other");
	public static final Permission SETUP = new Permission("setthespawn.spawn.setup");
	public static final Permission CREATESIGN = new Permission("setthespawn.sign.create");
	public static final Permission BREAKSIGN = new Permission("setthespawn.sign.break");
	public static final Permission USESIGN = new Permission("setthespawn.sign.use");
	public static final Permission SIGNTPALL = new Permission("setthespawn.sign.use.everybody");
	public static final Permission STOPALLCOUNT = new Permission("setthespawn.countdown.stopall");
	public static final Permission BYPASSPVP = new Permission("setthespawn.bypass.blockspawninpvp");

	public static final Permission SPAWNCOST = new Permission(plugin.getConfig().getString("spawn-cost.permission"));
	public static final Permission SPAWNSIGNCOST = new Permission(plugin.getConfig().getString("spawn-cost.sign.permission"));
	public static final Permission SPAWNMOVEDCOST = new Permission(plugin.getConfig().getString("cancel-teleport.move.pay-if-moved.permission"));
	public static final Permission SPAWNJUMPEDCOST = new Permission(plugin.getConfig().getString("cancel-teleport.jump.pay-if-jumped.permission"));
	public static final Permission SPAWNDAMAGECOST = new Permission(plugin.getConfig().getString("cancel-teleport.damage.pay-if-damage.permission"));
	public static final Permission CANCELTPMOVE = new Permission(plugin.getConfig().getString("cancel-teleport.move.permission"));
	public static final Permission CANCELTPJUMP = new Permission(plugin.getConfig().getString("cancel-teleport.jump.permission"));
	public static final Permission CANCELTPDAMAGE = new Permission(plugin.getConfig().getString("cancel-teleport.damage.permission"));

}
