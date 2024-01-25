package model;

public class Presentation {
    
    private String presentation;
    private String volume;

    public Presentation() {
    }

    public Presentation(String presentation, String volume) {
        this.presentation = presentation;
        this.volume = volume;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
    
    public Object[] toArrayPresentation() {
        return new Object[]{presentation, volume};
    }

}
