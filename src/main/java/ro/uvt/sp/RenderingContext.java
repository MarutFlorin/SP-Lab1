package ro.uvt.sp;

public class RenderingContext {
    private int nrOfCharacters;

    public RenderingContext(int nrOfCharacters){
        this.nrOfCharacters = nrOfCharacters;
    }

    public int getNrOfCharacters() {
        return nrOfCharacters;
    }

    public void setNrOfCharacters(int nrOfCharacters) {
        this.nrOfCharacters = nrOfCharacters;
    }
}
