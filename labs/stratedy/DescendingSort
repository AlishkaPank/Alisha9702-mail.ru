package strategy;

public class DescendingSort implements Sortable {
    
    public int[] sort(int[] source) {
        for (int i = 1; i < source.length; ++i) {
            int key = source[i];
            int j = i;
            while (j > 0 && source[j - 1] < key) {
                source[j] = source[j - 1];
                j = j - 1;
            }
            source[j] = key;
        }
        return source;
    }
}
