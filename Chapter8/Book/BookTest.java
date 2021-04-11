package Chapter8.Book;

/**
 * 图书测试类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 13:46
 * @copyright 老九学堂
 * @remark TODO
 */
public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("老九君醉酒谈Java", "123-321", 98.8 ,5);
        //实例化图书业务对象
        BookBiz bookBiz = new BookBiz();

        bookBiz.sellBook(book);

        System.out.println(book.getCount());

    }
}
