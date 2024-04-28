import java.util.List;

public class PieDiagram implements DiagramStrategy {
    @Override
    public void displayDiagram(List<String> tableData) {
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
