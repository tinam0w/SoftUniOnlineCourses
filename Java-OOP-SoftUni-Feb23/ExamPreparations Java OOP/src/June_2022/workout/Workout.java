package June_2022.workout;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (this.exerciseCount > 0) {
            this.exerciseCount--;
            this.exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        if (exercises.size() > 0) {
            for (Exercise exercise : exercises) {
                if (exercise.getName().equals(name)
                        && exercise.getMuscle().equals(muscle)) {
                    exerciseCount++;
                    return exercises.remove(exercise);
                }
            }
        }
        return false;
    }

    public Exercise getExercise(String name, String muscle) {
        if (exercises.size() > 0) {
            for (Exercise exercise : exercises) {
                if (exercise.getName().equals(name)
                        && exercise.getMuscle().equals(muscle)) {
                    return exercise;
                }
            }
        }
        return null;
    }

    public Exercise getMostBurnedCaloriesExercise() {
        if (exercises.size() > 0) {
            int maxBurnedCals = -1;
            Exercise exerciseToReturn = new Exercise();
            for (Exercise exercise : exercises) {
                if (exercise.getBurnedCalories() > maxBurnedCals) {
                    maxBurnedCals = exercise.getBurnedCalories();
                    exerciseToReturn = exercise;
                }
            }
            return exerciseToReturn;
        }
        return null;
    }

    public int getExerciseCount() {
        return exercises.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("Workout type: ").append(this.getType()).append(System.lineSeparator());
        if (this.exercises.size() > 0) {
            for (Exercise exercise : exercises) {
                sb.append("Exercise: ").append(exercise).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public String getType() {
        return type;
    }
}