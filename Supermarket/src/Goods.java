public class Goods {
    public static int index=0;
    public int id;
    private String name;
    public String pDate;
    public int price;
    public float discount;

    Goods() {
        this(0,"비어있음","0000/00/00",0,0);
    }

    Goods(int id, String name, int price){
        this(id,name,"0000/00/00",price,0);
    }

    Goods(int id, String name, String pDate, int price, float discount) {
        this.id = id;
        this.name=name;
        this.pDate=pDate;
        this.price=price;
        this.discount=discount;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void inform() {
        System.out.println("상품번호: " + this.id + " | 상품명: " + name + " | 가격: " + price);
        System.out.println("생산일자: " + pDate + " | 할인율: " + discount);
        System.out.println("----------------------------------------------------------------------");
    }

    public int discountedPrice() {
        return (int) (price - price * (discount / 100));
    }
}
