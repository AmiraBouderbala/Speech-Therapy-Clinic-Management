public enum CatQuestionAdulte {
    HISTOIRE_MALADIE("L'histoire de sa maladie"),
    SUIVI_MEDICAL("suivi medicale");

    private  String categorieName;

    // Correction du constructeur
    private CatQuestionAdulte(String categorieName) {
        this.categorieName = categorieName;
    }

    public String getCategorieName() {
        return categorieName;
    }
}
