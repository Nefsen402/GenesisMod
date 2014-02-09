package genesis.lib;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;

import genesis.common.Genesis;

public class LogHelper {

	private static Logger logger = Logger.getLogger(Genesis.MOD_ID);
	private static boolean ready = false;

	public static void init() {
		logger.setParent((Logger) FMLLog.getLogger());
		ready = true;
	}

	public static void log(Level logLevel, String message) {
		if (ready)
			logger.log(logLevel, message);
		else
			System.out.println("[genesis] " + message);
	}

	// For debugging
	public static void log(String message) {
		log(Level.FINE, "[" + FMLCommonHandler.instance().getEffectiveSide() + "] " + message);
	}

}
