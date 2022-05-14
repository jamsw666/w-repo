import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        Scanner Myscanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            name = Myscanner.next();
            System.out.println("请输入用密码");
            passwd = Myscanner.next();
            if ("丁真".equals(name) && "666".equals(passwd)) {
                System.out.println("恭喜你，登录成功");
                break;
            }
            else{
                chance--;
                System.out.println("你还有" + chance + "登录机会");
            }
            System.out.println("用户或密码不正确");
        }


    }










}
