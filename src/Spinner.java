
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
 
 for(i=0; i<100;i++){
  inv.getItem(11).setInventorySlot(inv.getItem(11)+1);
  inv.getitem(12).setInventorySlot(inv.getItem(12)+1);
  inv.getitem(13).setInventorySlot(inv.getItem(13)+1);
  inv.getitem(14).setInventorySlot(inv.getItem(14)+1);
  inv.getitem(15).setInventorySlot(inv.getItem(15)+1);
  inv.getitem(16).setInventorySlot(inv.getItem(16)+1);
  inv.getitem(17).setInventorySlot(inv.getItem(17)+1);
  inv.getItem(18).setInventorySlot(1);
  p.playSound(p.getLocation(),Sound.NOTE_STICKS,5, 1);
 }
 
}

@EventHandler
public void onInventoryClick(InventoryClickEvent e){
 e.setCancelled(true);
}

}
