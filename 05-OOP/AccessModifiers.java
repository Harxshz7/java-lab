public class AccessModifiers {
    public String publicMessage = "Public members are widely accessible.";
    protected String protectedMessage = "Protected members support inheritance.";
    String defaultMessage = "Default members are package accessible.";
    private String privateMessage = "Private members belong to this class.";

    public String getPrivateMessage() {
        return privateMessage;
    }

    public static void main(String[] args) {
        AccessModifiers example = new AccessModifiers();
        System.out.println(example.publicMessage);
        System.out.println(example.protectedMessage);
        System.out.println(example.defaultMessage);
        System.out.println(example.getPrivateMessage());
    }
}
