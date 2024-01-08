package tk.mosqitotorpedo.mosword;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RandomnessOHGodThisIsGonnaSuck {
    private JPanel ContentRandom;
    private JButton doneButton;
    private JButton cancelButton;
    private ClickPanel clickPanel;

    private void createUIComponents() {

        clickPanel = new ClickPanel();

    }

    public static int hash;

    private final JFrame frame = new JFrame("Randomness Generator");

    public RandomnessOHGodThisIsGonnaSuck() {

        frame.setContentPane(ContentRandom);
        frame.setPreferredSize(new Dimension(500, 600));
        frame.setResizable(false);
        frame.setIconImage(ConfigureWindow.icon.getImage());

        doneButton.addActionListener(e -> calcRandomness());
        cancelButton.addActionListener(e -> frame.dispose());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }


    public void calcRandomness() {
        List<Point> points = clickPanel.getPoints();
        int tempHash = 109;

        for (Point p : points) {
            tempHash += 2_147_472_537 * p.x;
            tempHash += -2_145_423_287 * p.y;
        }

        hash = tempHash;

        JOptionPane.showMessageDialog(frame, "Randomness Saved!");
        frame.dispose();


    }


}
