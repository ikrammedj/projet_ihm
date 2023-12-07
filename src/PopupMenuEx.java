import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent;
import javax.swing.*;

public class PopupMenuEx extends JFrame {
  
	private JPopupMenu popupMenu;

	public PopupMenuEx(){
		createPopupMenu();
		setTitle("/PopupMenu");
		setSize(300, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		private void createPopupMenu() {
			popupMenu = new JPopupMenu();
			
			JMenuItem maximizeMenultem = new JMenuItem ("Maximize");
			
			maximizeMenultem.addActionListener((e) -> {
				
			if (getExtendedState() != JFrame.MAXIMIZED_BOTH) {
			
				setExtendedState(JFrame.MAXIMIZED_BOTH);
				maximizeMenultem.setEnabled (false);
				}
			});
	
			popupMenu.add (maximizeMenultem);
			JMenuItem quitMenultem = new JMenuItem ("Quit");
			
			quitMenultem.addActionListener((e) -> System.exit(0));
			popupMenu.add (quitMenultem);
			addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
				if (getExtendedState() != JFrame.MAXIMIZED_BOTH)	
				{
				maximizeMenultem.setEnabled(true);
				
			}
				if (e.getButton() == MouseEvent.BUTTON3) 
				{
					popupMenu.show(e.getComponent(),e.getX(),e.getY());
					
				}
				
}
			});	
		}
				public static void main(String[] args) {
					PopupMenuEx ex = new PopupMenuEx();
					ex.setVisible(true);
			}
}
			