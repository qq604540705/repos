public class Demo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)
            {System.out.println(i);
            }
            long end = System.currentTimeMillis();
            System.out.println("共耗时毫秒：" + (end - start));
    }
}
