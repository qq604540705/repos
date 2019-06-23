package HomeWork;
/*第六题:
	需求：
	(1)定义一个int类型的一维数组，内容为{171,72,19,16,118,51,210,7,18}
	(2)求出该数组中满足要求的元素和。
  		要求：求和的元素的个位和十位不能包含7,并且只能为偶数。*/
public class Text6 {
    public static void main(String[] args) {
        int sum=0;
    int[]arr={171,72,19,16,118,51,210,7,18};
//    遍历数组里面所有的数
        for (int a = 0; a < arr.length; a++) {
//            提取所有数的个位,十位,百位
            int ge=arr[a]%10;
            int shi=arr[a]/10%10;
            int bai=arr[a]/10%10;
//            判断集合里的个位和十位不能包含7,并且为偶数的数
            if((ge!=7&shi!=7&bai!=7)&arr[a]%2==0){
//                求和所有的数
               sum+=arr[a];
            }
        }
        System.out.println("个位和十位不包含7,并且为偶数的数的和为"+sum);
    }
}
