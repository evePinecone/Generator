package ua.khpi.pinecone.polynomial;

public class PolynomialEntity {

    private String name;
    private String j;

    public PolynomialEntity(String j, String name) {
        this.name = name;
        this.j = j;
    }

    public String getName() {
        return name;
    }

    public String getJ() {
        return j;
    }

    @Override
    public String toString() {
        return j + " " + name;
    }

}
