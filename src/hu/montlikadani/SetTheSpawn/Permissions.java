package hu.montlikadani.SetTheSpawn;

import org.bukkit.permissions.Permission;

public class Permissions {

	public Permission perm1 = new Permission("setthespawn.plugininfo");
	public Permission perm2 = new Permission("setthespawn.help");
	public Permission perm3 = new Permission("setthespawn.reload");
	public Permission perm4 = new Permission("setthespawn.plugindisable");
	public Permission perm5 = new Permission("setthespawn.setspawn");
	public Permission perm6 = new Permission("setthespawn.spawn.use");
	public Permission perm7 = new Permission("setthespawn.delspawn");
	public Permission perm8 = new Permission(SetTheSpawn.getInstance().getConfig().getString("cancel-teleport-on-move.permission"));
	public Permission perm9 = new Permission("setthespawn.bypass.cooldown");
	public Permission perm10 = new Permission("setthespawn.cmd.tabcomplete");
	public Permission perm11 = new Permission("setthespawn.spawn.teleport.all");
	public Permission perm12 = new Permission("setthespawn.spawn.teleport.other");
	public Permission perm13 = new Permission("setthespawn.spawn.setup");
	public Permission perm14 = new Permission("setthespawn.sign.create");
	public Permission perm15 = new Permission("setthespawn.sign.break");
	public Permission perm16 = new Permission("setthespawn.sign.use");
	public Permission perm17 = new Permission(SetTheSpawn.getInstance().getConfig().getString("spawn-cost.permission"));
	public Permission perm18 = new Permission(SetTheSpawn.getInstance().getConfig().getString("spawn-cost.sign.permission"));

}
