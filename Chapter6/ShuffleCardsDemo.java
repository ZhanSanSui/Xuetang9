package Chapter6;

/**
 * 模拟洗牌的过程（52张牌）->重点掌握逻辑思维，再实现功能
 * 提示：
 * 1.所有牌可以用一个名为cards的数组表示
 * 2.52张牌只有4种花色（红心，方片，黑桃，梅花）和13种牌面（1-13）
 * 原理：
 * 1.数组下标[0]-[51]结束，数组元素可以分为4组，每13个元素做成一组->%13就是牌面 /13就是花色（重点理解）
 * 2.洗牌的过程-就是随机的过程
 * @author：Wen
 * @version：1.0
 * @date：2021/4/1 22:25
 * @copyright 老九学堂
 * @remark TODO
 */
public class ShuffleCardsDemo {
    public static void main(String[] args) {
        final int N = 52;
        //52张牌
        int[] cards = new int[N];

        //初始化每一张牌
        for (int i = 0; i < cards.length; i++) {
            cards[i] = i; //牌面与循环变量的值一致，0-51之间
        }

        //牌的花色数组
        String[] cardColors = {"黑桃","红心","方块","梅花"};

        //牌面的数组
        String[] cardValues = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        //洗牌：随机生成一个0-51的之间的数字newIndex,cards[i]和cards[rIndex]元素相交换
        System.out.println("洗牌前：");
        for (int i = 0; i < cards.length; i++) {
            //System.out.print(cards[i]);
            System.out.printf("%s%s", cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
            if ((i + 1) % 13 ==0){
                System.out.println();
            }else {
                System.out.print(",");
            }
        }

        //生成0-51的随机数组
        for (int i = 0; i < cards.length; i++) {
            //0-51之间的随机数字
            int newIndex = (int)(Math.random() * N);
            int temp = cards[i];
            cards[i] = cards[newIndex];
            cards[newIndex] = temp;
        }

        System.out.println("洗牌后：");
        for (int i = 0; i < cards.length; i++) {
            //System.out.print(cards[i]);
            System.out.printf("%s%s", cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
            if ((i + 1) % 13 ==0){
                System.out.println();
            }else {
                System.out.print(",");
            }
        }
    }
}
