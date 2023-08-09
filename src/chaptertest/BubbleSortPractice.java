package chaptertest;

import org.junit.Test;

public class BubbleSortPractice {
    public static void sort(int[] ints) {
        for (int j = 0; j < ints.length - 1; j++) {
            for (int i = 0; i < ints.length - j-1; i++) {
                if (ints[i] > ints[i + 1]) {
                    int temp = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = temp;
                }
            }
        }
    }
}
