package LLD.DesignPattern.BehavioralDesignPattern.MementoPattern.StoreRestorationMechanism;

public class TextEditing {
    static void main() {
        TextEditor textEditing = new TextEditor();
        EditorHistory editorHistory = new EditorHistory();

        textEditing.setText("Hello World");
        System.out.println("Current Text "+textEditing.getText());
        editorHistory.push(textEditing.save());

        textEditing.setText("I am Sayan Shil");
        System.out.println("Current Text "+textEditing.getText());
        editorHistory.push(textEditing.save());

        Memento memento = editorHistory.pop();
        textEditing.restore(memento);
        System.out.println("Current Text "+textEditing.getText());

        Memento memento2 = editorHistory.pop();
        textEditing.restore(memento2);
        System.out.println("Current Text "+textEditing.getText());

    }
}
