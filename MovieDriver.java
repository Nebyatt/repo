import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable to control the loop
        boolean continueInput = true;

        while (continueInput) 
        {
            Movie movie = new Movie();

            // Prompt the user to enter the title of a movie
            System.out.println("Enter the title of the movie: ");
            String title = scanner.nextLine();
            movie.setTitle(title);

            // Prompt the user to enter the movie’s rating
            System.out.println("Enter the movie's rating: ");
            String rating = scanner.nextLine();
            movie.setRating(rating);

            // Prompt the user to enter the number of tickets sold at a (unnamed) theater
            System.out.println("Enter the number of tickets sold: ");
            int soldTickets = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt
            movie.setSoldTickets(soldTickets);

            // Print out the information using the movie’s toString method
            System.out.println("\nMovie Information:");
            System.out.println(movie.toString());

            // Ask the user if they want to continue
            System.out.println("\nDo you want to enter another movie? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) 
            {
                continueInput = false;
                System.out.println("Goodbye");
            }
        }

        scanner.close();
    }
}

