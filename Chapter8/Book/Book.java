package Chapter8.Book;

/**
 * 图书类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 13:34
 * @copyright 老九学堂
 * @remark TODO
 */
public class Book {
    /**
     * 图书的名称
     */
    private String name;

    /**
     * 图书的出版号
     */
    private String isbn;

    /**
     * 图书的价格
     */
    private double price;

    /**
     * 当前图书对象的库存量
     */
    private int count;

    /**
     * 当前图书是否可借
     */
    private boolean borrow;

    public Book(){}

    public Book(String name){
        this.setName(name);
    }

    public Book(String name, String isbn, double price, int count){
        setName(name);
        setIsbn(isbn);
        setPrice(price);
        setCount(count);
        setBorrow(borrow);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.out.println("抱歉没有这本书！");
        }else {
            this.price = price;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count < 0){
            count = 0;
        }else {
            this.count = count;
        }
    }

    public boolean isBorrow() {
        return borrow;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }
}
