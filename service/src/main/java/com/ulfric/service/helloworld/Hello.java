package com.ulfric.service.helloworld;

import com.ulfric.turtle.TurtleService;

public class Hello extends TurtleService {

	@Override
	public void onEnable()
	{
		this.install(HelloResource.class);
	}

}
