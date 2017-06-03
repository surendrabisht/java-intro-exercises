public class Triangle {

    public String easy() {
        return "*";
    }

    public String horizontalLine(int num) {
        String result = "*";
        for (int i = 1; i < num; i++) {
            result += "*";
        }
        return result;
    }

    public String verticalLine(int num) {
        String result = "*\n";
        for (int i = 1; i < num; i++) {
            result += "*\n";
        }
        return result;
    }
}
