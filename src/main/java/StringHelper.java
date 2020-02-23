import java.util.*;

public class StringHelper {
    String removeAllDuplicatedChar(String beforeRemoveDuplicateChar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        for (int j = 0; j < beforeRemoveDuplicateChar.length(); j++) {
            linkedHashSet.add(beforeRemoveDuplicateChar.charAt(j));
        }

        return linkedHashSet.toString();
    }

    String removeAllDuplicate(String string) {
        Set<Character> chars = new LinkedHashSet<>();
        for(int i = 0; i < string.length(); i++) {
            chars.add(string.charAt(i));
        }

        return chars.toString();
    }

    String removeOnlyNextDuplicateChar(String beforeRemoveDuplicateChar) {
        List temporaryListForArrayOfChar = new ArrayList();

        for (int i = 0; i < beforeRemoveDuplicateChar.length(); i++) {
            if(i == beforeRemoveDuplicateChar.length() - 1) {
                temporaryListForArrayOfChar.add(0, beforeRemoveDuplicateChar.charAt(i));
            } else {
                if(beforeRemoveDuplicateChar.charAt(i) != beforeRemoveDuplicateChar.charAt(i + 1)) {
                    temporaryListForArrayOfChar.add(0, beforeRemoveDuplicateChar.charAt(i));
                }
            }
        }

        Collections.reverse(temporaryListForArrayOfChar);

        return temporaryListForArrayOfChar.toString();
    }

    String removeNextDuplicate(String string) {
        List<Character> chars = new ArrayList<>();
        for(int i = 0; i < string.length(); i++) {
            if(i == string.length()-1) {
                chars.add(0, string.charAt(i));
            } else {
                if(string.charAt(i) != string.charAt(i + 1)) {
                    chars.add(0, string.charAt(i));
                }
            }
        }

        Collections.reverse(chars);
        return chars.toString();
    }

    String removeNextDuplicate2(String s) {
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(i == s.length() - 1) {
                result.add(s.charAt(i));
            } else {
                if(s.charAt(i) != s.charAt(i+1)) {
                    result.add(s.charAt(i));
                }
            }
        }
        return result.toString();
    }
}
