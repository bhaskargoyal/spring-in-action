package chapter.oneTwoThree.ex1;

/**
 * @author bgoyal
 */
public class BraveKnight implements Knight {

    Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
