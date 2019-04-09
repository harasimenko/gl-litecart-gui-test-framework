package pagefactory.pages.enums;

public enum Tab {
    APPEARENCE("Appearence"),
    CATALOG("Catalog"),
    COUNTRIES("Countries");

    private String name;

    Tab(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
