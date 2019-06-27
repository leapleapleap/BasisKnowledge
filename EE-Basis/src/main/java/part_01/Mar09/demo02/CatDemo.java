package part_01.Mar09.demo02;

public class CatDemo {
    public static void main(String[] args) {

        //多态
        CatInterface j = new Cat();
        j.jump();
        j.catchFish();
        j.speak();

    }
}
