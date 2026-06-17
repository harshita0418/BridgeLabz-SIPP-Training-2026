import java.util.*;

public class EmployeeSkillAssignment {
    public static void findTeams(int[] scores, int target, int index,
                                  List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < scores.length; i++) {
            if (scores[i] <= target) {
                current.add(scores[i]);
                findTeams(scores, target - scores[i], i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] scores = {2, 3, 5, 7};
        int target = 10;
        List<List<Integer>> result = new ArrayList<>();
        findTeams(scores, target, 0, new ArrayList<>(), result);
        System.out.println(result);
    }
}