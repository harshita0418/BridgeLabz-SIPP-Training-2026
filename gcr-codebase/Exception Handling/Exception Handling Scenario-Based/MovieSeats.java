public class MovieSeats {
    static int[] seats = {101, 102, 103, 104, 105};

    static int getSeat(int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Seat position " + index + " does not exist.");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getSeat(2));
        System.out.println(getSeat(8));
    }
}