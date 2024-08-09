import java.util.EventObject;

public class ScoreEvent extends EventObject {

    private String liveScore;

    public ScoreEvent(Object source, String liveScore) {
        super(source);
        this.liveScore = liveScore;
    }

    public String getLiveScore(){
        return liveScore;
    }
    
}
