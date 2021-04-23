package me.tolekpro.mainpackage;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;
public class Main extends JavaPlugin implements Listener{
	
	public Inventory anvil;
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		anvilgui();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public void anvilgui() {
		anvil = Bukkit.createInventory(null, 18);
		
		ItemStack item = new ItemStack(Material.WOODEN_AXE);
		ItemMeta meta = item.getItemMeta();
		
		// GUI items
		meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Admin GUI");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "test");
		meta.setLore(lore);
		item.setItemMeta(meta);
		anvil.setItem(0, item);
	}

	

}
