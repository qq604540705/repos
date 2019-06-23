package demo;
/*用if ...else if...else来判断学生成绩在哪个区间
  100-90 优
  80-90 好
  70-80 良
  60-70 中
  60以下 差
* */
public class chengji {
    public static void main(String[] args){
//        定义一个成绩的变量
        int score=80;
//        判断成绩属于哪个区间
        if(score<=100 && 90<=score) {
            System.out.println("优");}
           else if(score<90 && 80<=score){
                System.out.println("好");
            }
            else if(score<80 && 70<=score){
                System.out.println("良");
            }
            else if(score<70 && 60<=score){
                System.out.println("中");
            }
            else if(score<60 && 0<=score){
                System.out.println("差");
            }

        else{
            System.out.println("数据输入有误");
        }
    }
}
