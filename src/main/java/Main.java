public class Main {
    public static void main(String[] args) {
        String input = "aaabccaadeee";

        StringHelper stringHelper = new StringHelper();

        System.out.println(stringHelper.removeAllDuplicatedChar(input));

        System.out.println(stringHelper.removeOnlyNextDuplicateChar(input));
    }
}
