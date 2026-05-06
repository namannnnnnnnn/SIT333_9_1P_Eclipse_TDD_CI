package ontrack;

public class OnTrackStatus {

    public static String getTaskStatusMessage(String status) {

        if (status.equals("Submitted")) {
            return "Your task has been submitted successfully.";
        } else if (status.equals("In Review")) {
            return "Your task is currently being reviewed by tutor.";
        } else if (status.equals("Completed")) {
            return "Your task has been completed.";
        } else if (status.equals("Need Resubmission")) {
            return "Your task needs resubmission.";
        } else {
            return "Invalid task status.";
        }
    }
}