import javax.swing.JOptionPane;

public class TelcoPrefix {
    public static void main(String[] args) {

        String phoneNumber;
        String result, prefix;

        phoneNumber = (JOptionPane.showInputDialog(null, "Input your phone number:"));

        String phoneNumberStr = String.valueOf(phoneNumber);

        if (phoneNumberStr.length() == 11) {
            prefix = phoneNumberStr.substring(0, 4);

            switch (prefix) {
                case "0908":
                case "0918":
                case "0919":
                case "0920":
                case "0921":
                case "0928":
                case "0929":
                case "0947":
                case "0949":
                case "0951":
                case "0961":
                case "0998":
                case "0999":
                    result = "Smart";
                    break;
                case "0817":
                    result = "Globe";
                    break;
                case "0905":
                case "0906":
                case "0915":
                case "0916":
                case "0917":
                case "0926":
                case "0935":
                case "0936":
                case "0937":
                case "0945":
                case "0954":
                case "0955":
                case "0975":
                case "0977":
                case "0978":
                case "0979":
                case "0995":
                case "0996":
                case "0997":
                    result = "Globe/TM";
                    break;
                case "0907":
                case "0909":
                case "0910":
                case "0912":
                case "0930":
                case "0938":
                case "0946":
                case "0948":
                case "0950":
                    result = "TNT";
                    break;
                case "0922":
                case "0923":
                case "0924":
                case "0925":
                case "0931":
                case "0932":
                case "0933":
                case "0934":
                case "0940":
                case "0941":
                case "0942":
                case "0943":
                case "0973":
                case "0974":
                    result = "Sun";
                    break;
                default:
                    result = "Invalid";
                    break;
            }
        } else {
            result = "Invalid";
        }

        JOptionPane.showMessageDialog(null, "Your number: " + phoneNumber + "\nSimCard Telco: " + result);
    }
}
