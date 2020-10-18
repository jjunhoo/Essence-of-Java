import com.vdurmont.emoji.EmojiParser;

public class Test {
    public static void main(String[] args) {
        // String str = "Here is a boy: \uD83D\uDC66\uD83C\uDFFF!";
        // String str = "Here is a boy: \"\ud83d\udc95\" !\n! \ud83d\udc95";
        String str = " \"productName\": \" \ud83d\udc95 (20Color)-Free \uac00\uc744\ub2c8\ud2b8 \uD83C\" " ;

        System.out.println(EmojiParser.parseToAliases(str));
        System.out.println(EmojiParser.parseToAliases(str, EmojiParser.FitzpatrickAction.PARSE));
        // Prints twice: "Here is a boy: :boy|type_6:!"
        System.out.println(EmojiParser.parseToAliases(str, EmojiParser.FitzpatrickAction.REMOVE));
        // Prints: "Here is a boy: :boy:!"
        // System.out.println(EmojiParser.parseToAliases(str, ""));
        // Prints: "Here is a boy: :boy:🏿!"
    }
}
