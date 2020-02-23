public class Main {
    public static void main(String[] args) {
        String input = "aaabccaadeee";

        StringHelper stringHelper = new StringHelper();

        System.out.println(stringHelper.removeAllDuplicatedChar(input));
        System.out.println(stringHelper.removeAllDuplicate(input));

        System.out.println(stringHelper.removeOnlyNextDuplicateChar(input));
        System.out.println(stringHelper.removeNextDuplicate(input));

        System.out.println(stringHelper.removeNextDuplicate2(input));
    }
}
