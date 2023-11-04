package me.pr3.api.component;

/**
 * @author tim
 */
public class Label extends Component implements Drawable{
    private String text;

    public Label(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        System.out.println(text);
    }
}
