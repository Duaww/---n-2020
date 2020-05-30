import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AboutUsWindow {

	public static void main(String[] args) {
		showwindow();

	}
	public static void showwindow ()
	{
		JFrame window = new JFrame ("");
		window.setBackground(new Color(240, 248, 255));
				
				window.setBounds(100, 100, 420, 200);
				window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				window.getContentPane().setLayout(null);
				
				JTextArea Text = new JTextArea();
				Text.setBackground(new Color(240, 248, 255));
				Text.setFont(new Font("Tahoma", Font.PLAIN, 16));
				Text.setLineWrap(true);
				Text.setText("Cha\u0300o m\u01B0\u0300ng \u0111\u00EA\u0301n v\u01A1\u0301i Ph\u00E2\u0300n m\u00EA\u0300m Ma\u0303 ho\u0301a va\u0300 Gia\u0309i ma\u0303. Chu\u0301ng t\u00F4i la\u0300 Team 3 g\u00F4\u0300m 2 tha\u0300nh vi\u00EAn: Tr\u00E2\u0300n Vi\u0303nh \u0110a\u0323t va\u0300 Nguy\u00EA\u0303n Thanh Ti\u0301nh. Ph\u00E2\u0300n m\u00EA\u0300m na\u0300y n\u0103\u0300m trong \u0110\u00F4\u0300 A\u0301n L\u00E2\u0323p Tri\u0300nh \u01AF\u0301ng Du\u0323ng Ho\u0323c ki\u0300 na\u0300y cu\u0309a chu\u0301ng t\u00F4i. Du\u0300 ch\u01B0a th\u01B0\u0323c s\u01B0\u0323 hoa\u0300n thi\u00EA\u0323n nh\u01B0ng mong ba\u0323n se\u0303 t\u00E2\u0323n h\u01B0\u01A1\u0309ng no\u0301!");
				Text.setBounds(12, 13, 380, 127);
				window.getContentPane().add(Text);
				window.setLocationRelativeTo(null);
				
				window.setVisible(true);
	}
}
