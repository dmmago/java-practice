import javax.swing.*;

public class SampleSwing {
    private static JFrame frame ;
    private static ImageIcon image;
    private static JLabel label;
    public static void main(String[] args) {
        frame = new JFrame();
        image = new
        ImageIcon("test.jpg");
        label = new JLabel(image);

        frame.getContentPane().add(label);

        frame.getContentPane().setLayout(null);
        label.setBounds(0, 0, 640, 480);

        frame.setTitle("SampleSwing");
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);    
    }
}
