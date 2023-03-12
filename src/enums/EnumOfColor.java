package enums;

enum Color {
    WHITE,
    RED,
    BLUE
}

public class EnumOfColor {
    public static void main(String[] args) {
        System.out.println(Color.BLUE);
        System.out.println(Color.valueOf("WHITE"));
        for (Color color : Color.values()) {
            System.out.println(color);
        }
    }

}
