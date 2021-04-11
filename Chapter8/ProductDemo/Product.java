package Chapter8.ProductDemo;

/**
 * 商品实体类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 15:04
 * @copyright 老九学堂
 * @remark TODO
 */
public class Product {
    /**
     * 商品的名称
     */
    private String name;

    /**
     * 商品的单价
     */
    private double price;

    /**
     * 商品的描述
     */
    private String description;

    /**
     * 商品的服务
     */
    private String[] services;

    public Product(){}

    public Product(String name, String description){
        setName(name);
        setDescription(description);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }
}
