package enum_org;

public class EnumExample {
//-------------------------------------------------------------------------------------------	
	public enum Season{WINTER,SPRING,SUMMER,FALL};
	
	
	public enum ProdColor{RED,BLUE,GREEN,YELLOW,ORANGE};
	
	public enum DaysInWeek{MONDAY,TUESDAY,WEDNESDAY,THEURSDAY,FRIDAY,SATURDAY,SUNDAY};
//-------------------------------------------------------------------------------------------	
	public String name;
	
	public static void main(String[] args) {

//-------------------------------------------------------------------------------------------
		for(Season s:Season.values()){
			
			System.out.println(s);
		}

		for(ProdColor p:ProdColor.values()){
			System.out.println(p);
		}
		for(DaysInWeek d:DaysInWeek.values()){
			
			System.out.println(d);
		}	
	System.out.println("The index of Winter is " + Season.valueOf("WINTER").ordinal());
	System.out.println("The index of Winter is " + Season.valueOf("SUMMER").ordinal());	
	System.out.println("The index of Monday is " + DaysInWeek.valueOf("MONDAY").ordinal());	
	}
}
