public class IT24103825Lab5Q3 {
    public static void main(String[] args) {
       
		final double ROOM_CHARGE_PER_DAY = 48000.0;
		final double DISCOUNT_3_TO_4_DAYS = 0.1;
		final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
		
		int startDate,endDate,numberOfDaysReserved;
		double totalAmountBeforeDiscount,discountAmount,totalAmountToBePaid;
		
		double discountRate = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Start Date(1-31): ");
		startDate = input.nextInt();
		
		System.out.print("Enter End Date(1-31): ");
		endDate = input.nextInt();
		if(startDate<1 || startDate>31|| endDate<1 || endDate>31) {
			System.out.println("Error: days must be between 1 and 31");
			return;
		}
		numberOfDaysReserved = endDate-startDate;
		if (numberOfDaysReserved <= 3) {
            discountRate = 0;
        } else if (numberOfDaysReserved <= 5) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (numberOfDaysReserved <= 10) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        totalAmountBeforeDiscount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
        discountAmount = totalAmountBeforeDiscount * discountRate;
        totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;

        System.out.println("Total amount to be paid", totalAmountToBePaid);