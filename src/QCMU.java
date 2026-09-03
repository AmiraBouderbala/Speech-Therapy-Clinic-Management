public class QCMU extends Question {
    private String[] tabchoice;
    private boolean type;
    public QCMU(String[] tabchoice, String quest) {
        super(quest);
        this.tabchoice = tabchoice;
    }

    public void SetTab(String[] tabchoice) {
        this.tabchoice = tabchoice;
    }
    public String[] GetTab() {
        return this.tabchoice;
    }
    public boolean GetType() {
        return this.type;
    }
    public void SetType(boolean type ) {
        this.type = type;
    }

}
