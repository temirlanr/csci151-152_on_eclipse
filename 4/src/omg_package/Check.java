package omg_package;

public class Check {
	public static void main(String[] args) throws Exception  {
		
			IPhone iPhone= new IPhone(1000,10,"Space Grey","plus");
				iPhone.dropDevice();
				iPhone.customize("Silver", 128);
				iPhone.helloSiri();
				System.out.println(iPhone);
				
			IPad iPad= new IPad(700,3,"Space Grey","regular");
				iPad.jailBreakDevice();
				iPad.drawSomething();
				iPad.customize("Black", true);
				System.out.println(iPad);
				
			IPod iPod= new IPod(500,5,"Space Grey","plus");
				iPod.jailBreakDevice();
				iPod.setMusic("I've heard there was a secret chord\r\n" + 
						"That David played, and it pleased the Lord\r\n" + 
						"But you don't really care for music, do you?\r\n" + 
						"It goes like this\r\n" + 
						"The fourth, the fifth\r\n" + 
						"The minor fall, the major lift\r\n" + 
						"The baffled king composing Hallelujah\r\n" + 
						"\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"\r\n" + 
						"Your faith was strong but you needed proof\r\n" + 
						"You saw her bathing on the roof\r\n" + 
						"Her beauty in the moonlight overthrew you\r\n" + 
						"She tied you to a kitchen chair\r\n" + 
						"She broke your throne, and she cut your hair\r\n" + 
						"And from your lips she drew the Hallelujah\r\n" + 
						"\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"\r\n" + 
						"Baby I have been here before\r\n" + 
						"I know this room, I've walked this floor\r\n" + 
						"I used to live alone before I knew you.\r\n" + 
						"I've seen your flag on the marble arch\r\n" + 
						"Love is not a victory march\r\n" + 
						"It's a cold and it's a broken Hallelujah\r\n" + 
						"\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"\r\n" + 
						"There was a time when you let me know\r\n" + 
						"What's really going on below\r\n" + 
						"But now you never show it to me, do you?\r\n" + 
						"And remember when I moved in you\r\n" + 
						"The holy dove was moving too\r\n" + 
						"And every breath we drew was Hallelujah\r\n" + 
						"\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"\r\n" + 
						"Maybe there’s a God above\r\n" + 
						"But all I’ve ever learned from love\r\n" + 
						"Was how to shoot at someone who outdrew you\r\n" + 
						"It’s not a cry you can hear at night\r\n" + 
						"It’s not somebody who has seen the light\r\n" + 
						"It’s a cold and it’s a broken Hallelujah\r\n" + 
						"\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"\r\n" + 
						"You say I took the name in vain\r\n" + 
						"I don't even know the name\r\n" + 
						"But if I did, well really, what's it to you?\r\n" + 
						"There's a blaze of light in every word\r\n" + 
						"It doesn't matter which you heard\r\n" + 
						"The holy or the broken Hallelujah\r\n" + 
						"\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"\r\n" + 
						"I did my best, it wasn't much\r\n" + 
						"I couldn't feel, so I tried to touch\r\n" + 
						"I've told the truth, I didn't come to fool you\r\n" + 
						"And even though it all went wrong\r\n" + 
						"I'll stand before the Lord of Song\r\n" + 
						"With nothing on my tongue but Hallelujah\r\n" + 
						"\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah, Hallelujah\r\n" + 
						"Hallelujah");
				System.out.println(iPod.getMusic());
				iPod.customize("Gold",  true);
				System.out.println(iPod);
		
	}
}
