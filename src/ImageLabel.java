import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Box;


public class ImageLabel {

	private JFrame frmImagelabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageLabel window = new ImageLabel();
					window.frmImagelabel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ImageLabel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmImagelabel = new JFrame();
		frmImagelabel.setTitle("ImageLabel");
		frmImagelabel.setBounds(100, 100, 805, 457);
		frmImagelabel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmImagelabel.getContentPane().setLayout(null);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(56, 34, 656, 355);
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setIcon(new ImageIcon(ImageLabel.class.getResource("logo.png")));
		frmImagelabel.getContentPane().add(lblImage);
	}
}
