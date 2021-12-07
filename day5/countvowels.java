
public class countvowels {
	public static void main(String[] args) {
        String string = "Once upon a time";
        int count = 0;
        for (int i = 0;i < string.length();i++) {
                if (isVowel(string.charAt(i)))
                        count++;
        }
        System.out.println(count);
}
public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
}
}


