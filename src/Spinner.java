
public class Spinner implements Listener {

private Inventory inv;
private ItemStack i1 = new ItemStack(Material.DIAMOND);
private ItemStack i2 = new ItemStack(Material.EMERALD);
private ItemStack i3 = new ItemStack(Material.GOLD);
private ItemStack i4 = new ItemStack(Material.IRON);
private ItemStack i5 = new ItemStack(Material.COAL
private ItemStack i6 = new ItemStack(Material.REDSTONE);
private ItemStack needle = new ItemStack(Material.ARROW);

ItemStack[] items = new ItemStack(Arrays.asList(i1, i2, i3, i4, i5, i6));

public Spinner(Plugin p){

}

public void show(Player p){
 p.openInventory(inv);
 
  for(ItemStack i : items.next()){
   if(!i.hasNext()){
    
   }
   inv.setItem(4, new ItemStack(Material.AIR));
   inv.setItem(4, i);
  }
  
}

@EventHandler
public void onInventoryClick(InventoryClickEvent e){
 e.setCancelled(true);
}

}
