package lab_6_var_7;

public class Main {
    public static void main(String[] args) {
        // Creating UI elements
        UIElement button1 = new Button("ButtonA");
        UIElement button2 = new Button("ButtonB");
        UIElement panel = new Panel("Panel1");

        // Adding elements to the panel
        ((Panel) panel).addElement(button1);
        ((Panel) panel).addElement(button2);

        // Creating CountElementsVisitor instances for different element types
        CountElementsVisitor countVisitorA = new CountElementsVisitor("ButtonA");
        CountElementsVisitor countVisitorB = new CountElementsVisitor("ButtonB");

        // Accepting visitors to count elements
        panel.accept(countVisitorA);
        panel.accept(countVisitorB);

        // Printing the count of each element type
        System.out.println("Number of 'ButtonA' elements: " + countVisitorA.getCount());
        System.out.println("Number of 'ButtonB' elements: " + countVisitorB.getCount());
    }
}
