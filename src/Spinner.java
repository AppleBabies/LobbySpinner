
public class Spinner implements Listener {

private Inventory inv;
private ItemStack i1 = new ItemStack(Material.DIAMOND);
private ItemStack i2 = new ItemStack(Material.EMERALD);
private ItemStack i3 = new ItemStack(Material.GOLD);
private ItemStack i4 = new ItemStack(Material.IRON);
private ItemStack i5 = new ItemStack(Material.COAL
private ItemStack i6 = new ItemStack(Material.REDSTONE);
private ItemStack needle = new ItemStack(Material.ARROW);

public Spinner(Plugin p){

}

public void show(Player p){
 p.openInventory(inv);
}

}
