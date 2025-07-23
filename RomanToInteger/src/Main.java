import java.util.Map;

public class Main {
    static class Solution {
        //HashMap to Map Key to value itens, an index of the next number to verify if subtract or sum the next value.
        public int romanToInt(String s) {
            Map<Character, Integer> values = Map.of('I',1, 'V',5,
                    'X', 10, 'L' ,50, 'C',100,'D',500,'M',1000 );

            int total = 0;

            for (int i = 0; i < s.length(); i++){
                int atual = values.get(s.charAt(i));
                int prox = (i + 1 < s.length()) ? values.get(s.charAt(i + 1)) : 0;

                if( atual < prox ){
                    total -= atual;
                }else{
                    total += atual;
                }

            }

            return total;
        }
    }

    public static void main(String[] args) {
        String roman = "XXI";
        Solution sol = new Solution();
        int inteiro = sol.romanToInt(roman);
        System.out.println(inteiro);

    }
}