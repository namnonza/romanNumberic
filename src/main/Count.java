public class Count {
    public String romanNumberic(int i) {
        String ans = "";
        if (i==9) {
            return "IX";
        }

        if (i >= 10) {
            i -= 10;
            ans += "X";
        }

        if (i>=5) {
            i -= 5;
            ans += "V";
        }
        for (int j = 0; j < i; j++)
            ans += "I";
        if (ans.contains("IIII"))
            ans = ans.replace("IIII", "IV");
        return ans;
    }
}
