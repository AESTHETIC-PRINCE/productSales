package productsales;
public class ProductSalesReport {
public static void main(String[] args) {
String[] years = {"YEAR 1", "YEAR 2"};
String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};
int[][] sales = {
{300, 150, 700},
{250, 200, 600}
};
ProductSales ps = new ProductSales();
String line = "----------------------------------------";
System.out.println("PRODUCT SALES REPORT - 2025");
System.out.println(line);
System.out.printf("%-10s", "");
for (String q : quarters) {
System.out.printf("%-12s", q);
}
System.out.println();
for (int r = 0; r < sales.length; r++) {
System.out.printf("%-10s", years[r]);
for (int c = 0; c < sales[r].length; c++) {
System.out.printf("%-12d", sales[r][c]);
}
System.out.println();
}
System.out.println(line);
System.out.printf("Total sales: %d%n", ps.TotalSales(sales));
System.out.printf("Average sales: %.0f%n", ps.AverageSales(sales));
System.out.printf("Maximum sale: %d%n", ps.MaxSale(sales));
System.out.printf("Minimum sale: %d%n", ps.MinSale(sales));
System.out.println(line);
}
}
