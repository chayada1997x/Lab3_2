import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textUserlogin;
    private JPasswordField pwUserPassword;
    private JButton submitButton;
    private JButton clearButton;
    private JPanel MainPanel;

    public Login() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textUserlogin.getText()
                        + " " + new String(pwUserPassword.getPassword()));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUserlogin.setText("");
                pwUserPassword.setText("");
                
            }
        });
    }

    public JPanel getMainPanel(){
        return MainPanel;
    }
}
