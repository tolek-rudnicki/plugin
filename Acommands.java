package me.tolekpro.mainpackage.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

import me.tolekpro.mainpackage.Main;

public class Acommands implements CommandExecutor, Listener{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		switch(label.toLowerCase()) {
		case "agui":
			Player player = (Player) sender;
			player.openInventory(Main.getPlugin(Main.anvilgui));
		}
		return false;
	}
	


}
