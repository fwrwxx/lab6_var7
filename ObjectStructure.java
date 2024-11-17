package lab_6_var_7;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<UIElement> elements = new ArrayList<>();

    public void addElement(UIElement element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        for (UIElement element : elements) {
            element.accept(visitor);
        }
    }
}
