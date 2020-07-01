package CoachingCompany;

public class StudentNote {
    private  double Note;

    public StudentNote() {
    }

    public StudentNote(double note) {
        Note = note;
    }

    public double getNote() {
        return Note;
    }

    public void setNote(double note) {
        Note = note;
    }

    @Override
    public String toString() {
        return "StudentNote{" +
                "Note=" + Note +
                '}';
    }
}
