package me.pr3.api.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tim
 */
public abstract class AbstractPanel extends Component implements Container, Drawable{
    List<Component> children = new ArrayList<>();

    @Override
    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void setChildren(List<Component> children) {
        this.children = children;
    }

}
