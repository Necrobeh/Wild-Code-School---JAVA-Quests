public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstname(String value) {
        this.firstname = value;
    }

    public void setAwareness(boolean value) {
        this.aware = value;
    }

    public void whoAmI() {
        if (this.isAware()) {
            String result = "Je m'appelle " + this.getFirstname() + " et je suis aware";
            System.out.println(result);
        } else {
            String result = "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
            System.out.println(result);
        }
    }
}
