import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class DecryptionWindow {

	public static void main(String[] args) {
		showwindow();

	}
	public static void showwindow()
	{
		JFrame window = new JFrame ("Decryption Box");
		window.getContentPane().setBackground(new Color(240, 248, 255));
		window.setBackground(new Color(240, 248, 255));
				
				window.setBounds(100, 100, 718, 324);
				window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				window.getContentPane().setLayout(null);
				
				JLabel TextLabel = new JLabel("Nh\u00E2\u0323p Text");
				TextLabel.setForeground(new Color(255, 0, 255));
				TextLabel.setFont(new Font("Cambria", Font.BOLD, 18));
				TextLabel.setBounds(12, 53, 96, 27);
				window.getContentPane().add(TextLabel);
				
				JTextArea Text1 = new JTextArea();
				Text1.setBackground(new Color(255, 235, 205));
				Text1.setForeground(new Color(184, 134, 11));
				Text1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				Text1.setLineWrap(true);
				Text1.setBounds(12, 80, 286, 170);
				window.getContentPane().add(Text1);
				
				JLabel lblGiaiMa = new JLabel("GIA\u0309I MA\u0303");
				lblGiaiMa.setForeground(new Color(255, 0, 0));
				lblGiaiMa.setFont(new Font("Cambria", Font.BOLD, 20));
				lblGiaiMa.setBounds(310, 13, 77, 27);
				window.getContentPane().add(lblGiaiMa);
				
				JTextArea Text2 = new JTextArea();
				Text2.setEditable(false);
				Text2.setLineWrap(true);
				Text2.setForeground(new Color(184, 134, 11));
				Text2.setFont(new Font("Tahoma", Font.PLAIN, 15));
				Text2.setBackground(new Color(255, 235, 205));
				Text2.setBounds(399, 80, 286, 170);
				window.getContentPane().add(Text2);
				
				JLabel DecryptedText = new JLabel("Text \u0111a\u0303 gia\u0309i ma\u0303");
				DecryptedText.setForeground(Color.MAGENTA);
				DecryptedText.setFont(new Font("Cambria", Font.BOLD, 18));
				DecryptedText.setBounds(399, 53, 136, 27);
				window.getContentPane().add(DecryptedText);
				
				JButton DeBtn = new JButton("De");
				DeBtn.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\Change3.png"));
				DeBtn.setForeground(new Color(255, 0, 0));
				DeBtn.setFont(new Font("Cambria", Font.PLAIN, 14));
				DeBtn.setBounds(310, 125, 77, 44);
				DeBtn.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						try 
						{
							String ques = Text1.getText();
        					String[] word = ques.split("\\s");
        					String ans = "";
        					for (String st : word) 
        					{
            					String add = "";
            					int index = -1;
            					String res = "";
            					for(int i=0;i<st.length();i++)
           						{
                					if((int)st.charAt(i)>=48 && (int)st.charAt(i)<=57)
                					{
                    					add = add + st.charAt(i);
                    					index++;
                					}
            					}
            					int converToInt = Integer.parseInt(add);
            					char convertToChar = (char)converToInt;
            					res = res + convertToChar; 
            					for(int i= index+1;i<st.length();i++)
            					{
                					if(i==index+1)
                					{
                    					res = res + st.charAt(st.length()-1);
                					}
                					else if(i== st.length()-1)
                					{
                    					res = res + st.charAt(index+1);
                					}
                					else
                					{
                   				 		res = res + st.charAt(i);
                					}
            					}
            					if(ans=="")
            					{
                					ans = ans + res;
            					}
            					else
            					{
               	 					ans = ans + " " + res;
								}
								Text2.setText(ans);  
        }
						} catch (Exception e1) {
							//TODO: handle exception
						}
					}
				});
				window.getContentPane().add(DeBtn);
				window.setLocationRelativeTo(null);
				
				window.setVisible(true);
	}

}
