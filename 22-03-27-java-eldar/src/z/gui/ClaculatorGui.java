package z.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClaculatorGui {

	private JFrame fr = new JFrame("Calculator");
	private Calculator calculator = new Calculator();
	private JTextField tfA = new JTextField();
	private JTextField tfB = new JTextField();
	private JLabel lbA = new JLabel("a");
	private JLabel lbB = new JLabel("b");
	private JLabel lbRes = new JLabel("0.0");

	public static void main(String[] args) {
		ClaculatorGui gui = new ClaculatorGui();
		gui.createAndShowGui();

	}

	public void createAndShowGui() {
		fr.setBounds(100, 100, 500, 300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);

		// input
		lbA.setBounds(20, 10, 100, 25);
		fr.add(lbA);

		tfA.setBounds(100, 10, 100, 25);
		fr.add(tfA);

		lbB.setBounds(20, 40, 100, 25);
		fr.add(lbB);

		tfB.setBounds(100, 40, 100, 25);
		fr.add(tfB);

		// buttons
		JButton btAdd = new JButton("+");
		btAdd.setBounds(20, 70, 50, 50);
		btAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(tfA.getText());
				double b = Double.parseDouble(tfB.getText());
				double res = calculator.add(a, b);
				lbRes.setText(String.valueOf(res));

			}
		});
		fr.add(btAdd);

		JButton btSub = new JButton("-");
		btSub.setBounds(90, 70, 50, 50);
		btSub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(tfA.getText());
				double b = Double.parseDouble(tfB.getText());
				double res = calculator.sub(a, b);
				lbRes.setText(String.valueOf(res));

			}
		});
		fr.add(btSub);

		JButton btMul = new JButton("x");
		btMul.setBounds(160, 70, 50, 50);
		fr.add(btMul);

		JButton btDiv = new JButton(":");
		btDiv.setBounds(230, 70, 50, 50);
		fr.add(btDiv);

		// result
		lbRes.setBounds(20, 100, 30, 300);
		fr.add(lbRes);

		fr.setVisible(true);
	}

}
