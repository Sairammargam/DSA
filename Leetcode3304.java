class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            StringBuilder newWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char nextChar = word.charAt(i);
                 if (nextChar == 'z') {
                    newWord.append('a');
                } else {
                    newWord.append((char) (nextChar + 1));
                }
            }
             word.append(newWord);
        }
          return word.charAt(k - 1);
        
    }
}
