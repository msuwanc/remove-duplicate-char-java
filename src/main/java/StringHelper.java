import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class StringHelper {
    String removeAllDuplicatedChar(String beforeRemoveDuplicateChar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        for (int j = 0; j < beforeRemoveDuplicateChar.length(); j++) {
            linkedHashSet.add(beforeRemoveDuplicateChar.charAt(j));
        }

        return linkedHashSet.toString();
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
}
