import javax.swing.*;

public class Main {
    public static void main(String[] a){
        JFrame frame = new JFrame();
        Login loginPanel = new Login();
        frame.setContentPane(loginPanel.getMainPanel());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
