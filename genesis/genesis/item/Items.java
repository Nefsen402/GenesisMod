package genesis.genesis.item;

import net.minecraft.item.Item;

import net.minecraftforge.common.EnumHelper;

import genesis.genesis.item.ItemSets.*;
import genesis.genesis.lib.IDs;
import genesis.genesis.lib.Names;

public class Items {

	public static ItemGenesis zircon;
	public static ItemsToolSet zirconTools;
	public static ItemsSuitOfArmor zirconArmor;
	
	public static ItemGenesis quartz;
	
	public static ItemGenesis olivine;
	public static ItemsToolSet olivineTools;
	public static ItemsSuitOfArmor olivineArmor;
	
	public static ItemGenesis hematite;
	public static ItemsToolSet hematiteTools;
	public static ItemsSuitOfArmor hematiteArmor;
	
	public static ItemGenesis garnet;
	
	public static void init() {
		zircon = (ItemGenesis) new ItemGenesis(IDs.itemZirconID)
				.setUnlocalizedName(Names.itemZircon).setTextureName("zircon");
		zirconTools = new ItemsToolSet(IDs.itemsZirconToolsStartID, 
				EnumHelper.addToolMaterial(Names.itemZirconMaterial.toUpperCase(), 2, 625, 6.5F, 1.5F, 12),
				Names.itemZirconMaterial, zircon, Item.stick);
		zirconArmor = new ItemsSuitOfArmor(IDs.itemsZirconArmorStartID,
					EnumHelper.addArmorMaterial(Names.itemZirconMaterial.toUpperCase(), 17, new int[] {2, 7, 5, 2}, 9),
					Names.itemZirconMaterial, zircon);
		
		quartz = (ItemGenesis) new ItemGenesis(IDs.itemQuartzID)
				.setUnlocalizedName(Names.itemQuartz).setTextureName("quartz");
		
		olivine = (ItemGenesis) new ItemGenesis(IDs.itemOlivineID)
				.setUnlocalizedName(Names.itemOlivine).setTextureName("olivine");
		olivineTools = new ItemsToolSet(IDs.itemsOlivineToolsStartID, 
				EnumHelper.addToolMaterial(Names.itemOlivineMaterial.toUpperCase(), 3, 500, 8, 3, 10),
				Names.itemOlivineMaterial, olivine, Item.stick);
		olivineArmor = new ItemsSuitOfArmor(IDs.itemsOlivineArmorStartID,
					EnumHelper.addArmorMaterial(Names.itemOlivineMaterial.toUpperCase(), 17, new int[] {3, 8, 6, 3}, 9),
					Names.itemOlivineMaterial, olivine);
		
		hematite = (ItemGenesis) new ItemGenesis(IDs.itemHematiteID)
				.setUnlocalizedName(Names.itemHematite).setTextureName("hematite");
		hematiteTools = new ItemsToolSet(IDs.itemsHematiteToolsStartID, 
				EnumHelper.addToolMaterial(Names.itemHematiteMaterial.toUpperCase(), 3, 375, 8, 3, 10),
				Names.itemHematiteMaterial, hematite, Item.stick);
		hematiteArmor = new ItemsSuitOfArmor(IDs.itemsHematiteArmorStartID,
					EnumHelper.addArmorMaterial(Names.itemHematiteMaterial.toUpperCase(), 17, new int[] {3, 8, 6, 3}, 9),
					Names.itemHematiteMaterial, hematite);
		
		garnet = (ItemGenesis) new ItemGenesis(IDs.itemGarnetID)
				.setUnlocalizedName(Names.itemGarnet).setTextureName("garnet");
	}
	
	public static void registerItems() {
		Recipes.registerRecipes();
		ItemSets.registerAllRecipes();
	}
}
