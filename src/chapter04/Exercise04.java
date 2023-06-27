package chapter04;

/**
 * 输入一个1-20的数字，然后已n*n的矩阵形式输出，并且是顺时针螺旋。
 * 例如输入4
 * 1 2 3 4
 * 1213145
 * 1116156
 * 109 8 7
 */
public class Exercise04 {
    public static void main(String[] args) {
        int[][] ints = spiralNumber(9);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static int[][] spiralNumber(int num) {
        int[][] ints = new int[num][num];//创建一个n*n的数组
        int maxX = num - 1;//x轴最大索引
        int maxY = num - 1;//y轴最大索引
        int minX = 0;//x轴最小索引
        int minY = 0;//y轴最小索引
        int count = 1;
        while (minX <= maxX) {
            //第一行
            for (int i = minX; i <= maxX; i++) {
                ints[minY][i] = count;
                count++;
            }
            minY++;//结束完第一层后，y轴的最小值就会加1
            //遍历竖的
            for (int i = minY; i <= maxY; i++) {
                ints[i][maxX] = count;
                count++;
            }
            //遍历完竖的后，x轴的最大值减1
            maxX--;
            //再遍历横的
            for (int i = maxX; i >= minX; i--) {
                ints[maxY][i] = count;
                count++;
            }
            //遍历完横的之后，y轴的最大值减少1
            maxY--;
            //再遍历竖的
            for (int i = maxY; i >= minY; i--) {
                ints[i][minX] = count;
                count++;
            }
            //遍历完竖的后，x轴的最小值就会加1
            minX++;
        }
        return ints;
    }
}
