import javax.swing.JFrame;

public class SnakeGame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Snake Game");

        GamePanel gamePanel = new GamePanel();
        
        frame.add(gamePanel);

        // Set window size
        frame.setSize(1200, 800);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);

       
        frame.setVisible(true);
    }
}
