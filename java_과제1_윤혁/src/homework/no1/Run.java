package homework.no1;

public class Run {
	public static void main(String[] args) {
			Product product1 = new Product("다이슨","V10","빨간색",960000);
			Product product2 = new Product("Dyson","V10","RED",960000);

			System.out.println(product1.equals(product2));
						
}
}
