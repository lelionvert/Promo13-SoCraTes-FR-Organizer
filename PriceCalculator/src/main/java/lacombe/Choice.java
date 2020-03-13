package lacombe;

public enum Choice {
    SINGLE("Single", 610),
    TWIN("Twin", 510),
    TRIPLE("Triple", 410),
    NO_ACCOMMODATION("No Accommodation",240);

    private String name;
    private long price;

    Choice(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
