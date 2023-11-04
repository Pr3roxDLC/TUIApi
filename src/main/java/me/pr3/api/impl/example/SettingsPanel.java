package me.pr3.api.impl.example;

import me.pr3.api.component.AbstractPanel;
import me.pr3.api.component.Component;
import me.pr3.api.component.Drawable;

import java.util.List;

import static me.pr3.api.impl.example.PrintingService.PRINTING_SERVICE;

/**
 * @author tim
 */
public class SettingsPanel extends AbstractPanel {

    public SettingsPanel() {
        setChildren(List.of(
                new SimpleButton(0, () -> System.out.println("Button1 has been clicked")),
                new SimpleButton(0, () -> PRINTING_SERVICE.print()),
                new SimpleButton(0, () -> System.out.println("Button3 has been clicked")),
                new InfoPanel()
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
