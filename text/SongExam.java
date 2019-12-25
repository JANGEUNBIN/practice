package practice;

public class SongExam {
	public static void main(String[] args) {
	  Song song = new Song();
	  song.songTitle = new String("곡명");
	  song.singer = new String("가수");
	  song.albumName = new String("앨범");
	  song.trackNumber = 5;

	  song.songTitle = "君の名は。";
	  song.singer = "John Cena!!!!!";
	  song.albumName = "fakeダヨ best collection";
	  song.trackNumber = 1;


	 System.out.println(song.songTitle);
	 System.out.println(song.singer);
	 System.out.println(song.albumName);
	 System.out.println(song.trackNumber);

	 song.songTitle = "Sparkle";
	 song.singer = "RADだと思った？Johnダヨ";
	 song.albumName = "fakeダヨ best collection <2>";
	 song.trackNumber = 2;
	 
	 System.out.println(song.songTitle);
	 System.out.println(song.singer);
	 System.out.println(song.albumName);
	 System.out.println(song.trackNumber);
	 
    }
}