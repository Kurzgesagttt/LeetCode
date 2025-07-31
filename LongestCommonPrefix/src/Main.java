//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
            for(int i = 0 ; i < strs.length; i++){
                char[] charArray = strs[i].toCharArray();
                for (int x = 0; x < strs[i].length() ; x++){
                    char letter = charArray[x];
                    System.out.println(letter);

                }



            }
        return "";
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"flower","flow","flight"};

        String result = longestCommonPrefix(strs);

        System.out.println(result);
    }
}