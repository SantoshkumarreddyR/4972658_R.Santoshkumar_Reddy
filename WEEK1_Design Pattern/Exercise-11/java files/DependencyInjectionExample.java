public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use service to find customer
        Customer customer = customerService.findCustomerById("123");
        System.out.println(customer);
    }
}
