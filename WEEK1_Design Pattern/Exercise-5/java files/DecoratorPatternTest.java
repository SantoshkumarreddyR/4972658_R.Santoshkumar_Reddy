public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send("Hello, World!");

        System.out.println("\nAdding SMS Notification:");
        notifier = new SMSNotifierDecorator(notifier);
        notifier.send("Hello, World!");

        System.out.println("\nAdding Slack Notification:");
        notifier = new SlackNotifierDecorator(notifier);
        notifier.send("Hello, World!");
    }
}
