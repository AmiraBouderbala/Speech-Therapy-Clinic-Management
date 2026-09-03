public enum CatQuestionEnfant {
    STRUCTURE_FAMILIALE("structure familiale"),
    DYNAMIQUE_FAMILIALE("dynamique familiale"),
    ANTECEDENTS_FAMILIAUX("antecedents familiaux"),
    CONDITIONS_NATALES("developpement psychmoteur"),
    DEVELOPPEMENT_LANGAGIER("developpement langagier"),
    CARACTERE("caractere"),
    COMPORETEMENT("comporetement");

    private  String categorieName;

    private CatQuestionEnfant(String categorieName) {
        this.categorieName = categorieName;
    }

    public String getDisplayName() {
        return categorieName;
    }
}
