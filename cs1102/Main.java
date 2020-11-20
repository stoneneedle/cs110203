import javax.swing.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("TitleLessJFrame");
    frame.getContentPane().add(new JLabel(" HEY!!!"));
    frame.setLayout(new FlowLayout());
    frame.setUndecorated(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    JButton taskButton = new JButton("TEST");
    taskButton.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
    //taskButton.setHorizontalAlignment(JButton.LEADING); // optional
    taskButton.setBorderPainted(false);
    taskButton.setContentAreaFilled(false);
    
    frame.getContentPane().add(taskButton);
    
    frame.setSize(400, 200);
    frame.setVisible(true);
  }
}