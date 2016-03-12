package ru.test;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/**
 * Created by andrei on 12.03.2016.
 */
public class CalculatorApplication extends UI {
    @Override
    public void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);
        layout.addComponent(new Label("Hello, world!"));
    }
}
