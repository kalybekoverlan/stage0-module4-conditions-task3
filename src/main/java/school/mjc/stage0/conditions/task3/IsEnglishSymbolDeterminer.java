package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int intChar;
        intChar = symbol;
        if ( (intChar >= 97 && intChar <=122)
        || (intChar >= 65 && intChar <=90)) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }

    public static void main(String[] args) {
        IsEnglishSymbolDeterminer abd = new IsEnglishSymbolDeterminer();
        abd.isEnglishSymbol('T');
    }
}
