
public interface MusicalInstrument {
	public static final String PLAY_MSG = "Playing a musical instrument";
	boolean isBroke();
	void repair();
	void demo();
	void instrumentName();
	void play(String string);
	public static void playMsg() {
		System.out.println(PLAY_MSG);
	};
}
