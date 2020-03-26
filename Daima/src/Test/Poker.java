package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Card{
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "["+this.rank+this.suit+"]";
    }
}
public class Poker {
    public static void main(String[] args) {
        //1,创建一副牌
        List<Card> poker=buyPoker();
//        2,洗牌
        Collections.shuffle(poker);
//        3,发牌，假设有三位玩家，每位玩家各五张牌
        List<List<Card>> players=new ArrayList<>();
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        for (int i=0;i<5;i++) {
            for (int j = 0; j < 3; j++) {
                List<Card> player = players.get(j);
                Card card = poker.remove(0);
                player.add(card);
            }
        }
//            玩家发牌结束，现在可以查看玩家手里的牌
         for (int i=0;i<3;i++){
             System.out.println("玩家"+i+":"+players.get(i));
        }
    }
    private static List<Card>buyPoker(){
            List<Card> poker=new ArrayList<>();
            String[]suits={"♥","♠","♣","♦"};
            for (int i=0;i<4;i++){
                for (int j=2;j<=10;j++){
                    poker. add(new Card(""+j,suits[i]));
                }
                poker. add(new Card("J",suits[i]));
                poker. add(new Card("Q",suits[i]));
                poker. add(new Card("K",suits[i]));
                poker. add(new Card("A" ,suits[i]));

            }
            return poker;
    }
}
