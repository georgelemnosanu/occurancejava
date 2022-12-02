package occurance;

import java.util.*;

public class Occurance {

    public boolean uniqueOccurrences(int[] arr) {
       int ocur[]=new int[arr.length];
       int visit=-1;
       for(int i=0;i<arr.length;i++){
           int count=1;
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   count++;
                   ocur[j]=visit;
               }
               if(ocur[i]!=visit){
                   ocur[i]=count;
               }
           }
       }
       for(int i=0;i<ocur.length;i++){
           if(ocur[i]!=visit){
               System.out.println(arr[i]+"->"+ocur[i]);
           }
       }
        return true;
    }
}