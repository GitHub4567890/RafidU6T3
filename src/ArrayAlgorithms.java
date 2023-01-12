public class LoopAlgorithms {
    /** Returns a NEW array of Strings that contains all words from the original
     *  array of strings in lowercase (use the toLowerCase() string method)
     *
     *  This method does NOT modify the original array
     *  PRECONDITION: wordList.length > 0
     */
    public static String[] makeLowercase(String[] wordList) {
        for (int i = 0; i <= wordList.length - 1; i++) {
            wordList[i] = wordList[i].toLowerCase();
        }
    }

}
