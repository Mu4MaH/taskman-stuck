package org.alex;

import org.alex.controller.Bootstrap;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class App {

    public static void main(String[] args) throws Exception {
        Weld weld = new Weld();
        WeldContainer container = weld.addPackages(App.class).initialize();
        Bootstrap bootstrap = container.select(Bootstrap.class).get();
        bootstrap.init();
    }

}
