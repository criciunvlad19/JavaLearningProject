package org.VladQA.exceptionsservicetask;

public class Main extends TextManager{
    public static void main(String[] args) {
        String textDeControl = "Ceplmma";
        String alDoileaText = "Aristocrat";
        String alTreileaText = "null";

        System.out.println(checkTheLengthOfStringAndException(textDeControl));
        System.out.println(checkTheLengthOfStringAndException(alDoileaText));
        System.out.println(checkTheLengthOfStringAndException(alTreileaText));

        System.out.println(checkTheLengthOfString(textDeControl));
        System.out.println(checkTheLengthOfString(alDoileaText));
        System.out.println(checkTheLengthOfString(alTreileaText));

        System.out.println(getTheTextLengthIfElse(textDeControl));
        System.out.println(getTheTextLengthIfElse(alDoileaText));
        System.out.println(getTheTextLengthIfElse(alTreileaText));

    }
}
