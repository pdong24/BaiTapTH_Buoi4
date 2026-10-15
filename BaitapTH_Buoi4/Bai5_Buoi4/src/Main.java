public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> agePair = new Pair<>("Tuổi", 20);
        System.out.println(agePair);

        Pair<String, String> studentPair = new Pair<>("Mã SV", "SV001");
        System.out.println(studentPair);

        Pair<Integer, Double> locationPair = new Pair<>(105, 21.5);
        System.out.println(locationPair);

        // Tét lỗi
        // Pair<String, Integer> testPair = new Pair<>("Năm sinh", 2000);
        // testPair.setValue("Hai ngàn"); 
        // Compiler báo "Required type: Integer, Provided: String" ngay tại IntelliJ IDEA!
    }
}