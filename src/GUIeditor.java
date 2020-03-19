import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class GUIeditor {

    private JTextArea textArea1;
    private JPanel panel1;


    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIeditor");
        frame.setContentPane(new GUIeditor().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JMenuBar MenuBar = new JMenuBar();
        frame.setJMenuBar(MenuBar);

        JMenu file = new JMenu ("Menu");
        MenuBar.add(file);

        JMenuItem open = new JMenuItem("Open File");
        file.add(open);

        JMenuItem save = new JMenuItem("Save");
        file.add(save);

        frame.pack();
        frame.setVisible(true);
    }
}