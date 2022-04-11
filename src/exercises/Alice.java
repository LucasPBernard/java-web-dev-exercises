package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
    Alice myFirstAlice = new Alice();
    String searchTerm = myFirstAlice.getUsersSearchTerm();
    Boolean myReturnedResult = myFirstAlice.searchAliceQuote(searchTerm);
    System.out.println("The result is: " + myReturnedResult.toString());
    }

    public String getUsersSearchTerm() {
        Scanner scanner = new Scanner(System.in);
        String searchTerm = scanner.nextLine();
        scanner.close();
        return searchTerm;
    }

    public boolean searchAliceQuote(String searchTerm) {
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();
        Boolean result = theQuoteLowerCase.contains(searchTermLowerCase);
        return result;
    }
}
