import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
    public String suit; // 花色
    public String rank; // 点数

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "(" + suit + " " + rank +")";
    }
}
public class Poker {
    public static final String[] SUITS = {"♥", "♠", "♣", "♦"};

    public static List<Card> buyPoker() {
        List<Card> poker = new ArrayList<>();
        // 负责构建四种花色
        for (int i = 0; i < 4; i++) {
            // 负责构建 2-10 点数
            for (int j = 2; j <= 10; j++) {
                poker.add(new Card(SUITS[i], j+""));
            }
            poker.add(new Card(SUITS[i], "J"));
            poker.add(new Card(SUITS[i], "Q"));
            poker.add(new Card(SUITS[i], "K"));
            poker.add(new Card(SUITS[i], "A"));
        }
        return poker;
    }

    public static void main(String[] args){
        // 1、创建一副牌, 顺序是整齐的
        System.out.println("创建一副牌");
        List<Card> poker = buyPoker();
        // 2、洗牌
        Collections.shuffle(poker);
        System.out.println(poker);
        // 3、发牌(三个人，5张牌)
        List<List<Card>> players = new ArrayList<>();
        // 表示三个玩家的三副牌
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        // 把 5 张牌分别发个 3 个玩家
        for (int cardIndex = 0; cardIndex < 5; cardIndex++) {
            for (int playerIndex = 0; playerIndex < 3; playerIndex++) {
                // players.get(playerIndex)找到一个player => 类型是 ArrayList<Card>
                // players.get(playerIndex).add() 相当于 player0.add()
                // add(poker.remove(0)

                // players.get(playerIndex).add(poker.remove(0));
                List<Card> playerCards = players.get(playerIndex);
                Card curCard = poker.remove(0);
                playerCards.add(curCard);
            }
        }
        // 4、输出玩家扑克
        System.out.println("玩家1：");
        System.out.println(players.get(0));
        System.out.println("玩家2：");
        System.out.println(players.get(1));
        System.out.println("玩家3：");
        System.out.println(players.get(2));
    }
}
