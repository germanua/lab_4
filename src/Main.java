import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = List.of("13", "36", "50"); // Example numerical data
        DiagramDisplay diagramDisplay = new DiagramDisplay(data, new BarDiagram());
        diagramDisplay.displayDiagram();

        // You can change the diagram strategy dynamically like this:
        diagramDisplay.setDiagramStrategy(new PieDiagram());
        diagramDisplay.displayDiagram();
    }
}