

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

               public class exer2_JFRAME {
	
            	   
            	   private JPanel contentPane;
            		private JTextField textField;
            		private JTextField textField_1;
            		private JButton btn1;

            		/**
            		 * Launch the application.
            		 * @param <Exercício2>
            		 */
            		public static <Exercício2> void main(String[] args) {
            			EventQueue.invokeLater(new Runnable() {
            				private Window frame;

							public void run() {
            					try {
            						
            						frame = null;
									((Window) frame).setVisible(true);
            					} catch (Exception e) {
            						e.printStackTrace();
            					}
            				}
            			});
            		}

            		/**
            		 * Create the frame.
            		 * @return 
            		 */
            		public void Exercício2() {
            			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            			setBounds(100, 100, 450, 300);
            			contentPane = new JPanel();
            			contentPane.setBackground(Color.DARK_GRAY);
            			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            			setContentPane(contentPane);
            			contentPane.setLayout(null);
            			
            			JLabel lblNewLabel = new JLabel("A:");
            			lblNewLabel.setBounds(36, 42, 46, 14);
            			contentPane.add(lblNewLabel);
            			
            			textField = new JTextField();
            			textField.setBounds(57, 39, 86, 20);
            			contentPane.add(textField);
            			textField.setColumns(10);
            			
            			JLabel lblB = new JLabel("B:");
            			lblB.setBounds(34, 84, 25, 14);
            			contentPane.add(lblB);
            			
            			textField_1 = new JTextField();
            			textField_1.setColumns(10);
            			textField_1.setBounds(57, 81, 86, 20);
            			contentPane.add(textField_1);
            			
            			btn1 = new JButton("Mostrar N\u00FAmeros");
            			btn1.setBounds(81, 155, 159, 23);
            			contentPane.add(btn1);
            			btn1.addActionListener(new ActionListener() {
            				
            				@Override
            				public void actionPerformed(ActionEvent e) {
            			int X= Integer.parseInt(textField.getText());
            			int y=Integer.parseInt(textField_1.getText());
            			do {
            				JOptionPane.showMessageDialog(contentPane, ""+X);
            				X++;
            			
            			}while (X<=y);
            					
            				}
            			});
            		}

					private void setDefaultCloseOperation(int exitOnClose) {
						// TODO Auto-generated method stub
						
					}

					private void setBounds(int i, int j, int k, int l) {
						// TODO Auto-generated method stub
						
					}

					private void setContentPane(JPanel contentPane2) {
						// TODO Auto-generated method stub
						
					}
            	}
	
	
	
	


