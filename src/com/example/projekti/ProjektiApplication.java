package com.example.projekti;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class ProjektiApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Projekti Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
