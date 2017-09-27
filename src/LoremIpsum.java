import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class LoremIpsum {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoremIpsum window = new LoremIpsum();
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
	public LoremIpsum() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea textArea = new JTextArea();
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Send it papo!");
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		btnNewButton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				btnNewButtonActionPerformed(evt);
			}

			private void btnNewButtonActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				String text = textArea.getText();
				sumSomePrimes(text);
			}
		});
		
		
	}
	
	public static void loremIpsum(String text)
	{
		text = text.replace(".","1");
		text = text.replace(",", "1");
		text = text.replace(";", "1");
		text = text.replace(" ", "1");
		text = text.replace("11", "1");
		text = text.trim();
		//text = text.replace(" ", ",");
		//System.out.println(text);
		String[] words = text.split("1");
		int i,j,count;
		for(i = 0; i < words.length; i++)
		{
			words[i] = words[i].trim();
			count=0;
			for(j = 0; j < words.length; j++)
			{
				if(words[i].equalsIgnoreCase(words[j]))
				{
					count +=1;
				}
			}
				if(count == 1)
				{	System.out.println("La palabra que no se repite es: " + words[i]);
				}

		}
	}
	
	public static void sumSomePrimes(String text)
	{
		Long sum=0L;
		String primes [] = text.split(" ");
		List<String> pwws = new ArrayList<>(); 
		for (int i = 0; i < primes.length; i++) {
			primes[i] = primes[i].trim();
			
			if(!primes[i].isEmpty())
				pwws.add(primes[i]);
		}
		
		for (int i = 999950; i < pwws.size(); i++) {
			sum += Integer.parseInt(pwws.get(i));
			System.out.println("Position " + i +" is: " + Integer.parseInt(pwws.get(i)));
			System.out.println("Suma es " + sum);
		}
		

		
	}

}
