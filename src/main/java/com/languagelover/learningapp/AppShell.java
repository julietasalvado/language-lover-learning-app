package com.languagelover.learningapp;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

/**
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@PWA(name = "Language Lover Learning App", shortName = "language--lover--learning--app")
public class AppShell implements AppShellConfigurator {
}
