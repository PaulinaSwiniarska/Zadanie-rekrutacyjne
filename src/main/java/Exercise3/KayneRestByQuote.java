package Exercise3;

class KayneRestByQuote extends KayneRest {

    KayneRestByQuote (String cityName) {
        super(cityName);
    }

    @Override
    public String getUrl() {
        return Config.getInstance().getKayneRestQuote(quote);
    }

    @Override
    public Class getClasz() {
        return null;
    }
}


