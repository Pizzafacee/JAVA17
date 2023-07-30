package chapter24;

public enum Season implements InterfaceA{
    SPRING("CHUNTIAN", "WENNUAN"){
        @Override
        public void show() {
            System.out.println("单独重写");
        }
    },
    SUMMER("XIATIAN", "YANRE"){
        @Override
        public void show() {
            System.out.println("单独重写2");
        }
    };
    private final String NAME;
    private final String DESC;

    Season(String NAME, String DESC) {
        this.NAME = NAME;
        this.DESC = DESC;
    }

    public String getNAME() {
        return NAME;
    }

    public String getDESC() {
        return DESC;
    }

    @Override
    public void show() {
        System.out.println("重写公用");
    }
}
