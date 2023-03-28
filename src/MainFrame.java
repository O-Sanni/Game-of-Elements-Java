import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
//another way to create frame:
    MainFrame(){
        this.setTitle("Game of Elements");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(860,860);
        this.setVisible(true);
        this.setResizable(true);
        ImageIcon logoImage = new ImageIcon("E:\\Java Project\\Rock Paper Scizors\\src\\logo.png");
        this.setIconImage(logoImage.getImage());
        this.getContentPane().setBackground(new Color(253,255, 223));


    }
  }
