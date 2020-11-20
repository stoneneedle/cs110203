import java.awt.Color;
import java.awt.Graphics;
/*w w w .  j a  v a 2 s .  com*/
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main2 extends JFrame {

  Main2() {
    getRootPane().setGlassPane(new JComponent() {
      public void paintComponent(Graphics g) {
        g.setColor(new Color(0, 0, 0, 100));
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
      }
    });
    JButton popDialog = new JButton("Block Frame");
    popDialog.addActionListener(e -> {
      getRootPane().getGlassPane().setVisible(true);
      JOptionPane.showMessageDialog(Main2.this, "Shady!");
      getRootPane().getGlassPane().setVisible(false);
    });
    setContentPane(popDialog);
    pack();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setSize(350, 180);
  }

  public static void main(String[] args) {
    new Main2().setVisible(true);
  }
}