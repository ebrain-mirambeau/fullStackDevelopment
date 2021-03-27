package musicalStuff;

public class Violin implements StringInstrument {
	//private String PLAY_MSG = "Playing the violin";
	public Violin() {
		
	}
	@Override
	public void bow() {
		System.out.println("Bowing");
	}
	@Override
	public void pluck() {
		System.out.println("Plucking");
	}
	@Override
	public boolean isBroke() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void repair() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void instrumentName() {
		// TODO Auto-generated method stub
		System.out.println("Violin");
		
	}
	@Override
	public void play(String string) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playMsg() {
		// TODO Auto-generated method stub
		System.out.println("The violin is a hard instrument to play.");
		
		
	}

}
