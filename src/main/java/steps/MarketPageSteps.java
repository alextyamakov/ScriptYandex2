package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketPageSteps {

    @Step ("Выбран раздел Электроника{0}")
    public void selectStepElectronics(String itemName) {
        new MarketPage().selectSectionElectronics(itemName);
    }

    @Step ("Выбран раздел Наушники{0}")
    public void selectStepTv(String menuItem) {
        new MarketPage().selectSectionTv(menuItem);
    }

    @Step ("Выбран расширенный поиск{0}")
    public void selectStepAllFilters(String menuItem) {
        new MarketPage().selectButtonAllFilters(menuItem);
    }

    @Step ("Задан параметр поиска от 5000 рублей{0}")
    public void selectStepPrice(String value) {
        new MarketPage().fillFieldPrice(value);
    }

    @Step ("Нажата кнопка все бренды")
    public void selectStepAllBrands() { new MarketPage().selectAllBrands();    }

    @Step ("Выбран производитель Beats{0}")
    public void selectStepBrandS() {
        new MarketPage().selectCheckBoxSamsung();
    }

    @Step ("Нажата кнопку Применить{0}")
    public void selectStepFilterExecute() { new MarketPage().selectFilterExecute();
    }


}
