package part_01.Mar09.demo04;

public class Test {
    public static void main(String[] args) {
        Athlete_Basketball b = new Athlete_Basketball();
        b.setName("姚明");
        b.setAge(30);
        b.eat();
        b.study();
        System.out.println(b.getName() + "," + b.getAge());

        System.out.println("----------------");

        Coach_TableTennis tt = new Coach_TableTennis("不懂球的胖子", 45);
        tt.eat();
        tt.teach();
        tt.speakEnglish();
        System.out.println(tt.getName() + "," + tt.getAge());
    }
}
