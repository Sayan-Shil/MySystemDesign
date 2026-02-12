package LLD.DesignPattern.BehavioralDesignPattern.MementoPattern.StoreRestorationMechanism;

import java.util.Stack;

public class SpecialEditorHistory {

    private final Stack<Memento> undoOpt = new Stack<>();
    private final Stack<Memento> redoOpt = new Stack<>();

    public void push(Memento memento) {
        undoOpt.push(memento);
        redoOpt.clear();
    }

    public Memento undo() {
        if (!undoOpt.isEmpty()) {
            Memento m = undoOpt.pop();
            redoOpt.push(m);
            return m;
        }
        return null;
    }

    public Memento redo() {
        if (!redoOpt.isEmpty()) {
            Memento m = redoOpt.pop();
            undoOpt.push(m);
            return m;
        }
        return null;
    }
}
