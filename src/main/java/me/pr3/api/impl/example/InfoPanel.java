package me.pr3.api.impl.example;

import me.pr3.api.component.AbstractPanel;
import me.pr3.api.component.Component;
import me.pr3.api.component.Drawable;
import me.pr3.api.component.Label;

import java.util.List;

/**
 * @author tim
 */
public class InfoPanel extends AbstractPanel {

    public InfoPanel(){
        setChildren(List.of(
                new Label("Info1"),
                new Label("Info2"),
                new Label("Info3")
                ));
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
