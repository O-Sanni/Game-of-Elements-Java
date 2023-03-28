import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class WelcomeJLabel extends JLabel {

    WelcomeJLabel(){
        ImageIcon jLabelImage = new ImageIcon("E:\\Java Project\\Rock Paper Scizors\\src\\jLabelImage.png");
        Border border = BorderFactory.createLineBorder(new Color(0x4200B3), 3); //create border of specific color and width
        //          JLabel => a GUI display area for a string of text, an image, or both
//        JLabel label = new JLabel(); // create a Label
        this.setText("Welcome to Game of Elements"); // set text of label , also can use can use the constructor to set text of label
        this.setIcon(jLabelImage); //setting up the jLabelIcon
        this.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of labelIcon
        this.setVerticalTextPosition(JLabel.CENTER); //set text TOP, CENTER< BOTTOM of labelIcon
        this.setForeground(new Color(0x4200B3));// set the color of the label text
        this.setFont(new Font("Garamond", Font.BOLD, 35)); // set the font of the label text
        //label.setIconTextGap()=> set gap of text to image
        // label.setBackground() => set background color of label
        // label.setOpaque(true) => display label background color
        this.setBorder(border);
        this.setVerticalAlignment(JLabel.TOP); // set vertical position of  icon and  text within label
        this.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon and  text within label
        this.setBounds(15,15,500,100);// moves and resize label component inside the frame
    }

}
