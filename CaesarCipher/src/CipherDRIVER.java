
public class CipherDRIVER {
	public static void main(String[] args)
	{
	Message message = new Message("Sample Text");
	System.out.println(message.toString());
	message.encrypt(4); //encrypts the message with a shift of 4
	System.out.println(message);
	message.decryptGuess(2); //guesses that the shift is 2
	System.out.println(message);
	message.decrypt(); //decrypts the message regardless of any guesses
	System.out.println(message);
	}
}
