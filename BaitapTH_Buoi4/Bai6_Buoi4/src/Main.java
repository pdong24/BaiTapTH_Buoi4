public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {5, 1, 3, 2};
        ArrayUtils.sort(numbers);
        ArrayUtils.printArray(numbers);

        String[] languages = {"Java", "C++", "Python"};
        ArrayUtils.sort(languages);
        ArrayUtils.printArray(languages);

        Student[] students = {
                new Student("An", 3.8),
                new Student("Bình", 2.5),
                new Student("Cường", 3.2)
        };
        ArrayUtils.sort(students);
        ArrayUtils.printArray(students);
    }
}