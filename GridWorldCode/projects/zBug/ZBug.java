import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
	private int turns = 0;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
		setDirection(90);
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
		if (turns <= 2) {
			if (steps < sideLength && canMove())
			{
				move();
				steps++;
			}
			else
			{
				if (getDirection() == 90) {
				setDirection(225);
				turns += 1;
				}
				else if (getDirection() == 225) {
				setDirection(90);
				turns += 1;
				}
				
				steps = 0;
			}
		}
    }
}

