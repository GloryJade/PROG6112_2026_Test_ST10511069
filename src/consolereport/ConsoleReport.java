package consolereport;

public class ConsoleReport {

    public static void main(String[] args) {
        // Single-dimensional arrays for headings and rows
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array holding console sales per city
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town sales
            {2000, 3000, 4000}, // Port Elizabeth sales
            {1500, 1100, 1200}  // Pretoria sales
        };

        // Display the main report table header
        System.out.println("---------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-18s%-12s%-12s%-12s%n", "", consoles[0], consoles[1], consoles[2]);

        // Loop through array to print sales per console
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%-12d%-12d%-12d%n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        // Section for city totals
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        // Calculate sales totals for each city and track the highest seller
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.printf("%-18s%d%n", cities[i], cityTotal);

            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

        // Print top selling city summary
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("---------------------------------------------------------------");
    }
}