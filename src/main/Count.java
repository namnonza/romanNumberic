public class Count {
    public String romanNumberic(int i) {
        if (i==4)
            return "IV";
        if (i==5)
            return "V";
        String ans = "";
        for (int j = 0; j < i; j++)
            ans += "I";
        return ans;
    }
}
