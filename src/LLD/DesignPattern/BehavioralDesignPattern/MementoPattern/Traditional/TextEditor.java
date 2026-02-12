package LLD.DesignPattern.BehavioralDesignPattern.MementoPattern.Traditional;

public class TextEditor {

    StringBuilder s = new StringBuilder();
    StringBuilder saved;

    public void save() {
        saved = new StringBuilder(s);
    }

    public void undo() {
        if (saved != null) {
            s = new StringBuilder(saved);
        }
    }

    public void write(String text) {
        s.append(text);
    }

    public void showText() {
        System.out.println(s.toString());
    }
}

