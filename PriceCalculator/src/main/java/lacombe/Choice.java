package lacombe;

import java.util.Arrays;
import java.util.Optional;

public enum Choice {
    SINGLE("Single", 610),
    TWIN("Twin", 510),
    TRIPLE("Triple", 410),
    NO_ACCOMMODATION("No Accommodation", 240),
    DEFAULT("Error", -1);

    private String name;
    private long price;

    Choice(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public static Choice getChoice(String strChoice) {
        Optional<Choice> choice = Arrays.stream(Choice.values())
                .filter(c -> c.getName().equalsIgnoreCase(strChoice))
                .findFirst();
        if(choice.isPresent()){
            return choice.get();
        }
        return Choice.DEFAULT;

    }

    public long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


}
