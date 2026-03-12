import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener{

JRadioButton red, yellow, green;
JLabel message;
public TrafficLight(){

setSize(400,300);
setVisible(true);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

message=new JLabel("");
message.setFont(new Font("Arial",Font.BOLD,20));
add(message);

red=new JRadioButton("Red");
green=new JRadioButton("Green");
yellow=new JRadioButton("Yellow");


ButtonGroup bg=new ButtonGroup();
bg.add(red);
bg.add(green);
bg.add(yellow);

add(red);
add(green);
add(yellow);

red.addActionListener(this);
green.addActionListener(this);
yellow.addActionListener(this);
}

public void actionPerformed(ActionEvent e){

if(red.isSelected()){
message.setText("Stop");
message.setForeground(Color.RED);
}


else if(green.isSelected()){
message.setText("Go");
message.setForeground(Color.GREEN);
}


else if(yellow.isSelected()){
message.setText("wait");
message.setForeground(Color.YELLOW);
}
}

public static void main(String[] args){
new TrafficLight();
}}





