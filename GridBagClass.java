import java.awt.*;
import java.awt.event.*;
public class GridBagClass extends Frame
{
GridBagClass(){
setTitle("GridBag Layout");
setLayout(new GridBagLayout());

GridBagConstraints gbc=new GridBagConstraints();

gbc.gridx=0;
gbc.gridy=0;
add(new Button("A"), gbc);

gbc.gridx=1;
gbc.gridy=0;
add(new Button("B"), gbc);

gbc.gridx=0;
gbc.gridy=1;
add(new Button("C"), gbc);


gbc.gridx=0;
gbc.gridy=2;
gbc.gridwidth=2;
add(new Button("Wide Button"), gbc);



setVisible(true);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}
public static void main(String[] args)
{
new GridBagClass();
}
}

