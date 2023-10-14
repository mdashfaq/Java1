public class Main2 {
    public static void main(String[] args) {
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        char searchLetter;
        int count = countOccurrences(letters, searchLetter = 'Q');
        System.out.println(count);
    }

    public static int countOccurrences(char[] letters, char searchLetter) {
        // System.out.println("Method count occ was invoked");
       /* System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);
        return -1;*/
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;
    }
}
