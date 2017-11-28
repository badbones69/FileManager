package me.badbones69.filemanager;

import org.bukkit.plugin.java.JavaPlugin;

import me.badbones69.filemanager.FileManager.Files;

public class Main extends JavaPlugin {
	
	//Loads all the files into this location.
	private FileManager fileManager = FileManager.getInstance();
	
	@Override
	public void onEnable() {
		//Turns on the logger for the files.
		fileManager.logInfo(true)
		
		//Registers a folder with custom files like Per player data files.
		.registerCustomFilesFolder("/playerdata")
		
		//Registers any custom files that need to be loaded when a folder doesn't exist.
		//Example: Crate plugin that has default crate folder but allows the users to delete the files and make their own.
		//This is good for files that don't need to be in the folder unless when generating the folder.
		.registerDefaultGenerateFiles("badbones69.yml", "/playerdata")
		.registerDefaultGenerateFiles("diamonddagger.yml", "/playerdata")
		.registerDefaultGenerateFiles("randomperson.yml", "/playerdata")
		
		//Starts to setup and load all of the files data.
		.setup(this);
		
		//Just to separate it to be read easier.
		System.out.println(" ");
		
		//Checking to make sure the logger is logging.
		System.out.println("Logging Status: " + (fileManager.isLogging() ? "On" : "Off"));
		
		//Just to separate it to be read easier.
		System.out.println(" ");
		
		//Just to check that the info can be read.
		System.out.println("List of config options:");
		for(String i : Files.CONFIG.getFile().getConfigurationSection("Settings").getKeys(false)) {
			System.out.println(i);
		}
		
		//Just to separate it to be read easier.
		System.out.println(" ");
		
		//Just testing the reading again but in another file.
		System.out.println("List of enchantments:");
		for(String i : Files.ENCHANTMENTS.getFile().getConfigurationSection("Enchantments").getKeys(false)) {
			System.out.println(i);
		}
		
		//Just to separate it to be read easier.
		System.out.println(" ");
		
		//Testing the custom files to make sure it gets the data and they loaded right.
		System.out.println("Nick Names:");
		System.out.println("RandomPerson: " + fileManager.getFile("randomperson").getFile().getString("Name"));
		System.out.println("DiamondDagger: " + fileManager.getFile("diamonddagger").getFile().getString("Name"));
		System.out.println("BadBones69: " + fileManager.getFile("badbones69").getFile().getString("Name"));
		
		//Just to separate it to be read easier.
		System.out.println(" ");
		
		System.out.println("File saving test:");
		fileManager.saveFile("diamonddagger");
		fileManager.saveFile(fileManager.getFile("diamonddagger"));
		
		//Just to separate it to be read easier.
		System.out.println(" ");
		
		System.out.println("File reload test:");
		fileManager.reloadFile("diamonddagger");
		fileManager.reloadFile(fileManager.getFile("diamonddagger"));
	}
	
}