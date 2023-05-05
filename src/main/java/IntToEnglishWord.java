import java.util.HashMap;
import java.util.Map;

public class IntToEnglishWord {
        static Map<Integer, String> numbers_map = new HashMap<>() {{
            put(1, "One");
            put(2, "Two");
            put(3, "Three");
            put(4, "Four");
            put(5, "Five");
            put(6, "Six");
            put(7, "Seven");
            put(8, "Eight");
            put(9, "Nine");
        }};

        static Map<Integer, String> dozens_map = new HashMap<>() {{
            put(2, "Twenty");
            put(3, "Thirty");
            put(4, "Forty");
            put(5, "Fifty");
            put(6, "Sixty");
            put(7, "Seventy");
            put(8, "Eighty");
            put(9, "Ninety");
        }};

        static Map<Integer, String> decades_map = new HashMap<>() {{
            put(10, "Ten");
            put(11, "Eleven");
            put(12, "Twelve");
            put(13, "Thirteen");
            put(14, "Fourteen");
            put(15, "Fifteen");
            put(16, "Sixteen");
            put(17, "Seventeen");
            put(18, "Eighteen");
            put(19, "Nineteen");
        }};


        private static String processor(int sample_num) {
            String res = "";

            int hundreds, decades;
            if((hundreds = sample_num / 100) > 0) {
                res += numbers_map.get(hundreds);
            }
            sample_num %= 100;
            if (sample_num <= 19) {
                res += " " + decades_map.get(sample_num);
            }
            if((decades = sample_num / 10) > 0) {
                res += " " + dozens_map.get(decades);
            }
            sample_num %= 10;
            if (sample_num > 0) {
                res += " " + numbers_map.get(sample_num);
            }
            return res;

    }

    public static void main(String[] args) {
        System.out.println(IntToEnglishWord.processor(100));
    }
}
