package englishruler;

/**
 *
 * @author Dell
 */
public class EnglishRuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        draw(5, 2);
    }

    public static void draw(int majorTickLenght, int rulerLength) {
        drawTick(majorTickLenght, 0);
        for (int i = 1; i <= rulerLength; i++) {
            drawInterval(majorTickLenght - 1);
            drawTick(majorTickLenght, i);
        }
    }

    public static void drawInterval(int tickLength) {
        if (tickLength >= 1) {
            drawInterval(tickLength - 1);
            drawTick(tickLength);
            drawInterval(tickLength - 1);
        }
    }

    public static void drawTick(int length, int number) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println(number);
    }

    public static void drawTick(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

}
