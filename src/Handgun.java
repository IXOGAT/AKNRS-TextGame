public class Handgun extends Gun
{
	public Handgun()
	{
		super.setCaliber(.22);
		super.setMaximumPenetratableArmor(2);
		super.setRechargeTime(.75);
		super.setAimTime(2);
	}
}
