public class Song { // 1. Capital S
    
    // 2. Colors define karne hain
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";
    public static final String PINK = "\u001B[35m";
    public static final String BLUE = "\u001B[34m";
    public static final String ORANGE = "\u001B[38;5;208m"; // Orange ke liye special code
    public static final String RESET = "\u001B[0m";

    // 3. typing effect wala function
    public static void typeSong(String text, int speed) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(speed);
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(PINK + "🎵 Playing: Teri Mohabbat 🎵" + RESET + "\n");
        
        typeSong(YELLOW + "🌙 teri mohabbat me jalna bhi hai...💗" + RESET,90);
        Thread.sleep(800);
        typeSong(CYAN + "💜 Aur tujhase bachke hi chalna hi hai...💛" + RESET,90);
        Thread.sleep(800);
        typeSong(RED + "❤️ Kuch rang apne badlana bhi hai...❣" + RESET,90);
        Thread.sleep(800);
        typeSong(YELLOW + "💜 Maine dhalna tere rang me hai sada...🧡" + RESET,90);
        Thread.sleep(800);
        typeSong(ORANGE + "💛 Tu chand hai ek dhamakata huva...💗" + RESET,90);
        Thread.sleep(800);
        typeSong(BLUE + "💙 Chori se mujhko hi takta huva...💙" + RESET,90);
        Thread.sleep(800);
        typeSong(PINK + "💖 Sine se lagake chamkata huva...💖" + RESET,90);
        Thread.sleep(800);
        typeSong(RED + "❤️ meri jannat ka rasta tu hi to huva...💛" + RESET,90);
        Thread.sleep(1000);
        System.out.println("\n" + PINK + "--- Song finish ---💥" + RESET);
    }
} 