package tk.mosqitotorpedo.mosword;

import javax.swing.*;
import java.awt.*;

public class MainGUI {
    private JPanel ContentRoot;
    private JButton generateButton;
    private JButton configureButton;
    private final JFrame frame = new JFrame("MosWord");

    public static String password;

    int aLargeNumber = 47930856;

    public MainGUI() {

        frame.setPreferredSize(new Dimension(600, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(ContentRoot);
        frame.setIconImage(ConfigureWindow.icon.getImage());

        configureButton.addActionListener(e -> new ConfigureWindow());
        generateButton.addActionListener(e -> genPass());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void genPass() {

        if (CharWindow.charCount == -26) {
            JOptionPane.showMessageDialog(frame, "Please specify the character config first");
        }


        double index = Math.PI / 14;

        char[] difChars;

        if (CharWindow.letterCase && CharWindow.specChar)
            difChars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                    'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                    '?', '!', '$', '%', '@', '#', '&', '(', ')', '{', '}', '[', ']', '\\', ':', ';', '/', '|'};
        else if (!CharWindow.letterCase && CharWindow.specChar)
            difChars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                    '?', '!', '$', '%', '@', '#', '&', '(', ')', '{', '}', '[', ']', '\\', ':', ';', '/', '|'};
        else if (CharWindow.letterCase) difChars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        else
            difChars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                    'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < CharWindow.charCount; i++) {

            int a = (RandomnessOHGodThisIsGonnaSuck.hash + i * aLargeNumber) * (int) (index * Integer.MAX_VALUE);
            int c = (int) (((double) Math.abs(a) / Integer.MAX_VALUE) * difChars.length);
            stringBuilder.append(difChars[c]);


        }
        password = String.valueOf(stringBuilder);

        if (CharWindow.charCount != -26) {
            System.out.println("The new password is: " + password);
            new PasswordResult(password);
        }
    }
}
