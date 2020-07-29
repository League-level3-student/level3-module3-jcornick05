package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funkifiedString = "";
		char upperCase;
		for (int i = 0; i < s.length(); i++) {
			upperCase = s.charAt(i);
			if(i%2==1) {
				upperCase = Character.toUpperCase(upperCase);
				funkifiedString = funkifiedString + upperCase;
			}else {
				upperCase = Character.toLowerCase(upperCase);
				funkifiedString = funkifiedString + upperCase;
			}

		}
		return funkifiedString;
	}

}