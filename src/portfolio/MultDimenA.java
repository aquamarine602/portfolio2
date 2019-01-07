package portfolio;

import static java.lang.System.out;

public class MultDimenA {

	public static void main(String[] args) {
		// int table[][] = new int[10][20];	// a table that is 10x2
		
		// 3x4 table
		int t,i;
		int table[][] = new int[3][4];
		for (t = 0; t < 3; ++t) {
			for (i = 0; i < 4; ++i) {
				table[t][i] = (t*4) + i + 1;
				out.println(table[t][i] + "\t");
				}
			out.println(); 
			}

		out.println();
		
		// multi dimensioned list
		int list[][] = new int[3][];
		list[0] = new int[42];
		list[1] = new int[10];
		list[2] = new int[49];
		list[0][0] = 12;
		
		// creates movie list with 2 dimensions -- 3 lists w/ mult items in one
		String movielist[][] = new String[3][];
		
		// list 0 w/ 10 items
		movielist[0] = new String [10];		
		movielist[0][0] = "The Phantom Menace";
		movielist[0][1] = "Attack of the Clones";
		movielist[0][2] = "Revenge of the Sith";
		movielist[0][3] = "A New Hope";
		movielist[0][4] = "Empire Strikes Back";
		movielist[0][5] = "Return of the Jedi";
		movielist[0][6] = "The Force Awakens";
		movielist[0][7] = "Rogue One";
		movielist[0][8] = "The Last Jedi";
		movielist[0][9] = "Solo";
		
		// list 1 w/ 9 items
		movielist[1] = new String [9];
		movielist[1][0] = "Fantastic Beasts and Where to Find Them";
		movielist[1][1] = "Crimes of Grindelwald";
		movielist[1][2] = "Harry Potter and the Sorcerer's Stone";
		movielist[1][3] = "Harry Potter and the Chamber of Secrets";
		movielist[1][4] = "Harry Potter and the Prisoner of Azkaban";
		movielist[1][5] = "Harry Potter and the Goblet of Fire";
		movielist[1][6] = "Harry Potter and the Order of the Pheonix";
		movielist[1][7] = "Harry Potter and the Half Blood Prince";
		movielist[1][8] = "The Cursed Child";
		
		// list 2 w/ 10 items
		movielist[2] = new String [9];
		movielist[2][0] = "I. Arena";
		movielist[2][1] = "II. Daggerfall";
		movielist[2][2] = "III. Morrowind";
		movielist[2][3] = "IV. Oblivion";
		movielist[2][4] = "V. Skyrim";
		movielist[2][5] = "Elder Scrolls Online";
		movielist[2][6] = "Redguard";
		movielist[2][7] = "Elder Scrolls Legends";
		movielist[2][8] = "Blades";
		
		// for each item in movielist 0
		for (String title: movielist[0]) {
			out.println(title);
		}
		
		out.println();
		
		// for each item in movielist 1
		for (String title: movielist[1]) {
			out.println(title);
		}
		
		out.println();
		
		// for each item in movielist 2
		for (String title: movielist[2]) {
			out.println(title);
		}
	}

}
