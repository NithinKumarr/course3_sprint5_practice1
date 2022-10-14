public class StudentMarksImpl {
    public static void main(String[] args) {
        StudentMarks studentMarks=new StudentMarks();
        int ResultOfNonMedical = studentMarks.calculateMarks(88,88,99);
        System.out.println("Total Marks for Non Medical Students " +ResultOfNonMedical);
        int ResultOfMedical=studentMarks.calculateMarks(65,77,74,79);
        System.out.println("Total Marks for Medical Students " + ResultOfMedical);
        int resultOfCommerce= studentMarks.calculateMarks(77.88,88,99);
        System.out.println("Total Marks for Commerce Students " +resultOfCommerce);
    }
}
