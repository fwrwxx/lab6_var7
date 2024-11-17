package lab_6_var_7;

public class CountElementsVisitor implements Visitor {
    private String elementTypeToCount;
    private int count = 0;

    public CountElementsVisitor(String elementTypeToCount) {
        this.elementTypeToCount = elementTypeToCount;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void visitPanel(Panel panel) {
        for (UIElement element : panel.getElements()) {
            element.accept(this);
        }
    }

    @Override
    public void visitButton(Button button) {
        if (button.getName().equals(elementTypeToCount)) {
            count++;
        }
    }
}
