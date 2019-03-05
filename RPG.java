public class RPG {
	public static void main(String[] args) {

		Ossan x = new Ossan();

		x.name ="青いおっさん";
		x.hp = 1;
		x.mp = 3;
		x.mp = 3;
		x.syoukai ="レベル1です!" ;

		Ossan x1 = new Ossan();

		x1.name ="赤いおっさん";
		x1.hp = 7000000;
		x1.mp = 9000000;
		x1.syoukai ="レベル12です!" ;

		x.introduce();
		x1.introduce();
	}
}