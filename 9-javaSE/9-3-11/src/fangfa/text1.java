package fangfa;
//方法的定义以及使用方法
public class text1 {
//    首先需要一个主方法
    public static void main(String[] args){
//        调用方法的方法 方法名字();
//定义一个判断若用户输入1,则为天气好,其他数字为天气不好
        int a=1;
        if(a==1){
            tianqihao();
        }
        else{
            tianqibuhao();
        }
    }
//    定义方法用的语句是 public static void(){}
//    输出天气好的方法
    public static void tianqihao(){
        System.out.println("今天天气真好");
    }
//    输出天气不好的方法
    public static void tianqibuhao(){
        System.out.println("今天天气不好,有雨");
    }
}
