package una;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Billing2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel nameLabel, addressLabel, unitsLabel, costLabel, totalCostLabel;
    private JTextField nameField, addressField, unitsField;
    private JButton calculateButton;
	
	public Billing2() {
		setTitle("Water Billing Calculator");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        addressLabel = new JLabel("Address:");
        addressField = new JTextField(20);
        unitsLabel = new JLabel("Number of Units Used:");
        unitsField = new JTextField(20);
        costLabel = new JLabel("Cost per Unit:");
        totalCostLabel = new JLabel("Total Billing Cost:");

        calculateButton = new JButton("Calculate");
        
        add(nameLabel);
        add(nameField);
        add(addressLabel);
        add(addressField);
        add(unitsLabel);
        add(unitsField);
        add(costLabel);
        add(totalCostLabel);
        add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateBillingCost();
	}

		

	}) ;	

}

		private void calculateBillingCost() {
	        String name = nameField.getText();
	        String address = addressField.getText().toLowerCase();
	        int unitsUsed = Integer.parseInt(unitsField.getText());
	        double costPerUnit;
	        
	        switch (address) {
            case "maa":
                costPerUnit = 1.00;
                break;
            case "buhangin":
                costPerUnit = 0.75;
                break;
            case "toril":
                costPerUnit = 1.50;
                break;
            case "bankerohan":
                costPerUnit = 0.25;
                break;
            default:
                costPerUnit = 0.50;
                break;
        }
	        double billingCost = unitsUsed * costPerUnit;
	        costLabel.setText("Cost per Unit: " + costPerUnit);
	        totalCostLabel.setText("Total Billing Cost: " + billingCost);
		
		}
		
		public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                Billing calculator = new Billing();
	                calculator.setVisible(true);
	            }
	        });
	    }
	}
