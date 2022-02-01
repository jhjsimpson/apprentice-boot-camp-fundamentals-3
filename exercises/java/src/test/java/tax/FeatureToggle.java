package tax;

public class FeatureToggle {

    private boolean story_4;
    private boolean story_5;

    public boolean storyFourFeatureToggle() {
        return story_4;
    }

    public void storyFourFeatureToggle(boolean activeTest) {

        this.story_4 = activeTest;
    }

    public void storyFiveFeatureToggle(boolean story_5) {
        this.story_5 = story_5;
    }
}
