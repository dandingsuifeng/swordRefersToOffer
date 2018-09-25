public class Problem1 {
    public boolean Find(int target, int [][] array) {
        boolean flag = false;
        for (int[] anArray : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (anArray[j] == target) {
                    flag = true;
                    break;
                }
            }

            if (flag)
                break;
        }
        return flag;
    }
}
