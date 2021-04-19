package server.java;

import java.util.Scanner;

/**
 * @description：
 * @auther lurongrong
 * @create 2021-04-18 20:57
 */
public class FamilyAccount {
    public static void main(String[] args) {
        String details = "收支\t账户金额\t收支金额\t说     明\n";
        int balance = 10000;

        boolean loopFlag = true;
        do {
            System.out.println("\n---------------家庭收支记账软件------------------------------\n");
            System.out.println("                 1 收支明细");
            System.out.println("                 2 登记收入");
            System.out.println("                 3 登记支出");
            System.out.println("                 4 退    出\n");
            System.out.print("                  请选择(1-4):");

            char key = Utility.readMenuSelection();
            System.out.println();
            switch (key){
                case '1':
                    System.out.println("---------------当前收支明细---------------");
                    System.out.println(details);
                    System.out.println("--------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收支金额：");
                    int amount1 = Utility.readNumber();
                    System.out.print("本次收支说明：");
                    String desc1 = Utility.readString();

                    balance += amount1;
                    details += "收入\t" + balance + "\t\t" + amount1 + "\t\t" + "\n";
                    System.out.println("-------------------登记完成------------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int amount2 = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String desc2 = Utility.readString();
                    balance -= amount2;
                    details += "支出\t" + balance + "\t\t" + amount2 + "\t\t" + "\n";
                    System.out.println("---------------登记完成----------------");
                    break;
                case '4':
                    System.out.print("确定是否退出(Y/N)：");
                    char yn = Utility.readConfirmSelection();
                    if (yn == 'Y') loopFlag = false;
                    break;
            }
        }while (loopFlag);
    }
}
