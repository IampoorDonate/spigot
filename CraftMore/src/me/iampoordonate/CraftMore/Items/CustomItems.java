package me.iampoordonate.CraftMore.Items;

import me.iampoordonate.CraftMore.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class CustomItems implements Listener {
  public ItemStack grassblock = new ItemStack(Material.GRASS_BLOCK, 1);
  
  private ItemMeta grassmeta = this.grassblock.getItemMeta();
  
  private Plugin plugin = (Plugin)Main.getPlugin(Main.class);
  
  public void giveItems(Player player) {
    this.grassmeta.setDisplayName(ChatColor.WHITE + "Grass Block");
    player.getInventory().addItem(new ItemStack[] { this.grassblock });
  }
  
  public void grassrecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe grassrecipe = new ShapedRecipe(this.grassblock);
    grassrecipe.shape(new String[] { "###", "%%%", "%%%" });
    grassrecipe.setIngredient('#', Material.WHEAT_SEEDS);
    grassrecipe.setIngredient('%', Material.DIRT);
    this.plugin.getServer().addRecipe((Recipe)grassrecipe);
  }
  
  public ItemStack gravel = new ItemStack(Material.GRAVEL, 1);
  
  private ItemMeta gravelmeta = this.gravel.getItemMeta();
  
  public void giveItems1(Player player) {
    this.gravelmeta.setDisplayName(ChatColor.WHITE + "Gravel");
    player.getInventory().addItem(new ItemStack[] { this.gravel });
  }
  
  public void gravelrecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe gravelrecipe = new ShapedRecipe(this.gravel);
    gravelrecipe.shape(new String[] { "   ", " ##", " ##" });
    gravelrecipe.setIngredient('#', Material.FLINT);
    this.plugin.getServer().addRecipe((Recipe)gravelrecipe);
  }
  
  public ItemStack diaore = new ItemStack(Material.DIAMOND_ORE, 1);
  
  private ItemMeta diaoremeta = this.diaore.getItemMeta();
  
  public void giveItems2(Player player) {
    this.diaoremeta.setDisplayName(ChatColor.WHITE + "Diamond Ore");
    player.getInventory().addItem(new ItemStack[] { this.diaore });
  }
  
  public void diaorerecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe diaorerecipe = new ShapedRecipe(this.diaore);
    diaorerecipe.shape(new String[] { "%%%", "%#%", "%%%" });
    diaorerecipe.setIngredient('#', Material.DIAMOND);
    diaorerecipe.setIngredient('%', Material.STONE);
    this.plugin.getServer().addRecipe((Recipe)diaorerecipe);
  }
  
  public ItemStack goldore = new ItemStack(Material.GOLD_ORE, 1);
  
  private ItemMeta goldoremeta = this.goldore.getItemMeta();
  
  public void giveItems3(Player player) {
    this.goldoremeta.setDisplayName(ChatColor.WHITE + "Gold Ore");
    player.getInventory().addItem(new ItemStack[] { this.goldore });
  }
  
  public void goldorerecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe goldorerecipe = new ShapedRecipe(this.goldore);
    goldorerecipe.shape(new String[] { "%%%", "%#%", "%%%" });
    goldorerecipe.setIngredient('#', Material.GOLD_INGOT);
    goldorerecipe.setIngredient('%', Material.STONE);
    this.plugin.getServer().addRecipe((Recipe)goldorerecipe);
  }
  
  public ItemStack emeraldore = new ItemStack(Material.EMERALD_ORE, 1);
  
  private ItemMeta emeraldoremeta = this.emeraldore.getItemMeta();
  
  public void giveItems4(Player player) {
    this.emeraldoremeta.setDisplayName(ChatColor.WHITE + "Emerald Ore");
    player.getInventory().addItem(new ItemStack[] { this.emeraldore });
  }
  
  public void emeraldorerecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe emeraldorerecipe = new ShapedRecipe(this.emeraldore);
    emeraldorerecipe.shape(new String[] { "%%%", "%#%", "%%%" });
    emeraldorerecipe.setIngredient('#', Material.EMERALD);
    emeraldorerecipe.setIngredient('%', Material.STONE);
    this.plugin.getServer().addRecipe((Recipe)emeraldorerecipe);
  }
  
  public ItemStack ironore = new ItemStack(Material.IRON_ORE, 1);
  
  private ItemMeta ironoremeta = this.ironore.getItemMeta();
  
  public void giveItems5(Player player) {
    this.ironoremeta.setDisplayName(ChatColor.WHITE + "Iron Ore");
    player.getInventory().addItem(new ItemStack[] { this.ironore });
  }
  
  public void ironorerecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe ironorerecipe = new ShapedRecipe(this.ironore);
    ironorerecipe.shape(new String[] { "%%%", "%#%", "%%%" });
    ironorerecipe.setIngredient('#', Material.IRON_INGOT);
    ironorerecipe.setIngredient('%', Material.STONE);
    this.plugin.getServer().addRecipe((Recipe)ironorerecipe);
  }
  
  public ItemStack coalore = new ItemStack(Material.COAL_ORE, 1);
  
  private ItemMeta coaloremeta = this.coalore.getItemMeta();
  
  public void giveItems6(Player player) {
    this.coaloremeta.setDisplayName(ChatColor.WHITE + "Coal Ore");
    player.getInventory().addItem(new ItemStack[] { this.coalore });
  }
  
  public void coalorerecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe coalorerecipe = new ShapedRecipe(this.coalore);
    coalorerecipe.shape(new String[] { "%%%", "%#%", "%%%" });
    coalorerecipe.setIngredient('#', Material.COAL);
    coalorerecipe.setIngredient('%', Material.STONE);
    this.plugin.getServer().addRecipe((Recipe)coalorerecipe);
  }
  
  public ItemStack redstoneore = new ItemStack(Material.REDSTONE_ORE, 1);
  
  private ItemMeta redstoneoremeta = this.redstoneore.getItemMeta();
  
  public void giveItems7(Player player) {
    this.redstoneoremeta.setDisplayName(ChatColor.WHITE + "Redstone Ore");
    player.getInventory().addItem(new ItemStack[] { this.redstoneore });
  }
  
  public void redstoneorerecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe redstoneorerecipe = new ShapedRecipe(this.redstoneore);
    redstoneorerecipe.shape(new String[] { "%%%", "%#%", "%%%" });
    redstoneorerecipe.setIngredient('#', Material.REDSTONE);
    redstoneorerecipe.setIngredient('%', Material.STONE);
    this.plugin.getServer().addRecipe((Recipe)redstoneorerecipe);
  }
  
  public ItemStack lapizore = new ItemStack(Material.LAPIS_ORE, 1);
  
  private ItemMeta lapizoremeta = this.lapizore.getItemMeta();
  
  public void giveItems8(Player player) {
    this.lapizoremeta.setDisplayName(ChatColor.WHITE + "Lapis Lazuli Ore");
    player.getInventory().addItem(new ItemStack[] { this.lapizore });
  }
  
  public void lapizorerecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe lapizorerecipe = new ShapedRecipe(this.lapizore);
    lapizorerecipe.shape(new String[] { "%%%", "%#%", "%%%" });
    lapizorerecipe.setIngredient('#', Material.LAPIS_LAZULI);
    lapizorerecipe.setIngredient('%', Material.STONE);
    this.plugin.getServer().addRecipe((Recipe)lapizorerecipe);
  }
  
  public ItemStack cobweb = new ItemStack(Material.COBWEB, 1);
  
  private ItemMeta cobwebmeta = this.cobweb.getItemMeta();
  
  public void giveItems9(Player player) {
    this.cobwebmeta.setDisplayName(ChatColor.WHITE + "Cobweb");
    player.getInventory().addItem(new ItemStack[] { this.cobweb });
  }
  
  public void cobwebrecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe cobwebrecipe = new ShapedRecipe(this.cobweb);
    cobwebrecipe.shape(new String[] { "# #", " # ", "# #" });
    cobwebrecipe.setIngredient('#', Material.STRING);
    this.plugin.getServer().addRecipe((Recipe)cobwebrecipe);
  }
  
  public ItemStack qore = new ItemStack(Material.NETHER_QUARTZ_ORE, 1);
  
  private ItemMeta qoremeta = this.qore.getItemMeta();
  
  public void giveItems10(Player player) {
    this.qoremeta.setDisplayName(ChatColor.WHITE + "Nether Quartz Ore");
    player.getInventory().addItem(new ItemStack[] { this.qore });
  }
  
  public void qorerecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe qorerecipe = new ShapedRecipe(this.qore);
    qorerecipe.shape(new String[] { "%%%", "%#%", "%%%" });
    qorerecipe.setIngredient('#', Material.QUARTZ);
    qorerecipe.setIngredient('%', Material.NETHERRACK);
    this.plugin.getServer().addRecipe((Recipe)qorerecipe);
  }
  
  public ItemStack flint = new ItemStack(Material.FLINT, 4);
  
  private ItemMeta flintmeta = this.flint.getItemMeta();
  
  public void giveItems11(Player player) {
    this.flintmeta.setDisplayName(ChatColor.WHITE + "Flint");
    player.getInventory().addItem(new ItemStack[] { this.flint });
  }
  
  public void flintrecipe() {
    @SuppressWarnings("deprecation")
	ShapelessRecipe flintrecipe = new ShapelessRecipe(this.flint);
    flintrecipe.addIngredient(1, Material.GRAVEL);
    this.plugin.getServer().addRecipe((Recipe)flintrecipe);
  }
  
  public ItemStack moss = new ItemStack(Material.MOSSY_COBBLESTONE, 1);
  
  private ItemMeta mossmeta = this.moss.getItemMeta();
  
  public void giveItems12(Player player) {
    this.mossmeta.setDisplayName(ChatColor.WHITE + "Mossy Cobblestone");
    player.getInventory().addItem(new ItemStack[] { this.moss });
  }
  
  public void mossrecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe mossrecipe = new ShapedRecipe(this.moss);
    mossrecipe.shape(new String[] { "###", "#%#", "###" });
    mossrecipe.setIngredient('#', Material.COBBLESTONE);
    mossrecipe.setIngredient('%', Material.VINE);
    this.plugin.getServer().addRecipe((Recipe)mossrecipe);
  }
  
  public ItemStack elytra = new ItemStack(Material.ELYTRA, 1);
  
  private ItemMeta elytrameta = this.elytra.getItemMeta();
  
  public void giveItems13(Player player) {
    this.elytrameta.setDisplayName(ChatColor.WHITE + "Elytra");
    player.getInventory().addItem(new ItemStack[] { this.elytra });
  }
  
  public void elytrarecipe() {
    @SuppressWarnings("deprecation")
	ShapedRecipe elytrarecipe = new ShapedRecipe(this.elytra);
    elytrarecipe.shape(new String[] { "#%#", "#$#", "#%#" });
    elytrarecipe.setIngredient('#', Material.FEATHER);
    elytrarecipe.setIngredient('%', Material.DIAMOND);
    elytrarecipe.setIngredient('$', Material.NETHER_STAR);
    this.plugin.getServer().addRecipe((Recipe)elytrarecipe);
  }
}