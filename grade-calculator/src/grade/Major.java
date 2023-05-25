package grade;


public enum Major {
    KOREAN_LANGUAGE_AND_KOREAN_LITERATURE("국어국문학과", Subject.KOREAN), _COMPUTER_SCIENCE("컴퓨터공학과", Subject.MATH);

    private String name;
    private Subject requiredSubject;

    Major(String name, Subject requiredSubject) {
        this.name = name;
        this.requiredSubject = requiredSubject;
    }

    public boolean isRequired(Subject subject) {
        return this.requiredSubject.equals(subject);
    }

    public Subject getRequiredSubject() {
        return requiredSubject;
    }

    public String getName() {
        return name;
    }
}
