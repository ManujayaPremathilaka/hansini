//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WordGame game = new WordGame();
        System.out.println(game.bestScore("TOPCODERROCKS")); // Returns: 35
        System.out.println(game.bestScore("ABCDEFGHIJKLMNOPQRSTUVWXYZ")); // Returns: 28
        System.out.println(game.bestScore("AWOIDUIWAHCSZNGAIOWIAWEWIUYTIUEAXKLMFCAWMAWVAWUBVA")); // Returns: 374
    }
}