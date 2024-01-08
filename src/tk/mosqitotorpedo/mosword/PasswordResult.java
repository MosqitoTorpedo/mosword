package tk.mosqitotorpedo.mosword;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class PasswordResult {
    private JPanel ContentPassword;
    private JTextField passField;
    private JButton copyButton;
    private JButton okButton;

    private final JFrame frame = new JFrame("Password");

    public PasswordResult(String password) {
        frame.setContentPane(ContentPassword);
        frame.setIconImage(ConfigureWindow.icon.getImage());

        passField.setText(password);
        copyButton.addActionListener(e -> copyPassword(password));
        okButton.addActionListener(e -> frame.dispose());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public void copyPassword(String password) {
        StringSelection copyPass = new StringSelection(password);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        clipboard.setContents(copyPass, null);

        JOptionPane.showMessageDialog(frame, "Password copied!");
        System.out.println("Password copied to clipboard!");
    }

}
