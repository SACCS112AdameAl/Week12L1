
import javax.swing.JOptionPane;

public class L1 {
	public static void main(String[]args)
	{
		int iDices, iBounces, iRoll = 0;
		iDices = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of dices: "));
		iBounces = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of bounces: "));
		Dice dice = new Dice();
		if (iBounces == 1)
			iRoll = dice. Throw(iDices, iRoll);
		else
				iRoll = dice. Throw(iDices, iBounces);
		JOptionPane.showMessageDialog(null,  iRoll);
	}
}
