/**
 *
 * 8 Cards
 */
package card_game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mahfuz
 */
public class game {

    String set[] = {"S_2", "S_3", "S_4", "S_5", "S_6", "S_7", "S_8", "S_9", "S_1", "S_J", "S_Q", "S_K", "S_A", "D_2", "D_3", "D_4", "D_5", "D_6", "D_7", "D_8", "D_9", "D_1", "D_J", "D_Q", "D_K", "D_A", "H_2", "H_3", "H_4", "H_5", "H_6", "H_7", "H_8", "H_9", "H_1", "H_J", "H_Q", "H_K", "H_A", "C_2", "C_3", "C_4", "C_5", "C_6", "C_7", "C_8", "C_9", "C_1", "C_J", "C_Q", "C_K", "C_A"};
    String user[] = new String[60];
    String pc[] = new String[60];
    String deck[] = new String[60];
    String stck[] = new String[60];
    int top = 0;
    int user_lenth = 8;
    int deck_lenth = 36;
    int pc_lenth = 8;

    public game() {
        start();

    }

    void start() {

        int p = 0, i;
        boolean flag[] = new boolean[53];

        for (i = 0; i < 53; i++) {
            flag[i] = true;
        }

        Random r = new Random();
        for (i = 0, p = 0; i < user_lenth; i++) {
            int x = r.nextInt(52);
            while (!flag[x]) {
                x = r.nextInt(52);
            }

            if (flag[x]) {
                user[p++] = set[x];
                flag[x] = false;
            }
        }


        for (i = 0, p = 0; i < pc_lenth; i++) {
            int x = r.nextInt(52);
            while (!flag[x]) {
                x = r.nextInt(52);
            }

            if (flag[x]) {
                pc[p++] = set[x];
                flag[x] = false;
            }
        }

        for (i = 0, p = 0; i < deck_lenth; i++) {
            int x = r.nextInt(52);
            while (!flag[x]) {
                x = r.nextInt(52);
            }

            if (flag[x]) {
                deck[p++] = set[x];
                flag[x] = false;
            }
        }

        for (i = 0; user[i] != null; i++) {
            System.out.println(user[i] + "\t" + pc[i]);
        }
        for (i = 0; i < deck_lenth; i++) {
            System.out.print(deck[i] + " ");
        }
        System.out.println();

        sort(user);
        sort(pc);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("User: " + user_lenth + " PC: " + pc_lenth + " Deck: " + deck_lenth);
        for (i = 0; user[i] != null; i++) {
            System.out.println(i + 1 + " " + user[i] + "\t" + pc[i]);
        }
        for (i = 0; i < deck_lenth; i++) {
            System.out.print(deck[i] + " ");
        }
        System.out.println();


        do {
            String stcktop;
            if (top == 0) {
                stcktop = "";
            } else {
                stcktop = stck[top - 1];
            }

            Board x = new Board(user, user_lenth, pc_lenth, stcktop);
            //Board y = new Board();
            //int yz = x.act;

            while (!human_move_gui(x.act)) {
                //wrong w = new wrong("Please Click on a right card",user, user_lenth, pc_lenth, stcktop , x.act);
//                if(x.act != 500)
//                {
//                    x = new Board(user, user_lenth, pc_lenth, stcktop);
//                }
            }
            pc_move_1();


            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("User: " + user_lenth + " PC: " + pc_lenth + " Deck: " + deck_lenth);
            int xyz;
            if (user_lenth >= pc_lenth) {
                xyz = user_lenth;
            } else {
                xyz = pc_lenth;
            }
            for (i = 0; i < xyz; i++) {
                System.out.println(i + 1 + " " + user[i] + "\t" + pc[i]);
            }
            for (i = 0; i < deck_lenth; i++) {
                System.out.print(deck[i] + " ");
            }
            System.out.println();
            System.out.println(stck[top - 1]);

            if (user_lenth == 0) {
                String dc = "Player Win";
                wrong dec = new wrong(dc);
                System.out.println("Player Win");
                break;
            } else if (pc_lenth == 0) {
                String dc = "Computer Win";
                wrong dec = new wrong(dc);
                System.out.println("Computer Win");
                break;
            } else if (deck_lenth == 0) {
                String dc = "Draw";
                wrong dec = new wrong(dc);
                System.out.println("Draw");
                break;
            }

            //yz = 500;


        } while (pc_lenth > 0 || user_lenth > 0 || deck_lenth > 0);
    }

    private void sort(String[] user) {

        String temp = "";
        int i, j;
        for (i = 1; user[i] != null; i++) {
            int flagk = 0;
            for (j = i - 1; j >= 0 && flagk == 0; j--) {
                flagk = 1;
                int a, b;
                if (user[j].compareTo(user[j + 1]) < 1) {
                    temp = user[j + 1];
                    user[j + 1] = user[j];
                    user[j] = temp;
                    flagk = 0;
                }
            }
        }

    }

    void push(String x) {
        stck[top++] = x;
    }

    String pop() {
        return stck[--top];
    }

    private int delete(String[] player, int item, int player_lenth) {

        int i;
        for (i = item; i < player_lenth; i++) {
            player[i] = player[i + 1];
        }
        return player_lenth - 1;
    }

    private void pc_move() {
        int i, co = 0;
        if (top == 0) {
            push(pc[0]);
            pc_lenth = delete(pc, 0, pc_lenth);
            return;
        } else {
            for (i = 0; i < pc_lenth; i++) {
                if ((stck[top - 1].startsWith("H") && pc[i].startsWith("H")) || (stck[top - 1].startsWith("S") && pc[i].startsWith("S")) || (stck[top - 1].startsWith("C") && pc[i].startsWith("C")) || (stck[top - 1].startsWith("D") && pc[i].startsWith("D"))) {
                    push(pc[i]);
                    pc_lenth = delete(pc, i, pc_lenth);
                    return;
                } else {
                    co = 1;
                }
            }

            if (co == 1 && i == pc_lenth) {
                for (i = 0; i < pc_lenth; i++) {
                    if (((stck[top - 1].startsWith("H") || stck[top - 1].startsWith("D")) && (pc[i].startsWith("S") || pc[i].startsWith("C"))) || ((stck[top - 1].startsWith("S") || stck[top - 1].startsWith("C")) && (pc[i].startsWith("H") || pc[i].startsWith("D")))) {
                        String pq = stck[top - 1].substring(2);

                        if (pc[i].endsWith(pq)) {
                            push(pc[i]);
                            pc_lenth = delete(pc, i, pc_lenth);
                            return;
                        }
                    } else {

                        if (deck_lenth != 0) {
                            deck_lenth = deck_lenth - 1;
                            pc[pc_lenth] = deck[deck_lenth];
                            deck[deck_lenth] = null;
                            pc_lenth = pc_lenth + 1;
                            sort(pc);
                            System.out.println("Computer Pick");
                            return;
                        } else {
                            System.out.println("Deck Empty");
                        }
                    }

                }
            }

        }


    }

    private void pc_move_1() {
        int i, co = 0, po = 0;
        if (top == 0) {
            push(pc[0]);
            pc_lenth = delete(pc, 0, pc_lenth);
            return;
        } else {
            String st_top, en_top, st_hd, en_hd;
            char a = (stck[top - 1].charAt(0));
            char b = stck[top - 1].charAt(2);
            st_top = String.valueOf(a);
            en_top = String.valueOf(b);
            for (i = 0; i < pc_lenth; i++) {
                if (pc[i].startsWith(st_top)) {
                    push(pc[i]);
                    pc_lenth = delete(pc, i, pc_lenth);
                    return;
                } else {
                    co = 1;
                }
            }

            if (co == 1) {
                for (i = 0; i < pc_lenth; i++) {
                    a = (pc[i].charAt(0));
                    b = pc[i].charAt(2);
                    st_hd = String.valueOf(a);
                    en_hd = String.valueOf(b);
                    String pq = stck[top - 1].substring(2);

                    if (pc[i].endsWith(pq) && (  (("H".equals(st_top) || "D".equals(st_top)) && ("S".equals(st_hd) || "C".equals(st_hd))) || (("S".equals(st_top) || "C".equals(st_top)) && ("H".equals(st_hd) || "D".equals(st_hd))) ) ) {

                        
                        //if (pc[i].endsWith(pq)) {
                            push(pc[i]);
                            pc_lenth = delete(pc, i, pc_lenth);
                            return;
                        //}
                    } else {
                        po = 1;
                    }

                }

                if (po == 1) {

                    if (deck_lenth != 0) {
                        deck_lenth = deck_lenth - 1;
                        pc[pc_lenth] = deck[deck_lenth];
                        deck[deck_lenth] = null;
                        pc_lenth = pc_lenth + 1;
                        sort(pc);
                        System.out.println("Computer Pick");
                        return;
                    } else {
                        System.out.println("Deck Empty");
                    }
                }
            }

        }
    }

    private int pick(String[] player, int player_lenth) {

        player[player_lenth] = deck[deck_lenth - 1];
        deck[deck_lenth - 1] = null;
        deck_lenth = deck_lenth - 1;
        player[player_lenth + 1] = null;
        player_lenth = player_lenth + 1;
        sort(player);

        return player_lenth;
    }

    public boolean human_move_gui(int n) {

        int i = n;
        String st_ed = null;
        //if(i!=20 && ((user[i - 1].endsWith(st_ed) && ((stck[top - 1].startsWith("H") || stck[top - 1].startsWith("D")) && (user[i - 1].startsWith("S") || user[i - 1].startsWith("C")) || (stck[top - 1].startsWith("S") || stck[top - 1].startsWith("C")) && (user[i - 1].startsWith("H") || user[i - 1].startsWith("D")))) || ((stck[top - 1].startsWith("H") && user[i - 1].startsWith("H")) || (stck[top - 1].startsWith("S") && user[i - 1].startsWith("S")) || (stck[top - 1].startsWith("C") && user[i - 1].startsWith("C")) || (stck[top - 1].startsWith("D") && user[i - 1].startsWith("D")))) )
        if (i == 20) {
            if (deck_lenth != 0) {
                System.out.println("Human Pick");
                deck_lenth = deck_lenth - 1;
                user[user_lenth] = deck[deck_lenth];
                deck[deck_lenth] = null;
                user_lenth = user_lenth + 1;
                sort(user);
                return true;
            }
        } else if (top > 0 && i < user_lenth) {
            st_ed = stck[top - 1].substring(2);
            if ((user[i - 1].endsWith(st_ed) && ((stck[top - 1].startsWith("H") || stck[top - 1].startsWith("D")) && (user[i - 1].startsWith("S") || user[i - 1].startsWith("C")) || (stck[top - 1].startsWith("S") || stck[top - 1].startsWith("C")) && (user[i - 1].startsWith("H") || user[i - 1].startsWith("D")))) || ((stck[top - 1].startsWith("H") && user[i - 1].startsWith("H")) || (stck[top - 1].startsWith("S") && user[i - 1].startsWith("S")) || (stck[top - 1].startsWith("C") && user[i - 1].startsWith("C")) || (stck[top - 1].startsWith("D") && user[i - 1].startsWith("D")))) {
                push(user[i - 1]);
                user_lenth = delete(user, i - 1, user_lenth);
                return true;
            } else {
                return false;
            }
        } else {
            if (i > 0 && i <= user_lenth) {
                push(user[i - 1]);
                user_lenth = delete(user, i - 1, user_lenth);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private void human_move() {

        boolean valid = false;
        int i;
        String st_ed = null;
        while (valid == false) {
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            if (top != 0) {
                st_ed = stck[top - 1].substring(2);

                if (i == 20) {
                    if (deck_lenth != 0) {
                        System.out.println("Human Pick");
                        deck_lenth = deck_lenth - 1;
                        user[user_lenth] = deck[deck_lenth];
                        deck[deck_lenth] = null;
                        user_lenth = user_lenth + 1;
                        sort(user);
                        valid = true;
                    } else {
                        System.out.println("Deck Empty");
                    }

                } else if ((user[i - 1].endsWith(st_ed) && ((stck[top - 1].startsWith("H") || stck[top - 1].startsWith("D")) && (user[i - 1].startsWith("S") || user[i - 1].startsWith("C")) || (stck[top - 1].startsWith("S") || stck[top - 1].startsWith("C")) && (user[i - 1].startsWith("H") || user[i - 1].startsWith("D")))) || ((stck[top - 1].startsWith("H") && user[i - 1].startsWith("H")) || (stck[top - 1].startsWith("S") && user[i - 1].startsWith("S")) || (stck[top - 1].startsWith("C") && user[i - 1].startsWith("C")) || (stck[top - 1].startsWith("D") && user[i - 1].startsWith("D")))) {
                    push(user[i - 1]);
                    user_lenth = delete(user, i - 1, user_lenth);
                    valid = true;
                } else {

                    System.out.println("Please Enter a valid Number");

                }

            } else {
                if (i == 20) {
                    if (deck_lenth != 0) {
                        System.out.println("Human Pick");
                        deck_lenth = deck_lenth - 1;
                        user[user_lenth] = deck[deck_lenth];
                        deck[deck_lenth] = null;
                        user_lenth = user_lenth + 1;
                        sort(user);
                        valid = true;
                    } else {
                        System.out.println("Deck Empty");
                    }

                }
                if (i < 1 && i >= user_lenth) {
                    System.out.print("Please Enter a valid Number");
                } else {
                    push(user[i - 1]);
                    user_lenth = delete(user, i - 1, user_lenth);
                    valid = true;


                }
            }


        }



    }
}
