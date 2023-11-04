package me.pr3.api.impl.example;

import me.pr3.api.component.AbstractPanel;
import me.pr3.api.component.Component;
import me.pr3.api.component.Drawable;

import java.util.Arrays;

/**
 * @author tim
 */
public class BasicPanel extends AbstractPanel {

    public BasicPanel(Component... components){
        this.setChildren(Arrays.asList(components));
    }

    @Override
    public void draw() {
        for (Component child : getChildren()) {
            if(child instanceof Drawable drawable){
                drawable.draw();
            }
        }
    }
}
