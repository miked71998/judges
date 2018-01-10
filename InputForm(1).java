import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class InputForm {
	
	public String[] strs;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputForm window = new InputForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InputForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 100, 1160, 1522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.BOLD, 30));
		textArea.setBounds(22, 24, 1110, 618);
		frame.getContentPane().add(textArea);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String keimeno = textArea.getText();
				strs = keimeno.split("[., \\!\\ ; \\s ]");
		        System.out.println("Substrings length:"+strs.length);
		        for (int i=0; i < strs.length; i++) {
		       
		            System.out.println("Str["+i+"]:"+strs[i]);
		        	
		        }
			}
		});
		btnPrint.setBounds(463, 699, 155, 37);
		frame.getContentPane().add(btnPrint);
	}
}
