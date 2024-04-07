import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = List.of("15", "35", "50"); // Example numerical data
        DiagramDisplay diagramDisplay = new DiagramDisplay(data, "bar");
        diagramDisplay.displayDiagram();
    }
}
