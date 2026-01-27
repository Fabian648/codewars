package org.Fabian648;

public class Kata
{
    public static String[] towerBuilder(int nFloors)
    {
        int n = nFloors-1;
        int numStar = 1;
        String[] result = new String[nFloors];

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < nFloors; i++){
            sb.append(" ".repeat(n));
            sb.append("*".repeat(numStar));
            sb.append(" ".repeat(n));
            result[i] = sb.toString();
            sb.setLength(0);
            numStar += 2;
            n--;
        }
        return result;
    }
}