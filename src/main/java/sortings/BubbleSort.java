package sortings;

/**
 * Created by wopqw on 27.10.16.
 */
class BubbleSort implements Sortings {

    @Override
    public void sort(int[] a){

        for (int i = 0; i < a.length-1; i++)
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1])
                    swap(a,j,j+1);
            }
    }
}
