package part_01.Mar09.demo04;

public class Coach_TableTennis extends Coach implements SpeakEnglish {

    public Coach_TableTennis() {
    }

    public Coach_TableTennis(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃大白菜喝小米粥");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教授乒乓球技巧");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}
