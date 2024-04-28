import java.util.List;

public class BarDiagram implements DiagramStrategy {
    @Override
    public void displayDiagram(List<String> tableData) {
        System.out.println("Displaying Bar Diagram:");
        for (String data : tableData) {
            System.out.println(data);
        }
    }
}