import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result=JOptionPane.showInputDialog("Nguyen Ngan Ha - 20225713- Please enter your name: ");
        JOptionPane.showMessageDialog(null , "Hi "+result+"!");
        System.exit(0);
    }
}