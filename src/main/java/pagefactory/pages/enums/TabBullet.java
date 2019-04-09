package pagefactory.pages.enums;

public enum TabBullet {
    TEMPLATE("doc-template"),
    LOGOTYPE("doc-logotype"),
    CATALOG("doc-catalog");

    private String name;

    TabBullet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
