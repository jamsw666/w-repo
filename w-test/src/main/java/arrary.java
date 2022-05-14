import java.util.Scanner;

public class arrary {


    public static void main(String[] args) {


        int[] hens = new int[5];

        double score[] = new double[6];
        for (int i = 0; i <score.length ; i++) {

            System.out.println("请输入第" + (i+1)+ "个元素");
            Scanner myscanner = new Scanner(System.in);
            score[i] = myscanner.nextDouble();}
        System.out.println("输出结果=============");
        for (int j = 0; j < score.length; j++) {
            System.out.println("第" + (j+1)+ "个元素的值" + score[j]);
        }

        scaaner();
    }

    static void scaaner() {
        Scanner myscanner  = new Scanner(System.in);
        int[] arr = {1,2,3};
        do {
            int[] arrnew = new int[arr.length + 1];

            for (int i = 0; i < arr.length; i++) {
                arrnew[i] = arr[i];
            }
            System.out.println("请输入你要添加的值");
            int addNum = myscanner.nextInt();

            arrnew[arrnew.length - 1] = addNum;
            arr = arrnew;

            System.out.println("扩容后的数据元素清单=======");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("是否还要添加 y/n");
            char key = myscanner.next().charAt(0);
            if (key == 'n'){
                break;
            }

        }while(true);
        System.out.println("你退出了添加");
    }

}


