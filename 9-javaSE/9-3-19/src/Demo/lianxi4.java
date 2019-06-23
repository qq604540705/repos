package Demo;
//打印格式[1word#2word#3word]
public class lianxi4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
            System.out.print(arrayToString(arr));

    }
    public static String arrayToString(int[] arr){
        String array="[";
        for (int a = 0; a < arr.length; a++) {
            if(a==arr.length-1){
                array=array+arr[a]+"word]";
            }else {
                array=array+arr[a]+"word#";
            }
        }
            return array;
    }
}
