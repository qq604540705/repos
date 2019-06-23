package IF;
//根据月份判断这个月有多少天
public class Ifday {
    public static void main(String[] args) {
        int month;
        month=2;
        if (month==1|month==3|month==5|month==7|month==8|month==10|month==12) {
            System.out.println("当月日期为31天");
        }
        else if(month==2){
            System.out.println("当月日期为28天");
        }
        else {
            System.out.println("当月日期为30天");
        }
    }

}
