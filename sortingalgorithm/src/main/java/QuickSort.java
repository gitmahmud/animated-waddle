import java.util.ArrayList;

public class QuickSort {
    public void quicksort(ArrayList<Integer> list,int i , int j){
        int start = i;
        int end = j;

        if(start>=end){
            return;
        }

        int pivot = list.get((start+end)/2);

        while(start <= end){
            while(list.get(start)<pivot ){
                start++;
            }
            while(list.get(end) > pivot ){
                end--;
            }
            if(start <= end){
                int tmp = list.get(start);
                list.set(start,list.get(end));
                list.set(end,tmp);
                start++;
                end--;
            }
        }

        //if(i< start-1)
        quicksort(list,i,start-1);
        //if(j>start)
        quicksort(list,start,j);



    }
}
