/* import javax.swing.*;

public class welcome {
    public static void main(String[] args){
	JFrame frame = new JFrame();
	JOptionPane.showMessageDialog(frame, "�Hola!");
    }
} */

import java.util.*;
import javax.swing.*;

public class welcome {
    public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Teclea un n�mero: ");
	double num = keyboard.nextInt();
	System.out.println("El n�mero es: "+num);
	JFrame frame = new JFrame();
	JOptionPane.showMessageDialog(frame, "�Hola!");
    }
}