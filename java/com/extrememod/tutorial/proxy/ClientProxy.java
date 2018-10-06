package com.extrememod.tutorial.proxy;

import com.extrememod.tutorial.init.ModItems;

public abstract class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
	}
}
