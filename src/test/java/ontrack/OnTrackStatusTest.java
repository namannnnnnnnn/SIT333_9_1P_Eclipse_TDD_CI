package ontrack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OnTrackStatusTest {

    @Test
    public void testSubmittedStatus() {
        String result = OnTrackStatus.getTaskStatusMessage("Submitted");
        assertEquals("Your task has been submitted successfully.", result);
    }

    @Test
    public void testInReviewStatus() {
        String result = OnTrackStatus.getTaskStatusMessage("In Review");
        assertEquals("Your task is currently being reviewed by tutor.", result);
    }

    @Test
    public void testCompletedStatus() {
        String result = OnTrackStatus.getTaskStatusMessage("Completed");
        assertEquals("Your task has been completed.", result);
    }

    @Test
    public void testResubmissionStatus() {
        String result = OnTrackStatus.getTaskStatusMessage("Need Resubmission");
        assertEquals("Your task needs resubmission.", result);
    }

    @Test
    public void testInvalidStatus() {
        String result = OnTrackStatus.getTaskStatusMessage("Random");
        assertEquals("Invalid task status.", result);
    }
}