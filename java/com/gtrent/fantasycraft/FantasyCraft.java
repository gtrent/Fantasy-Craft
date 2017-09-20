package com.gtrent.fantasycraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FantasyCraft.modId, name = FantasyCraft.name, version = FantasyCraft.version, acceptedMinecraftVersions = "[1.12.2]")
public class FantasyCraft {
	@SidedProxy(serverSide = "com.gtrent.fantasycraft.proxy.CommonProxy", clientSide = "com.gtrent.fantasycraft.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "FantasyCraft";
	public static final String name = "Fantasy Craft";
	public static final String version = "1.0.0";
	
	@Mod.Instance(modId)
	public static FantasyCraft instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
