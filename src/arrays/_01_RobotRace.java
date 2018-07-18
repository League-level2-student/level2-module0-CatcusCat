package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		int setX = 10;
		int setY = 500;
		int smallY = 500;
		int winner = 0;
		int speed = 0;
		// 2. create an array of 5 robots.
		Robot[] robotList = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robotList.length; i++) {
			setX += 100;
			robotList[i] = new Robot(setX, setY);
			robotList[i].miniaturize();
			robotList[i].sparkle();
			robotList[i].setSpeed(200);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		while (smallY > 0) {
			for (int i = 0; i < robotList.length; i++) {
				Random r = new Random();
				speed = r.nextInt(2);
				robotList[i].move(speed);
				if (robotList[i].getY() < smallY) {
					smallY = robotList[i].getY();
					System.out.println(smallY);
					winner = i;
				}
			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		winner += 1;
		System.out.println("The winner is robot " + winner + "!");
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
