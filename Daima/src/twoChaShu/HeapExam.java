package twoChaShu;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
        public int l1;
        public int l2;
        public int sum;

        public Pair(int l1, int l2, int sum) {
            this.l1 = l1;
            this.l2 = l2;
            this.sum = sum;
        }

    public Pair(int i, int i1) {

    }

    @Override
        public int compareTo(Pair o) {
            return this.sum-o.sum;
        }
    }


public class HeapExam {
    public List<List<Integer>>kSmallestPairs(int[]nums1,int[]nums2,int k){
            List<List<Integer>> result=new ArrayList<>();
            if (nums1.length==0||nums2.length==0||k<=0){
                return result;
            }
        PriorityQueue<Pair> queue=new PriorityQueue<>();
            for (int i=0;i<nums1.length;i++){
                for (int j=0;j<nums2.length;j++){
                        queue.offer(new Pair(nums1[i],nums2[j]));
                }
            }
            for (int i=0;i<k&&!queue.isEmpty();i++){
                Pair cur=queue.poll();
                List<Integer> tmp=new ArrayList<>();
                tmp.add(cur.l1);
                tmp.add(cur.l2);
                result.add(tmp);
            }
            return result;
    }
}
