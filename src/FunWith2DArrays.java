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

    public static double average(int [][] ints){
        int rows = ints[0].length;
        int columns = ints.length;
        int total = 0;
        int amount = 0;
        for(int i = 0; i < rows; i ++)
        {
            for(int z = 0; z < columns; z++)
            {
                total += ints[z][i];
                amount ++;
            }
        }
        return (total * 1.0)/(amount);
    }

    public static int[] indexFound(String [][] str, String target){
        int rows = str[0].length;
        int columns = str.length;
        int returnRows = -1;
        int returnColumns = -1;

        for(int i = 0; i < rows; i ++)
        {
            for(int z = 0; z < columns; z++)
            {
                if(str[z][i] == target)
                {
                    returnRows = z;
                    returnColumns = i;
                }
            }
        }
        int[] falseReturn = {returnRows, returnColumns};
        return falseReturn;
    }
}
