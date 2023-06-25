package chapter04;

//二维数组
public class TwoArrayTest {
    public static void main(String[] args) {
        //静态初始化
        int[][] ints = {{}, {}, {}};
        int[][] ints1 = {{11, 1112, 123}, {11, 3}, {12}};
        //动态初始化
        int[][] ints2 = new int[3][];
        int[][] ints3 = new int[3][4];

        int[] x,y[];

        //取值
        int i = ints1[1][1];
        System.out.println(i);
        int[] anInt = ints[1];
        System.out.println(anInt);

        //赋值
        ints3[2][2] = 3;
        ints2[2] = new int[3];
        ints2[2][1] = 4;

        //遍历
        for (int j = 0; j < ints1.length; j++) {
            for (int k = 0; k < ints1[j].length; k++) {
                System.out.println(ints1[j][k]);
            }
        }

        //默认值
        String[][] strings = new String[2][];
        String[] string = strings[1];//null
        String[][] strings1 = new String[2][2];
        String s = strings1[1][1];//null
        String[] strings2 = strings1[1];//内存地址[Ljava.lang.String;@b4c966a
    }
}
