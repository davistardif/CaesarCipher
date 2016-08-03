
public class Message {
	private char[] message;
	private int length;
	private int shift;
	public Message(String message)
	{
		this.message = message.toCharArray();
		this.length = message.length();
		this.shift = 0;
	}

	public void encrypt (int shift)
	{
	for (int i = 0; i < this.length; i++)
		this.message[i] = (char) ((int) this.message[i] + shift);
	this.shift += shift;
	}
	public void decrypt ()
	{
		for (int i = 0; i < this.length ; i++)
			this.message[i] = (char)((int) this.message[i] - this.shift);
	}
	public String toString ()
	{
		String total = "";
		for (char c : this.message)
			total += c;
		return total;
	}
	public String decryptGuess(int shift)
	{
		this.encrypt(-1 * shift);
		return "" + shift + "\t" + this.toString();
	}
}

