package lab_6_var_7;

public class Button implements UIElement {
    private String name;

    public Button(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitButton(this);
    }
}
