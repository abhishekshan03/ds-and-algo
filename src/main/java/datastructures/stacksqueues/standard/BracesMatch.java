package datastructures.stacksqueues.standard;

import datastructures.stacksqueues.MyStackLL;
import datastructures.stacksqueues.MyStackLLStr;

import java.util.Arrays;

/*
   Given an expression: 12 + { [ 34+ 23] + 11 * (23-43) }
   validate the braces
 */
public class BracesMatch {
    private final static String OPN_ROUND_BRACE = "(";
    private final static String CLS_ROUND_BRACE = ")";
    private final static String OPN_CURLY_BRACE = "{";
    private final static String CLS_CURLY_BRACE = "}";
    private final static String OPN_SQR_BRACE = "[";
    private final static String CLS_SQR_BRACE = "]";

    private final static String VALID_EXP = "12 + { [ 34 + 23 ] + 11 * ( 23 - 43 ) }";
    private final static String INVALID_EXP = "12 + { [ 34 + { 23 ] + 11 } * ( 23 - 43 ) }";

    public static void main(String[] args) {
        System.out.println("Validation : "+validateExp(INVALID_EXP));
    }

    private static boolean validateExp (String exp) {
        String[] tokens = exp.split(" ");
        MyStackLLStr stack = new MyStackLLStr(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(OPN_ROUND_BRACE) ||
                    tokens[i].equals(OPN_CURLY_BRACE) ||
                    tokens[i].equals(OPN_SQR_BRACE)) {
                stack.push(tokens[i]);
            } else if (tokens[i].equals(CLS_ROUND_BRACE)) {
                String brace = stack.pop();
                if (!brace.equals(OPN_ROUND_BRACE)) {
                    return false;
                }
            } else if (tokens[i].equals(CLS_CURLY_BRACE)) {
                String brace = stack.pop();
                if (!brace.equals(OPN_CURLY_BRACE)) {
                    return false;
                }
            } else if (tokens[i].equals(CLS_SQR_BRACE)) {
                String brace = stack.pop();
                if (!brace.equals(OPN_SQR_BRACE)) {
                    return false;
                }
            }
        }
        return true;
    }
}
