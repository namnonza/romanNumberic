public class Count {
    public String romanNumberic(int i) {
        String ans = "";
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
