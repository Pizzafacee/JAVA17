package chapter29;

import project03.conan.practice.team.view.TSUtility;

public class StringBuildTset02 {
    public static void main(String[] args) {
        String str = null;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append(str);
        StringBuilder stringBuilder1 = new StringBuilder(str);
        System.out.println(append.length());
        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);
    }
}
