package LLD.DesignPattern.BehavioralDesignPattern.MementoPattern.Traditional;

public class Write {
    static void main() {
        TextEditor textEditor = new TextEditor();
        textEditor.write("I am Sayan");
        textEditor.showText();
        textEditor.save();
        textEditor.write(" Shil");
        textEditor.showText();
        textEditor.undo();
        textEditor.showText();
        textEditor.write(" Sahoo");
        textEditor.showText();
    }
}
