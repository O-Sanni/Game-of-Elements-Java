import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {
        public static void main(String... args){

            //There are 2 ways to create frames this way:
/*            JFrame frame = new JFrame(); // creates a frame
            frame.setTitle("Game of Elements"); // sets the title of frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application when press X on frame
            frame.setSize(860,860); // sets the x-dimension, and y-dimension of frame
            frame.setVisible(true); //make frame visible, should always add it in order to have a frame visible
            frame.setResizable(false);// prevent the frame from resizing
            ImageIcon logoImage = new ImageIcon("E:\\Java Project\\Rock Paper Scizors\\src\\logo.png"); //create an ImageIcon relative path did not work, I use absolute path
            frame.setIconImage(logoImage.getImage()); // change icon of the frame on the top left corner
            frame.getContentPane().setBackground(Color.CYAN);// change color of background of frame (Color.CYAN colors already availiable in Java)
            frame.getContentPane().setBackground(new Color(253,255, 223)); // create my own color, can also use hexidecimal value
*/
            // Or create a class which will extends JFrame
            MainFrame mainFrame = new MainFrame();// if  plan only call mainframe once  dont need to create reference  new MainFrame() is enough
            WelcomeJLabel welcomeJLabel = new WelcomeJLabel();
            JPanelComponent jPanelComponent = new JPanelComponent();
            mainFrame.add(welcomeJLabel); // adding label to frame
            mainFrame.pack();// resize the frame to fit all elements in frame
//            mainFrame.setLayout(null); //set layoutManager
//            mainFrame.setVisible(true);// in order to see label after you create a frame and add a label, you need to set frame visability to true or:
            mainFrame.revalidate(); // use revalidate



        }
    }
