import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;


//VS4E -- DO NOT REMOVE THIS LINE!
public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton jButton0;
	private JScrollBar jScrollBar0;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
	public Home() {
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setForeground(Color.black);
		setLayout(new GroupLayout());
		add(getJButton0(), new Constraints(new Leading(108, 10, 10), new Leading(161, 10, 10)));
		add(getJScrollBar0(), new Constraints(new Leading(252, 10, 10), new Leading(14, 161, 10, 10)));
		setSize(304, 202);
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("jButton0");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JScrollBar getJScrollBar0() {
		if (jScrollBar0 == null) {
			jScrollBar0 = new JScrollBar();
		}
		return jScrollBar0;
	}

	private void jButton0MouseMouseClicked(MouseEvent event) {
		
	}

}
