import java.security.SecureRandom;

public class DeckOfCard {
    private static SecureRandom random = new SecureRandom();
    private static final int NUMBER_CARD = 52; // 撲克牌張數
    private Card[] deck = new Card[NUMBER_CARD];// 宣告Card類別的陣列，存放牌每張排有兩個屬性，點數和花色
    private int currentCard = 0;

    public DeckOfCard() {// default constructor
        String[] face = { "Ace", "Duce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        String[] suit = { "Heart", "Diamonds", "Clubs", "Spades" };

        // 按照順序存到deck[]裡
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(face[i % 13], suit[i / 13]);
        }
    }

    public void shuffle() {// 洗牌
        currentCard = 0;
        for (int first_index = 0; first_index < deck.length; first_index++) {
            int second_index = random.nextInt(NUMBER_CARD);// deck的index從0~51

            // 從第一張牌開始，和剩下的51張牌做交換
            Card temp = deck[first_index];
            deck[first_index] = deck[second_index];
            deck[second_index] = temp;
        }
    }

    public Card dealCard() {// 發牌
        if (currentCard < NUMBER_CARD) {
            return deck[currentCard++];// 先發牌currentCard才再加一
        } else {
            System.out.println("Deck of card was empty!");
            return null;
        }

    }

    // 傳入點數字串，轉為index(0~12)
    private int getFaceIndex(String hand) {
        String[] faces = { "Ace", "Duce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        for (int i = 0; i < faces.length; i++) {
            if (faces[i] == hand) {
                return i;
            }
        }
        return -1;
    }

    // 傳入手牌，紀錄點數個數，回傳存放點數格數的陣列
    private int[] countFace(Card[] hand) {
        int[] FaceNum = new int[13]; // 紀錄點數的個數
        int index = 0;
        for (Card card : hand) {
            index = getFaceIndex(card.getFace());// 從五張手牌開始找，再從字串轉成index
            FaceNum[index]++;
        }
        return FaceNum;
    }

    // 判斷有無一對
    public boolean isPair(Card[] hand) {
        int[] countPair = countFace(hand);
        int pair = 0;
        for (int faceNum : countPair) {
            if (faceNum == 2) {
                pair++;
            }
        }
        return (pair == 1);
    }

    // 判斷有無兩對
    public boolean isTowPair(Card[] hand) {
        int[] countPair = countFace(hand);
        int pair = 0;
        for (int faceNum : countPair) {
            if (faceNum == 2) {
                pair++;
            }
        }
        return (pair == 2);
    }

    // 判斷有無三條
    public boolean isThreeOfAKind(Card[] hand) {
        int[] countThreeOfAKind = countFace(hand);
        for (int faceNum : countThreeOfAKind) {
            if (faceNum == 3) {
                return true;
            }
        }
        return false;
    }

    // 判斷有無鐵枝
    public boolean isFourOfAKind(Card[] hand) {
        int[] countFourOfAKind = countFace(hand);
        for (int faceNum : countFourOfAKind) {
            if (faceNum == 4) {
                return true;
            }
        }
        return false;
    }

    // 判斷是否同花
    public boolean isFlush(Card[] hand) {
        String firstSuit = hand[0].getSuit();
        for (int i = 1; i < hand.length; i++) {
            if (firstSuit != hand[i].getSuit()) {
                return false;
            }
        }
        return true;
    }

    // 判斷有無順子
    public boolean isStraight(Card[] hand) {
        int[] checkStraight = countFace(hand);
        int firstNumIndex = 0;

        for (int i = 0; i < checkStraight.length; i++) {
            if (checkStraight[i] > 0) { // 找到順子的第一個點數的index
                firstNumIndex = i;
                break;
            }
        }
        // 檢查接下來四張牌是否連續
        for (int i = 1; i < 5; i++) {
            // 判斷不成立的情況
            if (checkStraight[firstNumIndex + i] < 0 || firstNumIndex + i > checkStraight.length) {
                // 檢查10,J,Q,K,A這組順子
                if (i == 4 && firstNumIndex == 9) {
                    return (checkStraight[10] == 1 && checkStraight[11] == 1 && checkStraight[12] == 1
                            && checkStraight[0] == 1);
                }
                return false;
            }
        }
        return true;
    }

    // 判斷有無葫蘆
    public boolean isFullHouse(Card[] hand) {
        int[] checkFullHouse = countFace(hand);
        boolean hasThree = false;
        boolean hasTwo = false;

        for (int faceNum : checkFullHouse) {
            if (faceNum == 3) {
                return true;
            }
            if (faceNum == 2) {
                return true;
            }
        }
        return false;
    }

}
