import javax.swing.*;
import java.awt.*;

public class MenuDem extends JFrame {

    JMenu normalMenu, radioMenu, checkMenu;
    JMenuItem new1, open;
    JRadioButtonMenuItem radio1, radio2;
    JCheckBoxMenuItem check1, check2;
    JMenuBar mainMenu;
    Container contentPane;
    ButtonGroup group;

    MenuDem() {
        super("JMenu Demo");

        normalMenu = new JMenu("Normal Menu");
        radioMenu = new JMenu("Radio Menu");
        checkMenu = new JMenu("Check Menu");

        new1 = new JMenuItem("New...");
        open = new JMenuItem("Open...");
        open.setMnemonic('O'); 
        
        normalMenu.add(new1);
        normalMenu.add(new JSeparator());
        normalMenu.add(open); 

        radio1 = new JRadioButtonMenuItem("First Radio Option");
        radio2 = new JRadioButtonMenuItem("Second Radio Option");
        group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        radioMenu.add(radio1);
        radioMenu.add(radio2);

        check1 = new JCheckBoxMenuItem("First Check Option");
        check2 = new JCheckBoxMenuItem("Second Check Option");

        checkMenu.add(check1);
        checkMenu.add(check2);

        mainMenu = new JMenuBar();
        mainMenu.add(normalMenu);
        mainMenu.add(radioMenu);
        mainMenu.add(checkMenu);

        contentPane = getContentPane();
        contentPane.add(mainMenu, BorderLayout.NORTH);

        setSize(400, 275);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MenuDem();
        });
    }
}
