package net.offllneplayer.opvanillaplus.method.crying;

public class CryingActiveTickCondition_Method {
	public static boolean execute(double amplifier, double duration) {
		double baseRate = 0;
		double rateWithAmplifier = 0;
		baseRate = 22;
		rateWithAmplifier = baseRate / Math.pow(2, amplifier);
		if (Math.floor(rateWithAmplifier) > 0) {
			return duration % Math.floor(rateWithAmplifier) == 0;
		}
		return true;
	}
}
