import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều rộng ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật của bạn \n"+ rectangle.display());
        System.out.println("Chu vi là: "+ rectangle.getPerimeter());
        System.out.println("Bán kính là: "+ rectangle.getArea());
    }
}
