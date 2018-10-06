package com.extrememod.tutorial;

public class Reference {

	public static final String MOD_ID = "etm";
	public static final String NAME = "Trigger Block Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	
	public static final String CLEINT_PROXY_CLASS = "com.extrememod.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.extrememod.tutorial.proxy.ServerProxy";
	
	public static enum TutorialItems {
		SHOWN_ALPHA("shown_alpha", "ItemShown_Alpha");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}	
}