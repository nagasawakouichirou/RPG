public class RPG {
	public static void main(String[] args) {

		Ossans x = new Ossans();

		x.name ="青いおっさんです！";
		x.hp = 1;
		x.mp = 3;

		Ossans x1 = new Ossans();

		x1.name ="赤いおっさんです！";
		x1.hp = 7000000;
		x1.mp = 9000000;

		x.introduce();
		x1.introduce();
	}
}