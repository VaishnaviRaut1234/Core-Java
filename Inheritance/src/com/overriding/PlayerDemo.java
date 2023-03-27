package com.overriding;

class Player
{
	void display()
	{
		System.out.println("I am a Player");
	}
}
	class HockyPlayer extends Player
	{
		public void display()
		{
			System.out.println("I am a Hockey Player");
		}
	}
	
	class FootballPlayer extends Player
	{
		public void display()
		{
			System.out.println("I am a Football Player");
		}
	}


public class PlayerDemo {

	public static void main(String[] args) 
	{
		Player p1;
		p1 = new FootballPlayer();
		p1.display();

	}

}
