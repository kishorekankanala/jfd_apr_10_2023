package day2;

public class CabBookingapp {
    public static void main(String[] args) {
        int totalCount = 22;
        int capacity = 4;
        int totalCabsRequired = totalCount / capacity;
        if(totalCount % capacity != 0){
            totalCabsRequired = totalCabsRequired+1;
        }
        else if (totalCount % capacity == 0){
            totalCabsRequired = totalCabsRequired;
        }
        System.out.println("number of cabs need to book "+totalCabsRequired);

    }
}
