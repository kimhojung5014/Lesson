package test.interfaceEx2;

public class BearToy implements Light,Missile,MoveArmLeg{
	@Override
	public void toyName() {
		System.out.println("곰돌이입니다.");
	}
	@Override
	public void moveArm() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}
	@Override
	public void missile() {
		// TODO Auto-generated method stub
		
	}
@Override
	public void light() {
		// TODO Auto-generated method stub
		
	}
}
