package com.in28minutes.oops.level2;

public abstract class AbstractReceipe {

	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();
}
