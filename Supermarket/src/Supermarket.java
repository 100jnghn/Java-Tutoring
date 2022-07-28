import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        System.out.println("준성마켓 온 것을 환영합니다~~!");
        Scanner scanner = new Scanner(System.in);
        Goods[] goodsArr = new Goods[5];
        int index = 0;
        boolean onOff = true;

        for(int n = 0; n<goodsArr.length; n++) {
            goodsArr[n] = new Goods();
        }

        while (onOff) {

            System.out.println("1. 상품등록 | 2. 상품조회 | 3. 계산 | 4. 사용종료");
            System.out.print("메뉴를 선택해주세요.>> ");
            try {
                int menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                        System.out.print("상품명을 입력해주세요.>> ");
                        String name = scanner.next();
                        System.out.print("생산일자를 입력해주세요.>> ");
                        String pDate=scanner.next();
                        System.out.print("가격을 입력해주세요.>> ");
                        int price = scanner.nextInt();
                        if(pDate.equals("0")){
                            goodsArr[index%5]=new Goods(index,name,price);
                        }
                        else {
                            System.out.print("할인율을 입력해주세요.>> ");
                            float discount = scanner.nextFloat();
                            goodsArr[index%5]=new Goods(index,name,pDate,price,discount);
                        }
                        index++;
                        break;
                    case 2:
                        System.out.println("----------------------------------------------------------------------");
                        for(int n=0; n<goodsArr.length; n++){
                            goodsArr[n].inform();
                        }
                        break;
                    case 3:
                        System.out.print("상품번호를 입력해주세요.>> ");
                        int i = scanner.nextInt();
                        System.out.println(goodsArr[i].name + "의 가격은 " + goodsArr[i].discountedPrice() + "원입니다.");
                        break;
                    case 4:
                        System.out.println("이용해주셔서 감사합니다.");
                        onOff = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("형식에 맞지 않습니다.");
                scanner.next();
            }
        }
    }
}