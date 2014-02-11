import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
    private int step;
	private int[] turnList;
	
    public DancingBug(int[] turn)
    {
        step = 0;
		turnList = turn;
    }
	
	public void turn(int repeat) {
		for (int i=0; i<repeat; i++) {
			turn();
		}
	}

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (step == turnList.length) step = 0;
		turn(turnList[step]);
		step += 1;
		super.act();
    }
}

