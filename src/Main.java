import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JLabel countLabel;
    private JTextArea textArea;
    private JButton countWords;
    private JPanel MainPanel;
    private int count = 0;
    public Main() {
        setContentPane(MainPanel);
        setTitle("Word Count");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 400);

        // Set minimum size for the Main frame
        setMinimumSize(new Dimension(300, 200));

        // Ensure resizable property is true
        setResizable(true);
        setVisible(true);
        countLabel.setText("Words: " + count);

        countWords.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = textArea.getText();
                String[] words = txt.split("\\s+"); // Split the text into words using whitespace as a delimiter
                count = words.length;

                // Update the word count and label
                countLabel.setText("Words: " + count);
                System.out.println("Word count: " + count);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}