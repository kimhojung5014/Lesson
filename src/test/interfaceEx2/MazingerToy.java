package test.interfaceEx2;

public class MazingerToy implements Light,Missile,MoveArmLeg{
	@Override
	public void toyName() {
		System.out.println("마징가입니다.");
	}
	@Override
	public void moveArm() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}
	@Override
	public void missile() {
		System.out.println("미사일 발사 할 수 있습니다.");
	}
@Override
	public void light() {
		// TODO Auto-generated method stub
		
	}
}
