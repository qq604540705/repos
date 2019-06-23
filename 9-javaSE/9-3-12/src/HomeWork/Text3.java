package HomeWork;
/*第三题:
        1.定义一个包含五个元素的int类型的数组。数组元素自己给出
        2.将数组当中数据小于10的打印出来
        如果存在，则打印出来，具体的数据
        如果不存在，则打印出来，未找到合适的数据*/
public class Text3 {
    public static void main(String[] args) {
//        定义一个包含五个元素的int类型的数组
        int[]arr={5,7,9,10,12};
        for (int a = 0; a < arr.length; a++) {
            if(arr[a]<10){
//        将数组当中数据小于10的打印出来
                System.out.println(arr[a]);
            }
        }
    }
}
