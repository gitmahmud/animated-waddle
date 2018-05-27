import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public ArrayList<Integer> mergeSort(List<Integer> list){
        return merge(list,0,list.size()-1);
    }
    public ArrayList<Integer> merge(List<Integer> list,int i , int j){
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        if(i==j){
            mergedList.add(list.get(i));
            return mergedList;
        }
        if(j-i ==1){
            if(list.get(i)>list.get(j)){
                mergedList.add(list.get(j));
                mergedList.add(list.get(i));
            }
            else {
                mergedList.add(list.get(i));
                mergedList.add(list.get(j));
            }
            return mergedList;
        }

        int mid = (i+j)/2;


        ArrayList<Integer> l1 = merge(list,i,mid);
        ArrayList<Integer> l2 = merge(list,mid+1,j);
        int p1 = 0,p2 = 0;
        while(p1 <l1.size() && p2 <l2.size()){
            if(l1.get(p1) >l2.get(p2)){
                mergedList.add(l2.get(p2));
                p2++;
            }
            else{
                mergedList.add(l1.get(p1) );
                p1++;
            }
        }
        while(p1 <l1.size()){
            mergedList.add(l1.get(p1));
            p1++;
        }
        while (p2 <l2.size()){
            mergedList.add(l2.get(p2));
            p2++;
        }

        return mergedList;
    }
}
