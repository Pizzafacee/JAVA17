package chapter04;

public class Exercise01 {
    public static void main(String[] args) {
        //定义一个一维数组，里面赋值十个随机整数，范围是[10,99]，求出其中最小值、最大值、总和、平均值并输出。
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 90 + 10);
        }
        int[] maxMinSumAvg = getMaxMinSumAvg(ints);
        for (int i = 0; i <maxMinSumAvg.length; i++) {
            System.out.println(maxMinSumAvg[i]);
        }
    }

    public static int[] getMaxMinSumAvg(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        int sum = 0;
        int avg;
        for (int i = 0; i < ints.length; i++) {
            max = ints[i] >= max ? ints[i] : max;
            min = ints[i] <= min ? ints[i] : min;
            sum += ints[i];
        }
        avg = sum / ints.length;
        return new int[]{max,min,sum,avg};
    }
}


