package ac.za.cput.domain.demography;

public class Race {

    private String raceId, description;

    private Race(){}

    public Race(Builder builder)
    {
        this.raceId = builder.raceId;
    }

    public String getRaceId()
    {
        return raceId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setRaceId(String raceId)
    {
        this.raceId = raceId;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public static class Builder{
        private String raceId, description;

        public Builder raceId(String raceId)
        {
            this.raceId = raceId;
            return this;
        }

        public Builder description(String description)
        {
            this.description = description;
            return this;
        }

        public Race build()
        {
            return new Race(this);
        }

        public Builder copy(Race race)
        {
            this.raceId = raceId;
            this.description = description;
            return this;
        }
    }
}
