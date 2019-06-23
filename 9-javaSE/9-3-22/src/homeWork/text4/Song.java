package homeWork.text4;
/*			③定义类Song
				   包含空参、满参构造和以下成员变量
					歌手 singer（String 型）
					歌名 name（ String 型）
					生成所有成员变量set/get方法*/
public class Song {
    String singer;
    String name;

    public Song() {
    }

    public Song(String singer, String name) {
        this.singer = singer;
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
