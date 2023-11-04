package me.pr3.api.impl.example;

import me.pr3.api.component.AbstractButton;

/**
 * @author tim
 */
public class SimpleButton extends AbstractButton {

    int tabIndex = 0;
    Runnable r = null;

    public SimpleButton(int tabIndex, Runnable r){
        this.tabIndex = tabIndex;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Button");
    }

    @Override
    public void clicked() {
        r.run();
    }

    @Override
    public int getTabIndex() {
        return 0;
    }
}
