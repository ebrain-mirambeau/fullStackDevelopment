package musicalStuff;

public interface MusicalInstrument {
	public static final String PLAY_MSG = "";
	boolean isBroke();
	void repair();
	void demo();
	void instrumentName();
	void play(String string);
	void playMsg();
}
