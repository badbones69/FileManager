# Welcome to my FileManager class.
### Description:
This is my FileManager that I use in my plugins. It allows for many easy to use features.
### Features:
- Static Files
- CustomFiles
- Register Default Folders
- Register Default CustomFiles
- Built-in Logger
- One class FileManager

### Static Files:
**Description**: Static files are easy to add and get to by just adding the file as an Enum and adding its file name and file path. It will auto-generate when it doesn't exist.	

**Usage**: Files that need to exist for a specific purpose.		

**Example**: Config files that are home to settings that can be changed in the plugin.

### Custom Files:
**Description**: CustomFiles are optional files that are found inside a folder. These files do not need to exist but can be used for information saving.	

**Usage**: Data files that don't need to exist but can have multiple different versions.	

**Example**: Saved player data in different files so that it is easier to find a specific player's data.	

### Registered Default Folders:
**Description**: Default folders are used to generate a folder when it doesn't exist. This is useful for a folder that can house CustomFiles so users can add files to it.	
	
**Usage**: Used to load a folder that doesn't exist.	

**Example**: Schematics folder that holds schematics but doesn't have to have any inside it.	

### Registered Default CustomFiles:
**Description**: These are files that are saved into the Default Folders when the folder doesn't exist. These files Do Not regenerate unless the home folder they are located in doesn't exist.	
	
**Usage**: Used to load default data files like Crate files that are needed to show the users how to use the files or to have default files for the plugin to run.	
	
**Example**: Default crate files for a crate plugin to that loads only when the home folder doesn't exist to allow the plugin to function normally without error.	

### Built-In Logger:
**Description**: Logs all the data for files and folders when they are created, loaded, or can't be loaded or created.	

**Usage**: Used to help check when a file has loaded into the system or is not loading correctly.	

**Example**: Turning on the logger to see if a data file loads. If not it will tell you it couldn't be loaded or if it doesn't show up it will mean it wasn't registered or found.	