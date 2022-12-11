package Q1;
// Student Name 	: Gloria Zimmermann
// Student Id Number: C00290104
// Date 			: December 2022
// Purpose 			: Lab Exercise 9

public class CD extends LibraryItem implements LoanItem
{

    String band;
    String title;
    int numTracks;

    public CD(String ID, String band, String title, int numTracks)
    {
        super("CD", ID);
        setBand(band);
        setTitle(title);
        setNumTracks(numTracks);
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumTracks() {
        return numTracks;
    }

    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    @Override
    public float calculatePrice(int days) {
        return (float) (days * 0.2);
    }

    @Override
    public String toString() {
        return "You rented a CD " +
                "from '" + band + '\'' +
                " with the title '" + title + '\'' +
                "and " + numTracks +
                " tracks.";
    }
}
