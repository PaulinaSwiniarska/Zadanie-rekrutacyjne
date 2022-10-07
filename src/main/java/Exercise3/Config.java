package Exercise3;
class Config {


    private final String baseAPIUrl;


    private Config(String baseAPIUrl) {
        this.baseAPIUrl = baseAPIUrl;
    }

    static Config getInstance() {
        Config config = null;
        if (config == null) {
            config = new Config("https://kanye.rest/");
        }
        return config;
    }

    public String getKayneRestQuote(String quote) {
        return quote;
    }
}