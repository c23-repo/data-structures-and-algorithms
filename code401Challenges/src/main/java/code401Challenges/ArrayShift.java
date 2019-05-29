package code401Challenges;

public class ArrayShift {

    public int [] insertShiftArray(int[] oldArr, int v) {
        int mid = (int) Math.floor(oldArr.length / 2);
        int[] newArr = new int[oldArr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < mid) {
                newArr[i] = oldArr[i];
            } else if (i == mid) {
                newArr[i] = v;
            } else if (i > mid) {
                newArr[i] = oldArr[i - 1];
            }
        }
        return newArr;
    }

}
