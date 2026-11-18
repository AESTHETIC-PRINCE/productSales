package productsales;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ProductSalesTest {
private final int[][] data = {{300, 150, 700}, {250, 200, 600}};
private final ProductSales productSales = new ProductSales();
@Test
void CalculateTotalSales_ReturnsTotalSales() {
assertEquals(2200, productSales.TotalSales(data));
}
@Test
void AverageSales_ReturnsAverageProductSales() {
assertEquals(366.67, productSales.AverageSales(data), 0.01);
}
}
