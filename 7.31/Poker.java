public class Poker {
    public static void main(String[] args) {
        DeckOfCard deck = new DeckOfCard();
        deck.shuffle();// 洗牌
        System.out.printf("Shuffle finish%n");

        Card[] hand1 = new Card[5];
        Card[] hand2 = new Card[5];
        for (int i = 0; i < 5; i++) {// 每個手牌發五張
            hand1[i] = deck.dealCard();
            hand2[i] = deck.dealCard();
        }

        int rank1 = 0;
        int rank2 = 0;
        // 判斷牌型後比較誰的好
        System.out.printf("%nHand1 type: %n");
        rank1 = CheckHand(deck, hand1);
        System.out.printf("%nHand2 type: %n");
        rank2 = CheckHand(deck, hand2);

        if (rank1 > rank2) {
            System.out.printf("Hand1 is better than hand2.");
        }
        if (rank2 > rank1) {
            System.out.printf("Hand2 is better than hand1.");
        } else {
            System.out.printf("Hand1 and hand2 is same type.");
        }
    }

    public static int CheckHand(DeckOfCard deck, Card[] hand) {
        int rank = 0;
        if (deck.isPair(hand)) {
            System.out.printf("A Pair%n");
            rank = 1;
        }

        if (deck.isTowPair(hand)) {
            System.out.printf("Two Pair%n");
            rank = 2;
        }

        if (deck.isThreeOfAKind(hand)) {
            System.out.printf("Three of a kind%n");
            rank = 3;
        }
        if (deck.isFourOfAKind(hand)) {
            System.out.printf("Four of a kind%n");
            rank = 4;
        }
        if (deck.isFlush(hand)) {
            System.out.printf("A Flush%n");
            rank = 5;
        }

        if (deck.isStraight(hand)) {
            System.out.printf("A Straight%n");
            rank = 6;
        }
        if (deck.isFullHouse(hand)) {
            System.out.printf("A Full House%n");
            rank = 7;
        }
        return rank;
    }
}