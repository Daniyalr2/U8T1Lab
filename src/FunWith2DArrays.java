public class FunWith2DArrays
{
    public static int totalElements(int[][] array)
    {
        int elements = 0;
        for (int[] row : array)
        {
            for(int num : row)
            {
                elements++;
            }
        }
        return elements;
    }

    public static void fourCorners(String[][] array)
    {

        System.out.println(array[0][0]);
        System.out.println(array[0][array[0].length - 1]);
        System.out.println(array[array.length - 1][0]);
        System.out.println(array[array.length - 1][array[array.length - 1].length - 1]);
    }
}
