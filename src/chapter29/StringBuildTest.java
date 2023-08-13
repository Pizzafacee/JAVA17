package chapter29;

public class StringBuildTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("hellolostworld");
        stringBuilder.append("3");
        StringBuilder insert = stringBuilder.insert(3, 3);
        StringBuilder delete = insert.delete(0, 1);
        StringBuilder bbb = delete.replace(3, 4, "bbb");
        bbb.setCharAt(3,'f');
        char c = bbb.charAt(3);
        System.out.println(delete);
        System.out.println(insert);

    }
}
