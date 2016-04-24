import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main extends JFrame {
  public static void main (String[] args) {
    setSize(300, 300); //Size of the frame, in pixels
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ensures that the frame collapses when you click the exit button

    final JTextArea textArea = new JTextArea(); //Creates new instance of a JTextArea
    textArea.setText("Click me to shoot!");
    
    textArea.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.NOBUTTON) {
          textArea.setText("No button clicked...");
        } else if (e.getButton() == MouseEvent.BUTTON1) {
          textArea.setText("Bullet Fired...");
          int Bullets = 200;
          Bullets--;
        } else if (e.getButton() == MouseEvent.BUTTON2) {
          textArea.setText("Button 2 clicked...");
        } else if (e.getButton() == MouseEvent.BUTTON3) {
          textArea.setText("Button 3 clicked...");
        }

        System.out.println("Number of click: " + e.getClickCount()); // Not really neccessary, but could be useful
        System.out.println("Click position (X, Y):  " + e.getX() + ", " + e.getY());
      }
    });

    getContentPane().add(textArea);
  }

  public static void main(String[] args) {
    new Main().setVisible(true);
  }
}
