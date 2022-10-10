package test.interfaceEx2;

public class AirPlaneToy implements Light,Missile,MoveArmLeg{
	@Override
	public void toyName() {
		System.out.println("비행기입니다.");
	}
	@Override
	public void moveArm() {
	
	}
	@Override
	public void missile() {
		System.out.println("미사일 발사가 가능합니다.");
	}
@Override
	public void light() {
		System.out.println("불빛 발사가 가능합니다.");
	}
}
