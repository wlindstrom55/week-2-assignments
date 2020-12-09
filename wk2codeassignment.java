
public class wk2codeassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean variables
		boolean isHotOutside = false;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		
		//other variables
		double costOfMilk = 5.99;
		double moneyInWallet = 20.54;
		int thirstLevel = 9;
		
		//scenario variables
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && (moneyInWallet >= (costOfMilk * 2));
		
		
		//print line
		System.out.println(shouldBuyIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);		
	}
}
