package Week1;
/*
integer credit()
input credit
return credit;

void badgeCheck (integer n){
    if n>=7000
        output TeraLeader
    else if n>=6000 && n<7000
        output GigaLeader
    else if n>=4500 && n<6000
        output MegaLeader
    else if n<4500
        output RisingStar
}

start
call badgeCheck(credit())




*/

import java.util.*;

class Leader {

    public static int credit() {
        Scanner sc = new Scanner(System.in);
        {
            int c = sc.nextInt();
            return c;
        }

    }

    public static void badgeCheck(int n) {
        if (n >= 7000) {
            System.out.println("TeraLeader");
        } else if (n >= 6000 && n < 7000) {
            System.out.println("GigaLeader");
        } else if (n >= 4500 && n < 6000) {
            System.out.println("MegaLeader");

        } else if (n < 4500) {
            System.out.println("rising star");
        }
    }

    public static void main(String[] args) {
        badgeCheck(credit());
    }
}