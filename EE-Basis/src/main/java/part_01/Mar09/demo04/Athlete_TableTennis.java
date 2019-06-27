package part_01.Mar09.demo04;

public class Athlete_TableTennis extends Athlete implements SpeakEnglish {

    public Athlete_TableTennis() {
    }

    public Athlete_TableTennis(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃大白菜喝小米粥");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习击球技巧");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
