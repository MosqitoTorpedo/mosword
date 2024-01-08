package tk.mosqitotorpedo.mosword;

import javax.swing.*;

public class CharWindow {
    private JPanel ContentChar;
    private JSpinner spinner1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JButton saveButton;
    private JButton cancelButton;

    public static int charCount = -26;
    public static boolean letterCase;
    public static boolean specChar;

    private final JFrame frame = new JFrame("Characters");

    public CharWindow() {
        frame.setContentPane(ContentChar);
        frame.setIconImage(ConfigureWindow.icon.getImage());

        saveButton.addActionListener(e -> submitCharConf());
        cancelButton.addActionListener(e -> frame.dispose());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void submitCharConf() {
        charCount = (int) spinner1.getValue();
        letterCase = checkBox1.isSelected();
        specChar = checkBox2.isSelected();
        JOptionPane.showMessageDialog(frame,
                "Character configuration saved!",
                "Characters Saved",
                JOptionPane.PLAIN_MESSAGE);
        frame.dispose();
    }


}
