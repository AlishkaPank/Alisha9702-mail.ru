package strategy;

public class Make {

    Sortable sorter;
    public Make(Sortable sorter){
        this.sorter = sorter;
    }

    public void setSorter(Sortable sorter) {
        this.sorter = sorter;
    }

    public void display(int[] source){
        for (int value : source) {
            System.out.print(value);
            System.out.print(' ');
        }
    }
    public int[] performSort(int[] source){
        return sorter.sort(source);
    }
}
