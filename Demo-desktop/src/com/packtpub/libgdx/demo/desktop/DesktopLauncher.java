package com.packtpub.libgdx.demo.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.packtpub.libgdx.demo.MyDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="demo";
		config.width=480;
		config.height=320;
		config.useGL30=false;
		new LwjglApplication(new MyDemo(), config);
	}
}
