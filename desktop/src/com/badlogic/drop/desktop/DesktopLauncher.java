package com.badlogic.drop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.drop.Hi_Low_Main;


public class DesktopLauncher {
	/*
	Main that has a set height and width
	 */
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = 800;
		config.width = 800;
		new LwjglApplication(new Hi_Low_Main(), config);
	}
}
