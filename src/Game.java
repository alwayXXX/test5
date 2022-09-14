import java.util.Random;

public class Game {
    int a1,a2,a3,b1,b2,b3;
    int[] sysNumber = new int[3];
    int[] userNumber = new int[3];

    public void game(){
        Random random = new Random();
        for (int i = 0; i < sysNumber.length; i++) {
            sysNumber[i] = (random.nextInt(6)+1);
        }

        for (int i = 0; i < userNumber.length; i++) {
            userNumber[i] = (random.nextInt(6)+1);
        }

        System.out.println("你的投掷点数是："+userNumber[0]+"\t"+userNumber[1]+"\t"+userNumber[2]);
        System.out.println("电脑的投掷点数是："+sysNumber[0]+"\t"+sysNumber[1]+"\t"+sysNumber[2]);

    }

    public void rule(int a,int b,int c){
        if (a == b&&b == c){
            System.out.println("豹子");
        }else if (a + 1 == b&&b + 1 == c){
            System.out.println("顺子");
        }else if (a == b ||b == c){
            System.out.println("对子");
        }else {
            System.out.println("普通");
        }
    }

    public int getA1() {
        return sysNumber[0];
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return sysNumber[1];
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getA3() {
        return sysNumber[2];
    }

    public void setA3(int a3) {
        this.a3 = a3;
    }

    public int getB1() {
        return userNumber[0];
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getB2() {
        return userNumber[1];
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public int getB3() {
        return userNumber[2];
    }

    public void setB3(int b3) {
        this.b3 = b3;
    }

}
