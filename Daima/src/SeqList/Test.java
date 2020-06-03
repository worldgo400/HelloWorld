package SeqList;

public class Test {

    //更严谨的测试逻辑
    //1,测试参数的非法情况
    //2,测试扩容功能
    //3,尾插的逻辑
    //4,普通位置的插入

    public static void testContains() {
        seqList1 seqList1 = new seqList1();
        seqList1.add(0, 1);
        seqList1.add(0, 2);
        seqList1.add(0, 3);
        seqList1.add(0, 4);
        System.out.println(seqList1.contains(2));
    }

    public static void testSearch() {
        seqList1 seqList1 = new seqList1();

        seqList1.add(0, 1);
        seqList1.add(0, 2);
        seqList1.add(0, 3);
        seqList1.add(0, 4);
        System.out.println(seqList1.search(3));
    }

    public static void main(String[] args) {
        testSearch();
    }
}

