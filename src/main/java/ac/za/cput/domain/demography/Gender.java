package ac.za.cput.domain.demography;

public class Gender {

    private String genderId, description;

    private Gender(){}

    public Gender(Builder builder)
    {
        this.genderId = builder.genderId;
        this.description = builder.description;
    }

    public String getGenderId()
    {
        return genderId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setGenderId(String genderId)
    {
        this.genderId = genderId;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public static class Builder{
        private String genderId, description;

        public Builder genderId(String genderId)
        {
            this.genderId = genderId;
            return this;
        }

        public Builder description(String description)
        {
            this.description = description;
            return this;
        }

        public Gender build()
        {
            return new Gender(this);
        }

        public Builder copy(Gender gender)
        {
            this.genderId = genderId;
            this.description = description;
            return this;
        }
    }
}
