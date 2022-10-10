package test.interfaceEx2;

public class ToyMain {

	public static void main(String[] args) {
		Toy[] toys = {new BearToy(),new MazingerToy(),new AirPlaneToy()};
		
		for(Toy toy:toys) {
			if(toy instanceof BearToy) {
				BearToy toy2 = (BearToy)toy;
				toy2.toyName();
				toy2.moveArm();
				toy2.missile();
				toy2.light();
				System.out.println("********************");
			}
			if(toy instanceof MazingerToy) {
				MazingerToy toy2 = (MazingerToy)toy;
				toy2.toyName();
				toy2.moveArm();
				toy2.missile();
				toy2.light();
				System.out.println("********************");
			}
			if(toy instanceof AirPlaneToy) {
				AirPlaneToy toy2 = (AirPlaneToy)toy;
				toy2.toyName();
				toy2.moveArm();
				toy2.missile();
				toy2.light();
				System.out.println("********************");
			}
		}
	}

}
