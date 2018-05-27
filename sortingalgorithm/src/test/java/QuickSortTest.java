import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class QuickSortTest {
    QuickSort quicksort;

    @Before
    public void setup(){
        quicksort = new QuickSort();
    }

    @Test
    public void testRandomList() throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 1 ; i<= 20 ; i++){
            list.add(random.nextInt(100)+1);
        }
        quicksort.quicksort(list,0,list.size()-1);
        for(int i = 1 ; i<list.size();i++){
            if(list.get(i)<list.get(i-1)){
                throw new Exception("");
            }
        }

    }


}