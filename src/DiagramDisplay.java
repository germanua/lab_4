import java.util.List;

public class DiagramDisplay {
    private List<String> tableData;
    private String diagramType;

    public DiagramDisplay(List<String> tableData, String diagramType) {
        this.tableData = tableData;
        this.diagramType = diagramType;
    }

    public void setDiagramType(String diagramType) {
        this.diagramType = diagramType;
    }

    public void displayDiagram() {
        switch (diagramType) {
            case "bar":
                displayBarDiagram();
                break;
            case "pie":
                displayPieDiagram();
                break;
            default:
                System.out.println("Invalid diagram type.");
        }
    }

    private void displayBarDiagram() {
        System.out.println("Displaying Bar Diagram:");
        for (String data : tableData) {
            System.out.println(data);
        }
    }

    private void displayPieDiagram() {
        System.out.println("Displaying Pie Diagram:");
        int total = 0;
        for (String data : tableData) {
            try {
                total += Integer.parseInt(data);
            } catch (NumberFormatException e) {
                System.out.println("Invalid data format. Please provide numerical data for pie chart.");
                return;
            }
        }
        for (String data : tableData) {
            try {
                int value = Integer.parseInt(data);
                double percentage = (double) value / total * 100;
                System.out.printf("%s : %.1f%%\n", data, percentage);
            } catch (NumberFormatException e) {
                // Skip non-numeric data
            }
        }
    }
}
