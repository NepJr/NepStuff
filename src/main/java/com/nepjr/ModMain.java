package com.nepjr;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModMain.MODID, name = ModMain.NAME, version = ModMain.VERSION)
public class ModMain
{
    public static final String MODID = "nepstuff";
    public static final String NAME = "Nep Stuff";
    public static final String VERSION = "1.0-rv1";
    public static final String LOGMODID = "[NepStuff " + VERSION + "] ";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        System.out.println(LOGMODID + "PreInitialization starting...");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	System.out.println(LOGMODID + "Initialization starting...");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
    	System.out.println(LOGMODID + "PostInitialization starting...");
    }
}
