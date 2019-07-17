public class Count {
    public String romanNumberic(int i) {
        String ans = "";
        if (i >= 500) {
            i -= 500;
            ans += "D";
        }
        while (i >= 100) {
            i -= 100;
            ans += "C";
        }
        if (i >= 50) {
            i -= 50;
            ans += "L";
        }
        while (i >= 10) {
            ans += "X";
            i -= 10;
        }
        if (i>=5) {
            i -= 5;
            ans += "V";
        }
        for (int j = 0; j < i; j++)
            ans += "I";
        if (ans.contains("CCCC"))
            ans = ans.replace("CCCC", "CD");
        // if ans: 90 => 100 - 10
        if (ans.contains("LXXXX"))
            ans = ans.replace("LXXXX", "XC");
        // if ans: 40 => 50 - 10
        if (ans.contains("XXXX"))
            ans = ans.replace("XXXX", "XL");
        // if ans: 9 => 10 - 1
        if (ans.contains("VIIII"))
            ans = ans.replace("VIIII", "IX");
        // if ans: 4 => 5 - 1
        if (ans.contains("IIII"))
            ans = ans.replace("IIII", "IV");
        return ans;
    }
}
