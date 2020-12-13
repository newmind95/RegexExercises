/*
 Ny Name is Kristiyan Penev, Born 1995
 */
package regexexercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author newmind95
 */
public class RegExExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Challange1
//        String challange1 = "I want a bike.";
//        System.out.println("matches: " + challange1.matches("I want a bike."));
        
        
        // Challange2
//        String challange1 = "I want a bike.";
//        String challange2 = "I want a car.";
//        String regEx = "I want a \\w+.";
//        
//        System.out.println(challange1.matches(regEx));
//        System.out.println(challange2.matches(regEx));
        
        // Challange3
        String challange1 = "I want a bike.";
        String challange2 = "I want a car.";
//        String regEx = "I want a \\w+.";
        
//        Pattern patternChallange1 = Pattern.compile(regEx);
//        Matcher matcherChallange1 = patternChallange1.matcher(regEx);
//        
//        boolean isMatch = Pattern.matches(regEx, challange1);
//        
//        System.out.println("matches: " + isMatch);
        
        // Challenge4
//        String challange4 = "Replace all blanks with underscores";
//        System.out.println(challange4.replaceAll("\\s", "_"));
        
        // Challenge5
//        String challange5 = "aaabcccccccdddefffg";
//        System.out.println("challange5: " + challange5.matches("[abcdefg]+"));
//        System.out.println("challange5: " + challange5.matches("[a-g]+"));
        
        // Challenge6
//        String challange6 = "aaabccccccccdddefffg";
//        String regEx = "([a]{3}[b][c]{8}[d]{3}[e][f]{3}[g]$)";
//        
//        Pattern challange5Pattern = Pattern.compile(regEx);
//        Matcher challange5Matcher = challange5Pattern.matcher(challange6);
//        
//        System.out.println(challange5Matcher.matches());
        
        // challenge7
        String challange7 = "abcd.123";
        String regEx = "^[A-z][a-z]+\\.\\d+$";
        
        System.out.println("challange7 matches?: " + challange7.matches(regEx));
        
        // Challenge8
        /**
         * Modify the regular expression in challange7 to use a group,
         * so that we can print all the digits that occur in a string
         * that contains multiple occurrences of the pattern.
         * Write all the code required to accomblish this (create
         * pattern and matcher, etc.). Use the following string to test
         * your code: String challange8 = "abcd.135uvqz.7tzik.999";
         */
        String challange8 = "abcd.135uvqz.7tzik.999";
        String regExChallenge8 = "^([A-z][a-z].+\\d+$)";
        Pattern patternChallange8 = Pattern.compile(regExChallenge8);
        Matcher matcherChallange8 = patternChallange8.matcher(challange8);
        System.out.println("challange8 matches?: " + matcherChallange8.matches());
        
        // Challenge9
        /**
         * Let's suppose we're reading strings that match the patterns
         * we used in challange7 and 8 from a file.Tabs are used
         * to separate the matches, with one exception. The last match
         * is followed by a new line. Our revised challange8 strings 
         * would look like this: 
         * String challange9 = "abcd.135\tuvqz.7\ttzik.999\n";
         */
        String challange9 = "abcd.135\tuvqz.7\ttzik.999\n";
        String regExChallange9 = "^([A-z][a-z].+\\d[^\t]+$)";
        Pattern patternChallange9 = Pattern.compile(regExChallange9);
        Matcher matcherChallange9 = patternChallange9.matcher(challange9);
        System.out.println("challange9 matches?: " + matcherChallange9.matches());
        
        // Challenge10
        
        // Challenge11
        // Challenge12
        // Challenge13
        // Challenge14
        
    }
    
}
