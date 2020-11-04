// import com.vdurmont.emoji.EmojiParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static final Pattern specialCharacterPattern = Pattern.compile("[\\x{10000}-\\x{10FFFF}]", Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
    // private static final Pattern specialCharacterPattern = Pattern.compile("[\uD83C-\uDBFF]+|[\uDC00-\uDFFF]+");

    // private static final Pattern emoji = Pattern.compile ("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]",Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
    private static final Pattern emoji = Pattern.compile("[\\uD83C-\\uDBFF]+|[\\uDC00-\\uDFFF]+");

    public static void main(String[] args) {
        // String str = "Here is a boy: \uD83D\uDC66\uD83C\uDFFF!";
        // String str = "Here is a boy: \"\ud83d\udc95\" !\n! \ud83d\udc95";
        // controller 유입 후 데이터
        String str = " \"productName\": \" \uc704\uc790\ub9e4[\uad6d\ub0b4\uc0dd\uc0b0]20\uceec\ub7ec\ud83d\udc95 \uc18c\ud504\ud2b8 \uce90\uc2dc \ube0c\uc774\ub125\ub2c8\ud2b8(20Color)-Free \uac00\uc744\ub2c8\ud2b8 \uD83C " ;
        // * 실제 request
        String str2 = "\"productName\": \"\\uc704\\uc790\\ub9e4[\\uad6d\\ub0b4\\uc0dd\\uc0b0]20\\uceec\\ub7ec\\ud83d\\udc95 \\uc18c\\ud504\\ud2b8 \\uce90\\uc2dc \\ube0c\\uc774\\ub125\\ub2c8\\ud2b8(20Color)-Free \\uac00\\uc744\\ub2c8\\ud2b8 \\uD83C\",\n" +
                "        \"productType\": \"N\",";

        System.out.println("[emoji.matcher] : " + emoji.matcher(str2));
        Matcher specialCharacterMatcher = emoji.matcher(str2);
        Matcher specialCharacterSecondMatcher = emoji.matcher(specialCharacterMatcher.replaceAll("?"));
        str2 =  specialCharacterSecondMatcher.replaceAll("?");
        System.out.println("result : " + str2);


        /*System.out.println("[parseToUnicode] : " + EmojiParser.parseToUnicode(str2));
        String result = EmojiParser.parseToUnicode(str2);
        Matcher specialCharacterMatcher = specialCharacterPattern.matcher(result);
        Matcher specialCharacterSecondMatcher = specialCharacterPattern.matcher(specialCharacterMatcher.replaceAll("?"));
        result =  specialCharacterSecondMatcher.replaceAll("?");
        System.out.println("result : " + result);*/

        // System.out.println("[] : " + EmojiParser.parseToAliases(str, EmojiParser.FitzpatrickAction.PARSE));
        // Prints twice: "Here is a boy: :boy|type_6:!"
        // System.out.println("[] : " + EmojiParser.parseToAliases(str, EmojiParser.FitzpatrickAction.REMOVE));
        // Prints: "Here is a boy: :boy:!"
        // System.out.println(EmojiParser.parseToAliases(str, ""));
        // Prints: "Here is a boy: :boy:🏿!"

        /*Matcher specialCharacterMatcher = specialCharacterPattern.matcher(str);
        Matcher specialCharacterSecondMatcher = specialCharacterPattern.matcher(specialCharacterMatcher.replaceAll("?"));
        // System.out.println("[replaceSpecialCharacter > originalString after] : " + specialCharacterSecondMatcher.replaceAll("?"));
        str =  specialCharacterSecondMatcher.replaceAll("?");
        System.out.println("[regex] : " + str);*/

    }
}
