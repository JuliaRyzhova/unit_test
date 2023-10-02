package Shop;

public class Product implements Comparable {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        return cost == ((Product) obj).cost && title.equals(((Product) obj).title);
    }

    @Override
    public int hashCode() {
        return cost.hashCode() ^ title.hashCode();
    }

    @Override
    public int compareTo(Object obj) {
        return cost.compareTo(((Product) obj).cost);
    }

    @Override
    public String toString() {
        return "Продукт \"" + title + "\" стоимостью " + cost;
    }
}
