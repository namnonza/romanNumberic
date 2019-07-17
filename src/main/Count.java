public class Count {
    public String romanNumberic(int i) {
        String ans = "";
        if (i==4) {
            return "IV";
        }
        if (i>5) {
            i -= 5;
            ans = "V";
        }
        for (int j = 0; j < i; j++)
            ans += "I";
        return ans;
    }
}
