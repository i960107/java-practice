package grade;

// TODO: 2023/05/24 grade policy를 인터페이스로 추상화할 필요 있을까? policy는 subject가 포함해야할까 student가 포함해야할까? 과목별로 매번 다른 정책이 실행될 수 있도록 -> 정책을 매개변수로 받기
public interface GradePolicy {
    String calculateGrade(int score);
}
