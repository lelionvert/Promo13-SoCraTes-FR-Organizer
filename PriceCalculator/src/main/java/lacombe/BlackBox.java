package lacombe;

public class BlackBox {
    public static long calculatePrice(String input) {
        if (input.contains("Single")) {
            return 610;
        } else if (input.contains("No Accommodation")) {
            return 240;
        } else if (input.contains("Twin")){
            return 510;
        } else if (input.contains("Triple")) {
            return 410;
        } else {
            return 0;
        }
    }
}
