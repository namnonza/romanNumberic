public class Count {
    public String romanNumberic(int i) {
        if (i >= 5000 || i <= 0) {
            return "value out of bound";
        }
        String ans = "";
        while (i >= 1000) {
            ans += "M";
            i -= 1000;
        }
        if (i >= 500) {
            ans += "D";
            i -= 500;
        }
        while (i >= 100) {
            ans += "C";
            i -= 100;
        }
        ans = ans.replace("DCCCC", "CM");
        ans = ans.replace("CCCC", "CD");
        if (i >= 50) {
            ans += "L";
            i -= 50;
        }
        while (i >= 10) {
            ans += "X";
            i -= 10;
        }
        ans = ans.replace("LXXXX", "XC");
        ans = ans.replace("XXXX", "XL");
        if (i>=5) {
            ans += "V";
            i -= 5;
        }
        while (i >= 0) {
            ans += "I";
            i -= 1;
        }
        ans = ans.replace("VIIII", "IX");
        ans = ans.replace("IIII", "IV");
        return ans;
    }
}
