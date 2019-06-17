package Feb._22_23;

import java.util.Scanner;

public class Demo02_SwitchDemo_quarterly {
    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner sc = new Scanner(System.in);
        int season = sc.nextInt();

        /*  case语句最关键的判断是break，若没有break，则在不判断
            下一个case值得情况下进入下一个case块，一直往下穿透的最
            后的default   */
        switch (season) {
            //case穿透
            case 1:
            case 2:
            case 12:
                System.out.println(season + "月是冬季");
                break;
            //case穿透
            case 3:
            case 4:
            case 5:
                System.out.println(season + "月是春季");
                break;
            //case穿透
            case 6:
            case 7:
            case 8:
                System.out.println(season + "月是夏季");
                break;
            //case穿透
            case 9:
            case 10:
            case 11:
                System.out.println(season + "月是秋季");
                break;
            //default语句可以放在任何地方，总会在最后执行！！
            default:
                System.out.println("输入的月份有误！");
                //当default在最后是break可以省略
                break;
        }

        /*  switch (season){
                //穿透作用按顺序从上到下，直到遇到break为止！！！
                default :
                    System.out.println("横看成岭侧成峰，");
                case 1:
                    System.out.println("远近高低各不同。");
                case 2:
                    System.out.println("不识庐山真面目，");
                case 3:
                    System.out.println("只缘身在此山中。");
            }   */

    }
}
