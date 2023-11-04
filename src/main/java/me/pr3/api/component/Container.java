package me.pr3.api.component;

import java.util.List;

/**
 * @author tim
 */
public interface Container {
     List<Component> getChildren();
     void setChildren(List<Component> children);
}
