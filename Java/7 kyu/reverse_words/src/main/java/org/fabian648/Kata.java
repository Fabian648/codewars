package org.fabian648;

public class Kata {
    public static String reverseWords(final String original) {
        StringBuilder sb = new StringBuilder();
        int wordStart = 0;

        while (wordStart < original.length()) {
            if(original.charAt(wordStart) == ' ') {
                sb.append(' ');
                wordStart++;
            }else{
                int wordEnd = wordStart;
                while(wordEnd < original.length() && original.charAt(wordEnd) != ' ') {
                    wordEnd++;
                }

                for(int i = wordEnd - 1; i >= wordStart; i--) {
                    sb.append(original.charAt(i));
                }
                wordStart = wordEnd;
            }
        }

        return  sb.toString();
    }
}