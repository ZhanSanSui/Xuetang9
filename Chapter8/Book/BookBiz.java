package Chapter8.Book;

/**
 * 图书的业务类
 * 封装了对图书数组的增、删、改、查的方法
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 13:42
 * @copyright 老九学堂
 * @remark TODO
 */
public class BookBiz {

    /**
     * 销售书籍
     * @param book 要销售的图书对象
     * @return 如果销售成功，放回销售的数量；销售失败返回-1
     */
    public int sellBook(Book book){
        //1.判断图书的库存是否大于1
        if (!(book.getCount() > 1)){
            return -1;
        }
        //2.图书的库存-1
        book.setCount(book.getCount() - 1);
        //3.返回销售的数量
        return 1;
        }
}
