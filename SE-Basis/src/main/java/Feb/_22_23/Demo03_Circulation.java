package Feb._22_23;

public class Demo03_Circulation {
    public static void main(String[] args) {
        //for循环
        System.out.println("--- for循环 ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloWorld!" + (i + 1));
        }

        //while循环
        System.out.println("--- while循环 ---");
        int i = 0;
        while (i < 5) {
            System.out.println("HelloWorld!" + (i + 1));
            i++;
        }

        //do...while循环
        System.out.println("--- do...while循环 ---");
        int j = 0;
        do {
            System.out.println("HelloWorld!" + ++j);
        } while (j <= 4);
    }
}
