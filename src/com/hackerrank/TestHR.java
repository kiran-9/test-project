package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class TestHR {
	
	
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

      List<Integer> result = new ArrayList<>();
        int alice = 0;
        int bob = 0; 
        for(int i=0;i<3;i++){
         int[] score = new int[2];
          score[0] = a.get(i);
          score[1] = b.get(i);
             if(score[0]<score[1])
                alice++;
                else if(score[1]<score[0])
                bob++;       
        }

        result.add(0,bob);
        result.add(1,alice);

        return result;
    }
	


}

