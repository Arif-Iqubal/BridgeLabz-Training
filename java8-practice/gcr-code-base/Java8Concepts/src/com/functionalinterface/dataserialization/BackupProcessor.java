package com.functionalinterface.dataserialization;

//Backup processor checks marker interface
public class BackupProcessor {

	public static void processBackup(Object obj) {

		if (obj instanceof BackupSerializable) {
			System.out.println("Backing up object: " + obj.getClass().getSimpleName());
		} else {
			System.out.println("Object not eligible for backup");
		}
	}
}
