package LLD.DesignPattern.BehavioralDesignPattern.MementoPattern.StoreRestorationMechanism;

import java.util.Stack;

public class EditorHistory {
    private Stack<Memento> undoOpt = new Stack<>();
    private Stack<Memento> redoOpt = new Stack<>();

    public void push(Memento memento){
        undoOpt.push(memento);
        if (!redoOpt.isEmpty()) {
            redoOpt.pop();
        }

    }
    public Memento pop(){
       if(!undoOpt.isEmpty()){
          return redoOpt.push(undoOpt.pop());
       }
       return null;
    }
}
