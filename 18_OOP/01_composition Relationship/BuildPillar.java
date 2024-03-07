class BuildPillar
{
	public static void main(String[] args) {
		Building b = new Building(11,65,500,new Pillar(15,50,"Rectangle",1834));
		b.displayBuilding();
		b.pillar.displayPillar();
	}
}