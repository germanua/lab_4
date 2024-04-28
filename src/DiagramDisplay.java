import java.util.List;

public class DiagramDisplay {
    private List<String> tableData;
    private DiagramStrategy diagramStrategy;

    public DiagramDisplay(List<String> tableData, DiagramStrategy diagramStrategy) {
        this.tableData = tableData;
        this.diagramStrategy = diagramStrategy;
    }

    public void setDiagramStrategy(DiagramStrategy diagramStrategy) {
        this.diagramStrategy = diagramStrategy;
    }

    public void displayDiagram() {
        diagramStrategy.displayDiagram(tableData);
    }
}