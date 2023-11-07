package una;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BMImdfd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String Firstname = JOptionPane.showInputDialog("First name:");
		String Lastname = JOptionPane.showInputDialog("Last name:");
		
		String Age1 = JOptionPane.showInputDialog("Age:");
		double A = Double.parseDouble(Age1);

		String Weight = JOptionPane.showInputDialog("Weight (kgs):");
		double W = Double.parseDouble(Weight);
		String Height = JOptionPane.showInputDialog("Height (cm):");
		double H = Double.parseDouble(Height);

		double BMI = W/(H*H);
		
        String classification = getBMIClassification(BMI);

               writeBMItoFile(BMI, classification);

        System.out.println("BMI: " + BMI);
        System.out.println("Classification: " + classification);
        System.out.println("BMI result has been saved to 'C:\\Users\\Kinnie\\Documents\\JAVAWorkspace\\una\\src\\una.");

        scanner.close();
    }

    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static String getBMIClassification(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal Weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void writeBMItoFile(double bmi, String classification) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Kinnie\\Documents\\JAVAWorkspace\\una\\src\\una");
            writer.write("BMI: " + bmi + "String.format(\"%.2f\",BMI)");
            writer.write("Classification: " + classification);
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}


