package enum_org;

public class Runner {

	public static void main(String[] args) {
        double earthWeight = Double.parseDouble("175");
        double mass = earthWeight/Planet1.EARTH.surfaceGravity();
        for(Planet1 p : Planet1.values()) {
            System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
        }
    }
}