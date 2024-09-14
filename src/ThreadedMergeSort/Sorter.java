/*
package ThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sorter  implements Callable<List<Integer>>{
   private List<Integer>arrayToSort;

   Sorter (List<Integer> arrayToSort){
       this.arrayToSort=arrayToSort;
   }


    @Override
    public List<Integer> call() throws Exception {

       if(arrayToSort.size()==1 ){
           return arrayToSort;
       }
       int mid=arrayToSort.size()/2;

//       List<Integer> leftArray =arrayToSort.subList(0,mid);
//        List<Integer> rightArray =arrayToSort.subList(mid,arrayToSort.size());

        List<Integer> leftArray=new ArrayList<>();
        List<Integer> rightArray=new ArrayList<>();

        for (int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for (int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

        ExecutorService es = Executors.newCachedThreadPool();
        Sorter leftSorter =new Sorter(leftArray);
        Sorter rightSorter=new Sorter(rightArray);

        es.submit(leftSorter);


    }
}
*/
