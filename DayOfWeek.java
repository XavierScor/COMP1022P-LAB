import javax.swing.JOptionPane;

public class DayOfWeek
{
	public static void main(String[] args)
	{
		int day, month, year;
		int y, x, m, d;
		
		String userInput = JOptionPane.showInputDialog(null, "Enter day", "Input", JOptionPane.QUESTION_MESSAGE);
		day = Integer.parseInt(userInput);
		userInput = JOptionPane.showInputDialog(null, "Enter month", "Input", JOptionPane.QUESTION_MESSAGE);
		month = Integer.parseInt(userInput);
		userInput = JOptionPane.showInputDialog(null, "Enter year", "Input", JOptionPane.QUESTION_MESSAGE);
		year = Integer.parseInt(userInput);
		
		y = year - (14 - month) / 12;
		x = y + y / 4 - y / 100 + y / 400;
		m = month + 12 * ((14 - month ) / 12) - 2;
		d = (day + x + (31 * m) / 12) % 7;
		
		JOptionPane.showMessageDialog(null, "The day of week is " + d, "Message", JOptionPane.INFORMATION_MESSAGE);
	}

}
