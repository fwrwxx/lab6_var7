package lab_6_var_7;

import java.util.ArrayList;
import java.util.List;

public class Panel implements UIElement {
    private String name;
    private List<UIElement> elements = new ArrayList<>();

    public Panel(String name) {
        this.name = name;
    }

    public void addElement(UIElement element) {
        elements.add(element);
    }

    public List<UIElement> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPanel(this);
    }
}
