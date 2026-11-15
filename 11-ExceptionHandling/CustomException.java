class InvalidScoreException extends Exception {
    InvalidScoreException(String message) {
        super(message);
    }
}

public class CustomException {
    private static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score must be between 0 and 100.");
        }

        System.out.println("Score is valid.");
    }

    public static void main(String[] args) {
        try {
            validateScore(120);
        } catch (InvalidScoreException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
