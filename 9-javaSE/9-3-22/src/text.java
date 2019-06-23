public class text {
    public static void main(String[] args) {
        ojb oj = new ojb() {
            @Override
            public void methon(double a, double b) {
                System.out.println("a+b等于" + (a + b));
            }
        };
        oj.methon(1.5, 3.5);
    }


    interface ojb {
        public abstract void methon(double a, double b);
    }
}
