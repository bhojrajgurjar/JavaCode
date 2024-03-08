package GenericsExample;

public class Main {
    public static void main(String ar[]){
        Student<String> ram = new Student<String>("Fired");
        ram.showGrade();

        Student<Character> shyam = new Student<Character>('F');
        shyam.showGrade();

        Student<Integer> rohit = new Student<Integer>(8);
        rohit.showGrade();

        Student<Float> Krishna = new Student<Float>(5.5f);
        Krishna.showGrade();
    }
}
