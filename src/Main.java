public class Main {
    public static void main(String[] args) {

        Seasons favoriteSeason = Seasons.Winter;
        System.out.printf("%s - холодное время года, а я не люблю жару.%n", favoriteSeason.getSeasonName());
        favoriteSeason.getSeason();
        favoriteSeason.setTemperature(-30);
        Seasons[] seasons = Seasons.values();

        for (int i = 0; i < seasons.length; i++){
            System.out.printf("%s. Средняя температура: %d. %s.%n",seasons[i].getSeasonName(), seasons[i].getTemperature(), seasons[i].getDescription());
        }

    }
}