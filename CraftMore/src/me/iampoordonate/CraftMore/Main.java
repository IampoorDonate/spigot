package me.iampoordonate.CraftMore;

import me.iampoordonate.CraftMore.Events.EventsClass;
import me.iampoordonate.CraftMore.Items.CustomItems;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
  public void onEnable() {
    getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "\n\nCraftMore has been Enabled\n\n");
    getServer().getPluginManager().registerEvents((Listener)new EventsClass(), (Plugin)this);
    loadConfig();
    
    CustomItems grassblock = new CustomItems();
    grassblock.grassrecipe();
    
    CustomItems gravel = new CustomItems();
    gravel.gravelrecipe();
    
    CustomItems diaore = new CustomItems();
    diaore.diaorerecipe();
    
    CustomItems goldore = new CustomItems();
    goldore.goldorerecipe();
    
    CustomItems emeraldore = new CustomItems();
    emeraldore.emeraldorerecipe();
    
    CustomItems ironore = new CustomItems();
    ironore.ironorerecipe();
    
    CustomItems caolore = new CustomItems();
    caolore.coalorerecipe();
    
    CustomItems redstoneore = new CustomItems();
    redstoneore.redstoneorerecipe();
    
    CustomItems lapizore = new CustomItems();
    lapizore.lapizorerecipe();
    
    CustomItems cobweb = new CustomItems();
    cobweb.cobwebrecipe();
    
    CustomItems qore = new CustomItems();
    qore.qorerecipe();
    
    CustomItems flint = new CustomItems();
    flint.flintrecipe();
    
    CustomItems moss = new CustomItems();
    moss.mossrecipe();
    
    CustomItems elytra = new CustomItems();
    elytra.elytrarecipe();
  }
  
  public void onDisable() {
    getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nCraftMore has been disabled\n\n");
  }
  
  public void loadConfig() {
    getConfig().options().copyDefaults(true);
    saveConfig();
  }
}