package main.java;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class UsoJSOUP {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/9828ef4989632378cb01f05c18a0ca3a47781f777d705291ec60422ef13d871c").get();
        Elements newHeadlines1 = doc.select("div.CurrentConditions--phraseValue--2Z18W");
        Elements newHeadlines2 = doc.select("span.CurrentConditions--tempValue--3a50n");

        System.out.println("Hoy está " + newHeadlines1 + "y hace"+ newHeadlines2);

    }

    //<span data-testid="TemperatureValue" class="CurrentConditions--tempValue--3a50n">19°</span>
    //<div data-testid="wxPhrase" class="CurrentConditions--phraseValue--2Z18W">Soleado</div>
}
