public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken
                        + ". The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        Language English = new Language("english", 1, "Australia", "67");
        English.getInfo();

        Mayan Achi = new Mayan("Achi", 120000);
        Achi.getInfo();

        SinoTibetan MandarinChinese = new SinoTibetan("Mandarin Chinese", 918000000);
        MandarinChinese.getInfo();

        SinoTibetan Burmese = new SinoTibetan("Burmese", 32900000);
        Burmese.getInfo();
    }
}
