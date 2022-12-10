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

    public CD(String type, String ID, String band, String title, int numTracks)
    {
        super(type, ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    @Override
    public void calculatePrice() {

    }

}
