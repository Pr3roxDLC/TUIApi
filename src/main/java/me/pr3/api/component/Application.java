package me.pr3.api.component;

/**
 * @author tim
 */
public class Application {
    public AbstractPanel rootPanel;

    public AbstractPanel getRootPanel() {
        return rootPanel;
    }

    public void setRootPanel(AbstractPanel rootPanel) {
        this.rootPanel = rootPanel;
    }
}
