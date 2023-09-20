import javax.swing.*;

public class forLoop {
    public static void main (String[]args) {

        int start, end;

        int divisiblebyBoth = 0;
        int divisiblebyTwo = 0;
        int divisiblebyThree = 0;
        int notdivisibleByboth = 0;

        start = Integer.parseInt(JOptionPane.showInputDialog(null, "Start:"));
        end = Integer.parseInt(JOptionPane.showInputDialog(null, "End:"));

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                divisiblebyBoth++;
            }
            else if (i % 3 == 0) {
                divisiblebyThree++;
            }
            else if (i % 2 == 0) {
                divisiblebyTwo++;
                }
            else {
                notdivisibleByboth++;
            }

            JOptionPane.showMessageDialog(null, "Divisible by 2 and 3: " + divisiblebyBoth +
                    "\nDivisible by 3:" + divisiblebyThree + "\nDivisible by 2: " + divisiblebyTwo +
                    "\nNot Divisible by 2 and 3: " + notdivisibleByboth
            );

            }
        }
        }
