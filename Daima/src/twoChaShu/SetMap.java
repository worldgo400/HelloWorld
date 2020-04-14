package twoChaShu;

public class SetMap {
    public  int singleNumber(int[]array){
        int ret =0;
        for (int x:array){
            ret^=x;
        }
        return ret;
    }
    public int[] singleNumber2(int[]nums){
        int ret=0;
        for (int x:nums){
            ret^=x;
        }
        int bit=1;
        int i=0;
        for (;i<32; i++){
            if ((ret&(bit<<i))!=0){
            break;
            }
        }
        int a=0;
        int b=0;
        for (int x:nums){
            if ((x&(bit<<i))!=0){
                a^=x;
            }else {
                b^=x;
            }
        }
        int[]array={a,b};
        return array;
    }

    public static void main(String[] args) {
        setMapInterview interview=new setMapInterview();
        int[]array={1,2,4,2,6,1,2,7,0};
        int result=interview.singleNumber(array);
        System.out.println(result);

    }
}
