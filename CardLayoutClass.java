import java.awt.*;
import java.awt.event.*;
public class CardLayoutClass extends Frame
{
CardLayout cardLayout;
Panel cardPanel;

CardLayoutClass()
{
setTitle("Example");
setSize(400,200);
setLayout(new BorderLayout());

cardLayout = new CardLayout();
cardPanel = new Panel(cardLayout);

cardPanel.add("First",new Button("c1"));
cardPanel.add("Second",new Button("c2"));

add(cardPanel, BorderLayout.CENTER);

Button nb=new Button("Next");
add(nb, BorderLayout.SOUTH);

nb.addActionListener(e->cardLayout.next(cardPanel));

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});

setVisible(true);
}
public static void main(String[] args)
{
new CardLayoutClass();
}
}

