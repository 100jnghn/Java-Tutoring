import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        System.out.println("종훈마켓에 온 것을 환영합니다.~!~!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("상품을 등록해주세요.>> ");
        String goods = scanner.next();

        System.out.print(goods + "가격을 입력해주세요.>> ");
        int price = scanner.nextInt();

        System.out.print(goods + "할인율을 입력해주세요.>> ");
        float discount=scanner.nextFloat();

        price=(int)(price - price*(discount/100));

        System.out.println(goods + "의 가격은 " + price + "원 입니다.");
        scanner.close();
    }
}
