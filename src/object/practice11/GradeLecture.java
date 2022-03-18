package object.practice11;

import static java.util.stream.Collectors.joining;

import java.util.Collection;
import java.util.List;

public class GradeLecture extends Lecture {

  private List<Grade> grades;

  public GradeLecture(String name, int pass, List<Grade> grades, List<Integer> scores) {
    super(name, pass, scores);
    this.grades = grades;
  }

  @Override
  public String evaluate() {
    return super.evaluate() + ", " + gradeStatistics();
  }

  private String gradeStatistics() {
    return grades.stream()
        .map(grade -> format(grade))
        .collect(joining(" "));
  }

  private String format(Grade grade) {
    return String.format("%s:%d", grade.getName(), gradeCount(grade));
  }

  private long gradeCount(Grade grade) {
    return getScores().stream().filter(grade::include).count();
  }

  private Collection<Integer> getScores() {
    return null;
  }
}
