public enum Seasons {
    Winter("Зима", -15),
    Spring("Весна", +10),
    Summer("Лето", +25){
        public String getDescription(){
            String description = "Тёплое время года";
            return description;
        }
    },
    Autumn("Осень", +10);

    private int temperature;
    private String seasonName;
    Seasons (String seasonName, int temperature ){
        this.seasonName = seasonName;
        this.temperature = temperature;
    }

    public void getSeason(){
        switch (this.seasonName){
            case "Зима":
                System.out.println("Я люблю зиму");
                break;
            case "Весна":
                System.out.println("Я люблю весну");
                break;
            case "Лето":
                System.out.println("Я люблю лето");
                break;
            case "Осень":
                System.out.println("Я люблю осень");
                break;
        }
    }
    public String getSeasonName(){
        return this.seasonName;
    }
    public int getTemperature(){
        return this.temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public String getDescription(){
        String description = "Холодное время года";
        return description;
    }
}
