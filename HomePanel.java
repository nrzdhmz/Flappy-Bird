import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JPanel {
    private JFrame frame;

    public HomePanel(JFrame frame) {
        this.frame = frame;
        setLayout(new BorderLayout());

        JButton game1Button = new JButton("Game 1 (Flappy Bird)");
        game1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchToFlappyBird();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(game1Button);

        add(buttonPanel, BorderLayout.CENTER);
    }

    private void switchToFlappyBird() {
        FlappyBird flappyBird = new FlappyBird();
        frame.getContentPane().removeAll();
        frame.add(flappyBird);
        frame.revalidate();
        frame.repaint();
        flappyBird.requestFocus();
    }
}
