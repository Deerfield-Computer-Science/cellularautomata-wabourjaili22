public class Cow extends Plant {
	
	public Cow(Location l, World w) {
		super(l,w);
		myLifeSpan = 30;
	}
	
	public void reproduce() {
		// minimum = 2 neighbors
		//maximum = 7 neighbors
		//must eat once every 2 turns
		//3 neighbors makes a cow
		//the oldest cow gets to move first
		
		myWorld.getCreatureList().add(new Cow(new Location(newX,newY), myWorld));
	}

}
