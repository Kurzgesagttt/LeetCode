//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0 ; i < strs[0].length(); i++){
                char c = strs[0].charAt(i);

                for (int j = 1; j < strs.length; j++){
                    if( i >= strs[j].length() || strs[j].charAt(i) != c ){
                        return stringBuilder.toString();
                    }
                }
                stringBuilder.append(c);
            }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"flower","flower","flower","flower"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }
}