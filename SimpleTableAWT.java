import java.awt.*;
import java.io.*;

public class SimpleTableAWT extends Frame {
public SimpleTableAWT() {
setTitle("Table Display");
setSize(400, 300);
setLayout(new GridLayout(0, 3)); // Assuming 3 columns

try (BufferedReader br = new BufferedReader(new FileReader("table.txt"))) {
String line;
while ((line = br.readLine()) != null) {
for (String item : line.split(",")) {
add(new Label(item.trim()));
}
}
} catch (Exception e) {
System.out.println("Error: " + e);
}
addWindowListener(new java.awt.event.WindowAdapter() {
public void windowClosing(java.awt.event.WindowEvent e) { dispose(); }
});
setVisible(true);
}

public static void main(String[] args) {
new SimpleTableAWT();
}
}
