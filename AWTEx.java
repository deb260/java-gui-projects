import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AWTEx extends JFrame implements ActionListener{
JTextField num1, num2, result;
JButton divide;

public AWTEx(){
setTitle("Example");
setVisible(true);
setLayout(new GridLayout(4,2,5,5));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

add(new JLabel("Num 1:"));
num1=new JTextField();
add(num1);

add(new JLabel("Num 2:"));
num2=new JTextField();
add(num2);


add(new JLabel("Result:"));
result=new JTextField();
result.setEditable(false);
add(result);


divide=new JButton("Divide");
divide.addActionListener(this);
add(divide);
}

public void actionPerformed(ActionEvent e){

try{
int a=Integer.parseInt(num1.getText());
int b=Integer.parseInt(num2.getText());
result.setText(String.valueOf(a/b));
}
catch(NumberFormatException ex){
JOptionPane.showMessageDialog(this,"Enter valid numbers");
}
catch(ArithmeticException ex){
JOptionPane.showMessageDialog(this,"Cannot divide by zero!");
}
}

public static void main(String[] args){
new AWTEx();
}
}




