package com.dataexport;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup("dataexport")
public interface DataExportConfig extends Config
{
	@ConfigItem(
		keyName = "includeBank",
		name = "Include bank",
		description = "Include bank in data export",
		position = 1
	)
	default boolean includeBank()
	{
		return false;
	}

	@ConfigItem(
		keyName = "includeSeedVault",
		name = "Include seed vault",
		description = "Include seed vault in data export",
		position = 2
	)
	default boolean includeSeedVault()
	{
		return false;
	}

	@ConfigItem(
		keyName = "includeInventory",
		name = "Include inventory",
		description = "Include inventory in data export",
		position = 3
	)
	default boolean includeInventory()
	{
		return false;
	}

	@ConfigItem(
		keyName = "includeEquipment",
		name = "Include equipment",
		description = "Include equipment in data export",
		position = 4
	)
	default boolean includeEquipment()
	{
		return false;
	}

	@ConfigItem(
		keyName = "displayExport",
		name = "Include export button",
		description = "Include export button for each container in panel",
		position = 5
	)
	default boolean displayExport()
	{
		return false;
	}

	@ConfigItem(
		keyName = "displayDownload",
		name = "Include download down",
		description = "Include download button for each container in panel",
		position = 6
	)
	default boolean displayDownload()
	{
		return false;
	}

}
