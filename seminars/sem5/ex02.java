import java.util.HashMap;
import java.util.Map;

/*
Даны 2 строки, написать метод, который вернет true, 
если эти строки являются изоморфными и false, если нет.
Строки изоморфны, если одну букву в первом слове можно 
заменить на некоторую букву во втором слове, при этом
1. повторяющиеся буквы одного слова меняются на одну 
и ту же букву с сохранением порядка следования. 
(Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. 
(Например, note - code)
Пример 1:
Input: s = "foo", t = "baar"
f: b
o: a
Output: false
Пример 2:
Input: s = "paper", t = "title"
p: t
a: i
e: l
r: e
Output: true
 */

public class ex02 {
    public static void main(String[] args) {
        String firstWord = "123";
        String secondWord = "556";

        System.out.println(isIsomorph(firstWord, secondWord));
        System.out.println(isomorphicWords(firstWord, secondWord));
    }

    // 1 способ
    static boolean isIsomorph(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        Map<Character, Character> dict = new HashMap<>();

        for (int i = 0; i < firstWord.length(); i++) {
            if (dict.containsKey(firstWord.charAt(i)) && dict.get(firstWord.charAt(i)) != secondWord.charAt(i)) {
                return false;
            } else {
                dict.put(firstWord.charAt(i), secondWord.charAt(i));
            }
        }
        return true;
    }

    // 2 способ
    public static boolean isomorphicWords(String word1, String word2){
        if(word2.length() != word1.length()) return false;
        Map<Character, Character> cod = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            cod.putIfAbsent(word1.charAt(i), word2.charAt(i));
            if(cod.get(word1.charAt(i)) != word2.charAt(i)) return false;
        }
        return true;
    }
}
