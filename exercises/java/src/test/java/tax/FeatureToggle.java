package tax;

public class FeatureToggle {

    private boolean story_4;

    public boolean storyFourFeatureToggle() {
        return story_4;
    }

    public void storyFourFeatureToggle(boolean activeTest) {

        this.story_4 = activeTest;
    }
}
