package searchresearch;

import java.util.HashMap;
import java.util.Locale;

/**
 * Find most used and longest string
 */
public class FindMostUsed {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = "hit";

        HashMap<String, Integer> matched = new HashMap<>();
        String[] splitedText = paragraph.split("[ |\\. |\\.|\\, ]");
        Integer count = 0 ;
        for (int i = 0; i < splitedText.length; i++) {
            String data = splitedText[i].toLowerCase(Locale.ROOT);
                count = 1;
                if(matched.containsKey(data)) { // if contains
                    count = matched.get(data) + 1;
                }
                matched.put(data, count);
        }

//        if(!data.equalsIgnoreCase(banned)) { // if not empty and banned
//
//        }
        System.out.println(matched);
    }
}
