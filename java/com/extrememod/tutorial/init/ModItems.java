package com.extrememod.tutorial.init;

import com.extrememod.tutorial.Reference;
import com.extrememod.tutorial.items.ItemShown_Alpha;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;



public class ModItems {
	
	public static Item shown_alpha;
	
	public static void init() {
		shown_alpha = new ItemShown_Alpha();
	}
	
	public static void register() {
	
	}
	
	public static void registerRenders() {
		registerRender(shown_alpha);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
