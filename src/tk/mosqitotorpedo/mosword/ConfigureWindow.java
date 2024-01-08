package tk.mosqitotorpedo.mosword;


import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ConfigureWindow {
    private JPanel ContentConfigure;
    private JButton charactersButton;
    private JButton randomnessButton;
    private JButton clearConfigButton;
    private JButton saveConfigButton;
    private final JFrame frame = new JFrame("Configure MosWord");

    private static final String iconImagePath = "/mosword_logo.png";
    public static ImageIcon icon = new ImageIcon(Objects.requireNonNull(Main.class.getResource(iconImagePath)));


    public ConfigureWindow() {
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setContentPane(ContentConfigure);
        frame.setIconImage(icon.getImage());


        charactersButton.addActionListener(e -> new CharWindow());
        randomnessButton.addActionListener(e -> new RandomnessOHGodThisIsGonnaSuck());
        saveConfigButton.addActionListener(e -> saveConfig());
        clearConfigButton.addActionListener(e -> clearConfig());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


    public void saveConfig() {
        JOptionPane.showMessageDialog(frame, "Config Saved!");
        System.out.println("The save config button doesn't actually do anything.\nI put the save feature in at the end lol");
        frame.dispose();
    }

    public void clearConfig() {
        JOptionPane.showMessageDialog(frame, "Cleared the config!");
        System.out.println("Again, this button does nothing except say it does something. Yippee!");
    }
}
