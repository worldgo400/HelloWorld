package EveryDayOneTest;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String n=scanner.next();
            String a=scanner.next();
            String[]na=n.split(" ");
            String[]aa=a.split(" ");
            int np=Integer.parseInt(na[0])*17*29+Integer.parseInt(na[1])*29+Integer.parseInt(na[2]);
            int ap=Integer.parseInt(aa[0])*17*29+Integer.parseInt(aa[1])*29+Integer.parseInt(aa[2]);
            int sp=ap-np;
            if (sp<0){
                System.out.println("-");
                sp=0-sp;
            }
            int k=sp%29;
            int sk=(sp/29)%17;
            int g=(sp/29)%17;
            System.out.println(g+"."+sk+"."+k);
        }
    }
    public int countNumberOf2s(int n) {
        int count=0;
        int low=0;
        int cur=0;
        int high=0;
        int flag=1;
        while (n/flag!=0){
            low=n-(n/flag)*flag;
            cur=(n/flag)%10;
            high=(n/flag)/10;
            if (cur==1||cur==0){
                count+=high*flag;
            }else if (cur==2){
                count+=high*flag+1+low;
            }else {
                count+=(high+1)*flag;
            }
            flag*=10;
        }
        return count;

    }
}
