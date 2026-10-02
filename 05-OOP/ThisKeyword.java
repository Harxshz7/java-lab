public class ThisKeyword {
    private String name;
    private int score;

    ThisKeyword(String name, int score) {
        this.name = name;
        this.score = score;
    }

    ThisKeyword updateScore(int score) {
        this.score = score;
        return this;
    }

    void display() {
        System.out.println(name + " scored " + score);
    }

    public static void main(String[] args) {
        ThisKeyword result = new ThisKeyword("Isha", 80);
        result.updateScore(95).display();
    }
}
